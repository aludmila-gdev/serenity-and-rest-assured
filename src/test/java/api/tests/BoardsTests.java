package api.tests;

import api.steps.BoardSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

public class BoardsTests {
    private String boardId = "5d0ba50a4b578827a9c4f197";

    @Steps

    private BoardSteps boardSteps;


    @Test
    @WithTag("API")

    public void verifyThatWeCanCreateABoard(){
        boardSteps.createABoardWithMinimalData();
        boardSteps.actionIsExecutedSuccessfully();
        boardSteps.verifyFieldsOfACreatedBoard();
        boardSteps.deletABoard();

    }

    @Test
    @WithTag("API")

    public void verifyThatWeCanFindABoardById(){
        boardSteps.findABoardById(boardId);
        boardSteps.actionIsExecutedSuccessfully();

    }

    @Test
    @WithTag("API")

    public void verifyThatWeCanCloseABoard(){
        boardSteps.createABoardWithMinimalData();
        boardSteps.actionIsExecutedSuccessfully();
        boardSteps.closeABoard();
        boardSteps.verifyFieldsOfClosedBoard();
        boardSteps.deletABoard();


    }

    @Test
    @WithTag("API")
    @Pending
    public void verifyThatWeCanCreateABoardWhitList(){

    }

    @Test
    @WithTag("API")

    @Ignore
    public void verifyThatWeCanUpdateABoardBackground(){

    }
}
