package api.steps;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import util.Board;
import util.Trello;


import static org.hamcrest.Matchers.is;

public class BoardSteps {

    private Response response;
    String apiKey = Trello.getTRELLO_API_KEY();
    String token = Trello.getTRELLO_TOKEN();
    String fields = Board.getFields();
    String apiLink = Trello.getTRELLO_API_LINK();


    @Step
    public void findABoardById(String boardId){

        response = SerenityRest
                .given()
                .queryParam("fields", fields)
                .queryParam("key", apiKey)
                .queryParam("token", token)
                .get(apiLink + "/boards/" + boardId);

        System.out.println(response.toString());
    }

    @Step
    public void actionIsExecutedSuccesfully(){
        response.then().statusCode(200);
    }

    @Step
    public void iShouldFindName(String boardName){
        response.then().body("RestResponse.result.name", is(boardName));
    }

}
