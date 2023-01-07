package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpotifyMainPage {
    WebDriver driver;
    By loginButton = By.xpath("//button[@data-testid='login-button']");

    public SpotifyMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        WebElement loginPageButtonElement = driver.findElement(loginButton);
        loginPageButtonElement.click();
    }

}
