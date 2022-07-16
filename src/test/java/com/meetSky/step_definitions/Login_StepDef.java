package com.meetSky.step_definitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.CommonMethods;
import com.meetSky.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {

    LoginPage loginPage = new LoginPage();

    @Given("Navigate to {string} url")
    public void navigateToUrl(String url) {
        CommonMethods.navigateToUrl(ConfigurationReader.getProperty(url));
    }

    @When("Enter {string} to username input")
    public void enterToUsernameInput(String username) {
        loginPage.enterToUsernameInput(username);

    }


    @Then("Verify that user can not login and see the notice message")
    public void verifyThatUserCanNotLoginAndSeeTheNoticeMessage() {
        loginPage.verifyThatUserCanNotLoginAndSeeTheNoticeMessage();
    }

    @Then("Verify that user can login")
    public void verifyThatUserCanLogin() {
        loginPage.verifyThatUserCanLogin();
    }

    @And("Enter {string} to password input")
    public void enterToPasswordInput(String password) {
        loginPage.enterToPasswordInput(password);
    }

    @And("Click on the Login button")
    public void clickOnTheLoginButton() {
        loginPage.clickOnTheLoginButton();
    }

}
