package ui.tests;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ui.steps.UiBoardSteps;

@RunWith(SerenityRunner.class)

public class UiBoardTests {
    private String url = "https://trello.com/b/lKAfxtSI/public-board-test";

    @Steps
    private UiBoardSteps uiBoardSteps;

    @Managed
    WebDriver driver;

    @Test
    @WithTag("UI")
    public void shouldDisplayBoardOnBrowser(){
        uiBoardSteps.openBoardPage(url);
        uiBoardSteps.checkBoardName();

    }
}
