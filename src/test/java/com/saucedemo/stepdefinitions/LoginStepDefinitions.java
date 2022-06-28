package com.saucedemo.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver webDriver;

    @Given("^User navigate on page swag labs$")
    public void userNavigateOnPageSwagLabs() {

    }

    @When("^User put credentials$")
    public void userPutCredentials() {

    }

    @Then("^User looking home page$")
    public void userLookingHomePage() {

    }
}
