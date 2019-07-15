package ui.steps;

import net.thucydides.core.annotations.Step;
import ui.pages.BoardPage;

public class BoardSteps {

   private BoardPage boardPage;

    @Step
    public void openBoardPage(String pageUrl){
        boardPage.setDefaultBaseUrl(pageUrl);
        boardPage.openUrl(pageUrl);

    }

}
