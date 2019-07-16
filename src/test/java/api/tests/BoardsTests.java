package api.tests;

import api.steps.BoardSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

public class BoardsTests {
    private String boardId = "5d0ba50a4b578827a9c4f197";

    @Steps

    BoardSteps boardSteps;

    @Test
    @Ignore
    public void verifyThatWeCanCreateABoard(){
        boardSteps.createABoardWithMinimalData();
        boardSteps.actionIsExecutedSuccessfully();
        boardSteps.verifyFieldsOfACreatedBoard();

    }

    @Test
    public void verifyThatWeCanFindABoardById(){
        boardSteps.findABoardById(boardId);
        boardSteps.actionIsExecutedSuccessfully();

    }

    @Test
    @Ignore
    public void verifyThatWeCanCloseABoard(){
        boardSteps.createABoardWithMinimalData();
        boardSteps.actionIsExecutedSuccessfully();
        boardSteps.closeABoard();
        boardSteps.verifyFieldsOfClosedBoard();


    }

    @Test
    @Pending
    public void verifyThatWeCanCreateABoardWhitList(){

    }

    @Test
    @Ignore
    public void verifyThatWeCanUpdateABoardBackground(){

    }
}
