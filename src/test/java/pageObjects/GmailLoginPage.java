package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLoginPage {
    WebDriver driver;

    By gmailUsernameField = By.xpath("//input[@type='email']");
    By gmailLoginButton = By.xpath("//div[@class='qhFLie']/div/div/button");

    public GmailLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setGmailUsername(String username) {
        WebElement gmailUsernameFieldElement = driver.findElement(gmailUsernameField);
        gmailUsernameFieldElement.sendKeys(username);
    }

    public void clickOnLoginGmailButton(){
        WebElement gmailLoginButtonElement = driver.findElement(gmailLoginButton);
        gmailLoginButtonElement.click();
    }

}
