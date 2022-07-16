package com.meetSky.pages;

import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.CommonMethods;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(id = "user")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;


    @FindBy(id = "submit-form")
    WebElement loginButton;

    public void enterToUsernameInput(String username) {
//        WebElement usernameInput= Driver.getDriver().findElement(By.id("user"));
        usernameInput.sendKeys(username);

    }

    public void enterToPasswordInput(String password) {
        passwordInput.sendKeys(password);

    }

    public void clickOnTheLoginButton() {
        CommonMethods.click(loginButton);
    }


    public void verifyThatUserCanLogin() {
        String expectedTitle = "Files - Meetsky - QA";
        CommonMethods.waitForTitle(expectedTitle);

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("FAIL:  Login verify Title does not match!", expectedTitle, actualTitle);
    }

    public void verifyThatUserCanNotLoginAndSeeTheNoticeMessage() {
         String expectedMessage="Wrong username or password.";
         WebElement message= Driver.getDriver().findElement(By.xpath("//p[@class='warning wrongPasswordMsg']"));
         Assert.assertEquals("FAIL!MESSAGE IS NOT SAME",expectedMessage,message.getText());


    }
    public void verifyThatUserCanLogoutAndSeeLoginPage(){
        String expectedTitle = "Meetsky - QA";
        CommonMethods.waitForTitle(expectedTitle);

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("FAIL:  Logout verify Title does not match!", expectedTitle, actualTitle);

    }


}
