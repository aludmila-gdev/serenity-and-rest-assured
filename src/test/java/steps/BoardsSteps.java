package steps;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


import static org.hamcrest.Matchers.is;

public class BoardsSteps {
    private String TRELLO_API = "https://api.trello.com/1";
    private String API_KEY = "a7cb57ab0749b69b3e7f69d64e53adca";
    private String TOKEN = "c27878f247341d8480067dc41024f4646353fdfb699b301c1b0d5106061ca7e1";
    private String fields = "name,url";
    private String boardId = "5d0ba50a4b578827a9c4f197";
    private Response response;


    @Step
    public void getAllOfTheCardsForABoard(String boardId){
        response = SerenityRest.when().get(TRELLO_API + "/boards/" + boardId + "?fields=" + fields + "&key=" + API_KEY + "&token=" + TOKEN);
    }

    @Step
    public void getIsExecutedSuccesfully(){
        response.then().statusCode(200);
    }

    @Step
    public void iShouldFindName(String boardName){
        response.then().body("RestResponse.result.name", is(boardName));
    }

}
