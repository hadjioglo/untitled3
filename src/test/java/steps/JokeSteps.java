package steps;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static base.DriverFactory.quitDriver;
import static org.junit.Assert.assertNotNull;

public class JokeSteps {

    WebDriver driver = DriverFactory.getDriver();

    @Given("I navigate to the joke website")
    public void iNavigateToTheJokeWebsite() {
        driver.get("https://icanhazdadjoke.com/");
    }

    @Then("I should see a random joke displayed")
    public void iShouldSeeARandomJokeDisplayed() {
        WebElement jokeElement = driver.findElement(By.cssSelector("section p"));
        String joke = jokeElement.getText();
        System.out.println("Joke: " + joke);
        assertNotNull("Joke should not be null", joke);

        quitDriver();

    }
}
