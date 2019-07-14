package api.steps;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import util.Board;
import util.Trello;


import static org.hamcrest.Matchers.is;

public class BoardsSteps {

    private Response response;
    String apiKey = Trello.getTRELLO_API_KEY();
    String token = Trello.getTRELLO_TOKEN();
    String fields = Board.getFields();
    String apiLink = Trello.getTRELLO_API_LINK();


    @Step
    public void buscaInformacoesDoBoardPorId(String boardId){

        response = SerenityRest
                .given()
                .queryParam("fields", fields)
                .queryParam("key", apiKey)
                .queryParam("token", token)
                .get(apiLink + "/boards/" + boardId);

        System.out.println(response.toString());
    }

    @Step
    public void buscaRealizadaComSucesso(){
        response.then().statusCode(200);
    }

    @Step
    public void iShouldFindName(String boardName){
        response.then().body("RestResponse.result.name", is(boardName));
    }

}
