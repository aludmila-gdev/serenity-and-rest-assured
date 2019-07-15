package ui.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://trello.com")

public class BoardPage  extends PageObject {

    @FindBy(xpath="//*[@id=\"content\"]/div/div[1]/div[1]/div[1]/span")
    private static WebElementFacade boardName;


    public static String getBoardName(){

        return boardName.getText();
    }
}
