package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitions {
    GoogleSearchPage searchPage = new GoogleSearchPage();
    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");

    }

    @When("User searches for apple")
    public void user_searches_for_apple() {

        searchPage.searchBar.sendKeys("apple" + Keys.ENTER);

    }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    @Then("User should be able to search for following:")
    public void userShouldBeAbleToSearchForFollowing(List<String> items) {
        System.out.println("items = " + items);
        //loop and search for each item on google
        GoogleSearchPage searchPage = new GoogleSearchPage();

        for (String eachItem : items) {
            searchPage.searchBar.clear();
            searchPage.searchBar.sendKeys(eachItem + Keys.ENTER);
        }
    }

    @When("User searches for {string} capital")
    public void userSearchesForCapital(String countryName) {
        System.out.println("countryName = " + countryName);
        searchPage.searchBar.sendKeys("What is the capital city of " + countryName + Keys.ENTER);
    }

    @Then("User should see {string} in the result")
    public void userShouldSeeInTheResult(String cityName) {
        System.out.println("cityName : = " + cityName);
        searchPage.searchBar.sendKeys("Expected Capital City name " + cityName);
        Assert.assertEquals(cityName, searchPage.searchResultCityName.getText());
    }
}