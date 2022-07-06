package com.meetSky.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDef {
    @Given("Navigate to {string} url")
    public void navigateToUrl(String arg0) {
    }

    @When("Enter {string} to username input")
    public void enterToUsernameInput(String username) {
    }

    @And("Click on the {string} button")
    public void clickOnTheButton(String buttonText) {
    }

    @Then("Verify that user can not login and see the notice message")
    public void verifyThatUserCanNotLoginAndSeeTheNoticeMessage() {
    }

    @Then("Verify that user can login")
    public void verifyThatUserCanLogin() {
    }

    @And("Enter {string} to password input")
    public void enterToPasswordInput(String password) {
    }
}
