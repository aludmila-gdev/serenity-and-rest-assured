package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.BoardsSteps;

@RunWith(SerenityRunner.class)

public class BoardsTests {
    private String boardId = "boardId";
    private String boardName = "Serenity1";

    @Steps

    BoardsSteps boardsSteps;

    @Test
    public void verifyThatWeCanGetABoardInformationUsingBoardId(){
        boardsSteps.getAllOfTheCardsForABoard("5d0ba50a4b578827a9c4f197");
        boardsSteps.getIsExecutedSuccesfully();

    }
}
