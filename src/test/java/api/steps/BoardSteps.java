package api.steps;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import api.resources.Board;
import api.resources.Trello;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class BoardSteps {

    private Response response;
    private String apiKey = Trello.getKey();
    private String apiToken = Trello.getToken();
    private String apiPath = Trello.getPath();
    private String boardPath = Board.getPath();
    private String boardFields = Board.getFields();
    private String currentBoardId;
    private String currentBoardLink;

    @Step
    public void findABoardById(String boardId){
        response = SerenityRest
                .given()
                .queryParam("boardFields", boardFields)
                .queryParam("key", apiKey)
                .queryParam("token", apiToken)
                .get(apiPath + boardPath + boardId);
    }

    @Step
    public void actionIsExecutedSuccessfully(){
        response.then().statusCode(200);
    }

    @Step
    public void createABoardWithMinimalData(){
        response = SerenityRest
                .given()
                .queryParam("key", apiKey)
                .queryParam("token", apiToken)
                .queryParam("name","Public Board Test")
                .queryParam("defaultLabels","true")
                .queryParam("defaultLists", "true")
                .queryParam("keepFromSource","none")
                .queryParam("prefs_permissionLevel","public")
                .queryParam("prefs_voting","disabled")
                .queryParam("prefs_comments","members")
                .queryParam("prefs_invitations","members")
                .queryParam("prefs_selfJoin","true")
                .queryParam("prefs_cardCovers","true")
                .queryParam("prefs_background","blue")
                .queryParam("prefs_cardAging","regular")
                .header("Accept","*/*")
                .header("Content-Type","application/json; charset=utf-8")
                .post(apiPath + boardPath);


        currentBoardId = response.jsonPath().getString("id");
        currentBoardLink = response.jsonPath().getString("link");

    }

    @Step
    public void verifyFieldsOfACreatedBoard(){
        response.then()
                .body("name",is("Public Board Test"))
                .and()
                .body("prefs.permissionLevel",is("public"))
                .and()
                .body("shortUrl",notNullValue())
                .and()
                .body("closed",is(false));

    }

    @Step
    public void closeABoard(){
        response = SerenityRest
                .given()
                .queryParam("key", apiKey)
                .queryParam("token", apiToken)
                .queryParam("closed","true")
                .header("Accept","*/*")
                .header("Content-Type","application/json; charset=utf-8")
                .put(apiPath + boardPath + currentBoardId ) ;

    }

    @Step
    public void verifyFieldsOfClosedBoard(){
        response.then()
                .body("name",is("Public Board Test"))
                .and()
                .body("prefs.permissionLevel",is("public"))
                .and()
                .body("shortUrl",notNullValue())
                .and()
                .body("closed",is(true));
    }

    @Step
    public void deletABoard(){
        response = SerenityRest
                .given()
                .queryParam("key", apiKey)
                .queryParam("token", apiToken)
                .delete(apiPath + boardPath + currentBoardId ) ;

    }

    @Step
    public String getCreatedBoardLink (){

        return currentBoardLink;
    }
}
