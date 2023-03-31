package com.cybertek.step_definitions;

import com.cybertek.pages.EtsyAllCategoriesPage;
import com.cybertek.pages.EtsyHomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;


public class Etsy_Search_WoodenSpoon {
    WebDriver driver;
    @Given("User is on etsy home page")
    public void user_is_on_etsy_home_page() {
        driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("etsy.url"));
    }
    @Then("Page title should be as expected")
    public void page_title_should_be_as_expected() {
//       assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone",driver.getTitle());

    }
    @When("User searches for wooden spoon")
    public void user_searches_for_wooden_spoon() {
        EtsyHomePage etsyHomePage = new EtsyHomePage();
        etsyHomePage.searchFor("wooden spoon");
        etsyHomePage.button.click();



    }
    @Then("Page title should start with wooden spoon")
    public void page_title_should_start_with_wooden_spoon() {
        assertTrue("title did not match" , driver.getTitle().startsWith("Wooden spoon"));


    }

    @When("User searches for empty value")
    public void userSearchesForEmptyValue() {
        EtsyHomePage etsyHomePage = new EtsyHomePage();
        etsyHomePage.searchFor("");   // searching for empty
        
    }

    @Then("All categories should be displayed")
    public void allCategoriesShouldBeDisplayed() {
        //wait for title to change to "All categories
        //WebDriverWait wait = new WebDriverWait(driver,20);
        //wait.until(ExpectedConditions.titleIs("All categories | Etsy"));

        assertEquals("All categories | Etsy", driver.getTitle());
        EtsyAllCategoriesPage categoriesPage = new EtsyAllCategoriesPage();

        assertTrue(categoriesPage.allCategoriesHeader.isDisplayed());
    }
}
