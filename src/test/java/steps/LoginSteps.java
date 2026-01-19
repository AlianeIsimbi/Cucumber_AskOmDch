package steps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private WebDriver driver;

    public LoginSteps(TestContext context) {
        this.driver = context.getDriver();
    }

    @Given("I am on the Account page of AskOmDch website")
    public void i_am_on_the_account_page_of_ask_om_dch_website() {
        driver.get("https://askomdch.com/account/");
    }
    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        driver.findElement(By.name("username")).sendKeys("User101");
        driver.findElement(By.name("password")).sendKeys("user123");
        driver.findElement(By.name("login")).click();
    }
    @Then("I should be taken to Dashboard")
    public void i_should_be_taken_to_dashboard() {
        driver.findElement(By.linkText("Dashboard")).isDisplayed();
        driver.findElement(By.linkText("Logout")).click();
    }

}
