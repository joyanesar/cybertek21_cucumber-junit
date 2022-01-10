package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Dice_JobSearch_Def {

    @Given("User is on dice homepage")
    public void user_is_on_dice_homepage() {
        System.out.println("USER IS ON DICE HOMEPAGE...");
        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));
    }

    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        System.out.println("USER ENTERS JAVA AND 22102...");
        WebElement keyword = Driver.getDriver().findElement(By.id("typeaheadInput"));
        WebElement zipCode = Driver.getDriver().findElement(By.id("google-location-search"));

        keyword.sendKeys("java");
        zipCode.sendKeys("22102" + Keys.ENTER);

    }

    @Then("User should see search results")
    public void user_should_see_search_results() {
        System.out.println("USER SHOULD SEE SEARCH RESULTS...");
        WebElement jobCount = Driver.getDriver().findElement(By.xpath("//span[@data-cy='search-count']"));
        System.out.println("JOB COUNT = " + jobCount.getText());
        Driver.closeDriver();
    }
}

//public class Dice_JobSearch_Def {
//    @Given("User is on dice homepage")
//    public void user_is_on_dice_homepage() {
//       // System.out.println("USER ENTERS ON DICE HOME PAGE....");
//        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));
//
//    }
//
//    @When("User enters keyword and zipcode")
//    public void user_enters_keyword_and_zipcode() {
//        //System.out.println("USER ENTER JAVA AND 12189");
//        //GoogleSearchPage searchPage = new GoogleSearchPage();
//      //  searchPage.searchBar.sendKeys("dice jobs" + Keys.ENTER);
//        WebElement keyword = Driver.getDriver().findElement(By.id("typeaheadInput"));
//        WebElement zipcode = Driver.getDriver().findElement(By.id("google-location-search"));
//        keyword.sendKeys("java");
//        zipcode.sendKeys("12189 " + Keys.ENTER);
//
//
//
//    }
//
//    @Then("User should see search results")
//    public void user_should_see_search_results() {
//
//
//        System.out.println("USER SEE THE RESULT ..");
//        WebElement jobcount = Driver.getDriver().findElement(By.id("totalJobCount"));
//        System.out.println("jobcount = " + jobcount.getText());
////        String actualTitle = Driver.getDriver().getTitle();
////        String expectedTitle = "dice jobs";
////        Assert.assertTrue(actualTitle.contains(expectedTitle));
//
//        Driver.getDriver().quit();

