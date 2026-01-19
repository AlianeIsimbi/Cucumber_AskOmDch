package steps;

import context.TestContext;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class NavigationSteps {

    private WebDriver driver;

    public NavigationSteps(TestContext context) {
        this.driver = context.getDriver();
    }

    @Given("I am on the home page of the Ask e-commerce application")
    public void i_am_on_the_home_page_of_the_ask_e_commerce_application() {
        driver.get("https://askomdch.com/");
    }

    @When("I click on the {string} link")
    public void i_click_on_the_link(String navigation) {
        driver.findElement(By.linkText(navigation)).click();
    }

    @Then("I should be redirected to the {string} page")
    public void i_should_be_redirected_to_the_page(String navigationTitle) {
        String pageTitle = driver.getTitle();
        assertTrue("Page title does not contain: " + navigationTitle, pageTitle.contains(navigationTitle));
    }
}
