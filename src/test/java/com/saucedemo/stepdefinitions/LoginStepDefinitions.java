package com.saucedemo.stepdefinitions;

import com.saucedemo.tasks.OpenPageSwagLabs;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver webDriver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andres").can(BrowseTheWeb.with(webDriver));
    }

    @Given("^User navigate on page swag labs$")
    public void userNavigateOnPageSwagLabs() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenPageSwagLabs.on()
        );
    }

    @When("^User put credentials$")
    public void userPutCredentials() {

    }

    @Then("^User looking home page$")
    public void userLookingHomePage() {

    }
}
