package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.GmailLoginPage;
import pageObjects.SpotifyLoginPage;
import pageObjects.SpotifyMainPage;

public class Steps {

    WebDriver driver = new ChromeDriver();

    SpotifyMainPage spotifyMainPage = new SpotifyMainPage(driver);

    SpotifyLoginPage spotifyLoginPage = new SpotifyLoginPage(driver);

    GmailLoginPage gmailLoginPage = new GmailLoginPage(driver);

    @Given("user is on the main page")
    public void onSpotifyPage() {
        driver.get("https://www.spotify.com/");
    }
    @And("user closes cookie")
    public void userClosesCookie() {
        spotifyMainPage.closeCookie();
    }
    @And("user goes to login page")
    public void userGoesToLoginPage() {
        spotifyMainPage.clickLogin();
    }

    @When("user clicks continue with Google")
    public void clickContinueWithGoogle(){
        spotifyLoginPage.continueWithGoogle();
    }

    @And("user enters {string} in username field")
    public void userEntersGmailAccountinUsernameField(String username) {
        gmailLoginPage.setGmailUsername(username);
    }

    @And("user clicks on Gmail login button")
    public void clicksOnGmailLoginButton() {
        gmailLoginPage.clickOnLoginGmailButton();
    }

    @Then("error message is displayed")
    public void userReceivesErrorMessage() {
        Assert.assertTrue(gmailLoginPage.messageAccountNotFoundDisplayed());
    }


}
