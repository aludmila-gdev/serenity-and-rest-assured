package ui.tests;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ui.steps.BoardSteps;

@RunWith(SerenityRunner.class)

public class UiBoardTests {
    private String url = "https://trello.com/b/MckWyrvA/myboardtest1";

    @Steps
    private BoardSteps uiBoardSteps;

    @Managed
    WebDriver driver;

    @Test
    public void shouldDisplayBoardOnBrowser(){
        uiBoardSteps.openBoardPage(url);

    }
}
