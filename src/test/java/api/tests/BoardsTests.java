package api.tests;

import api.steps.BoardSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)

public class BoardsTests {
    private String boardId = "5d0ba50a4b578827a9c4f197";
    private String boardName = "Serenity1";

    @Steps

    BoardSteps boardSteps;


    @Test
    public void verifyThatWeCanFindABoardById(){
        boardSteps.findABoardById(boardId);
        boardSteps.actionIsExecutedSuccesfully();

    }
}
