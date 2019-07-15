package cross.tests;

import api.steps.BoardSteps;
import ui.steps.UiBoardSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CrossBoardsTests {
    private String boardId = "5d0ba50a4b578827a9c4f197";
    private String url;


    @Managed
    WebDriver driver;

    @Steps

    private UiBoardSteps uiBoardSteps;
    private BoardSteps apiBoardSteps;

    @Test
    @WithTag("CROSS")
    public void shouldDisplayBoardOnBrowser(){
        url = "https://trello.com/b/CfFqr5uI/public-board-test";
        uiBoardSteps.openBoardPage(url);
        uiBoardSteps.checkBoardName();

    }

    @Test
    @WithTag("CROSS")

    public void verifyThatWeCanCreateABoard(){
        apiBoardSteps.createABoardWithMinimalData();
        apiBoardSteps.actionIsExecutedSuccessfully();
        apiBoardSteps.verifyFieldsOfACreatedBoard();
        url = apiBoardSteps.getCreatedBoardLink();
    }



}
