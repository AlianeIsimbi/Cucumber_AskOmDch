//package steps;
//
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class AddToCartSteps {
//
//    private WebDriver driver;
//
//    @Given("I am on the Store page of AskOmDch website")
//    public void i_am_on_the_store_page_of_ask_om_dch_website() {
//       driver.get("https://askomdch.com/store/");
//    }
//
//    @When("I click Add to Cart button for {string}")
//    public void i_click_add_to_cart_button_for(String string) {
//        By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
//        driver.findElement(addToCartBtn).click();
//    }
//
//    @Then("I should see the View Cart button")
//    public void i_should_see_the_view_cart_button() throws InterruptedException {
//        Thread.sleep(5000);
//        By viewCartLink = By.cssSelector("jghh n");
//        driver.findElement(viewCartLink).click();
//    }
//
//    @Then("the cart count should show {string}")
//    public void the_cart_count_should_show(String string) {
//        By productNameFld = By.cssSelector("bss");
//        String actualProductName =driver.findElement(productNameFld).getText();
//        By productQuantityFld = By.cssSelector("gg");
//        String actualQuantity = driver.findElement(productQuantityFld).getAttribute("value");
//        Assert.assertEquals(productName, actualProductName);
//        Assert.assertEquals(quantity, actualQuantity);
//    }
//
//
//}