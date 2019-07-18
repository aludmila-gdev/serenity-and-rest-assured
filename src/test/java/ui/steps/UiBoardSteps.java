package ui.steps;

import net.thucydides.core.annotations.Step;
import ui.pages.BoardPage;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class UiBoardSteps {

   private BoardPage boardPage;

    @Step
    public void openBoardPage(String pageUrl){
        boardPage.setDefaultBaseUrl(pageUrl);
        boardPage.openUrl(pageUrl);
    }

    @Step

    public void checkBoardName(){
        assertThat(boardPage.getBoardName().equals("Public Board Test"));

    }

}
