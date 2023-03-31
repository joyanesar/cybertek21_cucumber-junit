package com.cybertek.step_definitions;

import com.cybertek.pages.Google_Scenario_Outline_SearchPage;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    Google_Scenario_Outline_SearchPage searchPage = new Google_Scenario_Outline_SearchPage();

    @Then("User should be able to search for following {string}:")
    public void userShouldBeAbleToSearchForFollowing(String books) {
        searchPage.searchBar.sendKeys("Name of the the" + books);

    }
}
