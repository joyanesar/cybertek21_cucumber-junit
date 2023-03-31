package com.cybertek.step_definitions;

import com.cybertek.pages.AmazonLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.JavaScript;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.Keys;
public class AmazonStepDif {
    AmazonLoginPage login =  new AmazonLoginPage();
    JavaScript javaScript = new JavaScript();

//    @Given("I navigate to login page")
//    public void i_navigate_to_login_page() {
@Given("I go to amazon shopping website")
public void iGoToAmazonShoppingWebsite() {

        Driver.getDriver().get(ConfigurationReader.getProperty("amazon.url"));
        Assert.assertEquals("Amazon.com. Spend less. Smile more.",Driver.getDriver().getTitle());

    }
//    @When("I submit username  and password")
//    public void iSubmitUsernameAndPassword() {
//        login.signBtn.click();
//        login.inputEmail.sendKeys("joyanisar@gmail.com", Keys.ENTER);
//        login.inputPassword.sendKeys("afghan30",Keys.ENTER);
//    }
//    @Then("I should be able logged in")
//    public void i_should_be_able_logged_in() {
//     Assert.assertTrue(login.loggedIn.isDisplayed());
//    }
    @Given("User search for hp Laptop")
    public void user_search_for_hp_laptop() {
        login.searchBox.sendKeys("hp  Laptop",Keys.ENTER);
        BrowserUtils.scrollDown(500);
        BrowserUtils.sleep(3);
    }
    @When("Add the first laptop that appears in the search result to the basket")
    public void add_the_first_laptop_that_appears_in_the_search_result_to_the_basket() {
        login.hpLaptop.click();
        login.shoppingCart.click();
        login.noThanks.click();
        login.close.click();

    }
    @Then("User basket should be displayed with added item")
    public void user_basket_should_be_displayed_with_added_item() {
      login.itemAdded.isDisplayed();
        System.out.println(login.itemAdded.getText());

    }

    @Given("user search for  lenovo monitor")
    public void userSearchForLenovoMonitor() {
        login.searchBox.sendKeys("lenovo monitor",Keys.ENTER);
       // BrowserUtils.scrollDown(2000);
    }

    @When("add the first result to the shopping cart")
    public void addTheFirstResultToTheShoppingCart() {
        login.item.click();
        login.shoppingCart.click();
        login.noThanks.click();
    }

    @Then("User should be able see displayed with added item")
    public void userShouldBeAbleSeeDisplayedWithAddedItem() {
     //   login.itemAdded.isDisplayed();
    }



}
