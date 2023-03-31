package com.cybertek.step_definitions;

import com.cybertek.pages.SearchGooglePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchStepDif {
        SearchGooglePage search = new SearchGooglePage();
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

    }
    @When("user search for apple product")
    public void user_search_for_apple_product() {
        search.inbox.sendKeys("apple", Keys.ENTER);
    }
    @Then("user should be able see apple displayed")
    public void user_should_be_able_see_apple_displayed() {
        Assert.assertEquals(Driver.getDriver().getTitle(),"apple - Google Search");

        search.inbox.isDisplayed();
        System.out.printf(search.inbox.getText());

    }

}
