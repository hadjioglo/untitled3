package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {
    @Given("user has initialised the test")
    public void userHasInitialisedTheTest() {
        System.out.println("Test initialised");
    }

    @When("user runs the test")
    public void userRunsTheTest1() {
        System.out.println("Test is running");
    }

    @Then("user should see a successful outcome")
    public void userShouldSeeASuccessfulOutcome() {
        System.out.println("Test outcome verified");
    }
}
