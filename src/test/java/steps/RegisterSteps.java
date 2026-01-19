//package steps;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class RegisterSteps {
//
//    private WebDriver driver;
//
//    @Before
//    public void setup(){
//        System.setProperty("webdriver.chrome.driver", "C:\\java\\Cucumber_AskOmDch\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//    }
//
//    @Given("I am in the Account page of AskOmDch website")
//    public void i_am_in_the_account_page_of_ask_om_dch_website() {
//        driver.get("https://askomdch.com/");
//    }
//    @When("I enter valid <username> and <email> and <password>")
//    public void i_enter_valid_username_and_email_and_password() {
//        driver.findElement(By.id("reg_username")).sendKeys("Babes105");
//        driver.findElement(By.id("reg_email")).sendKeys("babes@gmail.com");
//        driver.findElement(By.id("reg_password")).sendKeys("babes123");
//    }
//    @Then("I should be taken to Dashboard page")
//    public void i_should_be_taken_to_dashboard_page() {
//        driver.findElement(By.linkText("Dashboard")).isDisplayed();
//        driver.findElement(By.linkText("Logout")).click();
//    }
//
//    @After
//    public void quitBrowser(){
//        driver.quit();
//    }
//}
