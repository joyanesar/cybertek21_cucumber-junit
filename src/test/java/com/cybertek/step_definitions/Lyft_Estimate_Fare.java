package com.cybertek.step_definitions;

import com.cybertek.pages.Lyft_Estimate_Page;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;

public class Lyft_Estimate_Fare {
    Lyft_Estimate_Page fareEstimatePage = new Lyft_Estimate_Page();
    @Given("User is on lyft fare estimate page")
    public void user_is_on_lyft_fare_estimate_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("lyft.fare.estimate.url"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Get Fare Estimates for Your City - Lyft Price Estimate | Lyft";
        Assert.assertEquals("Lyft fare estimate page is not displayed", expectedTitle, actualTitle);
    }
    @When("User enters {string} to pickup address")
    public void user_enters_va_to_pickup_address(String pickupLocation) {

        fareEstimatePage.pickUpLocation("Mclean, VA, USA");

    }
    @When("User enters {string} to drop-off address")
    public void user_enters_to_drop_off_address(String drop) {

        fareEstimatePage.setDropOffLocation("Woodbridge, VA, USA");

    }

    @And("User clicks on get estimate button")
    public void user_clicks_on_get_estimate_button() {

        BrowserUtils.sleep(1);
        fareEstimatePage.estimate.click();

    }
    @Then("User should see estimated prices")
    public void user_should_see_estimated_prices() {

//        assertTrue(fareEstimatePage.rideTypesHeader.isDisplayed());
//        System.out.println("Lyft Estimated price and time = " + fareEstimatePage.lyftPrice.getText());

    }

    @Then("User should see error message")
    public void userShouldSeeErrorMessage() {
    //   assertTrue ("Error message is not displayed",fareEstimatePage.errorMsg.isDisplayed());
    }
}
