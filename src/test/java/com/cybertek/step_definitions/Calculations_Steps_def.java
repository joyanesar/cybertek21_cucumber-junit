package com.cybertek.step_definitions;

import com.cybertek.pages.Calc_Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Calculations_Steps_def {
        Calc_Page cal = new Calc_Page();
    @Given("User is on calculator page")
    public void user_is_on_calculator_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("calc.url"));
    }
    @Given("User clicks on {string} on calculator")
    public void user_clicks_on_on_calculator(String buttonText) {
        System.out.println("User click on { " + buttonText + "} on calculator");

        cal.clickOn(buttonText);


    }
    @Then("result {string} should be displayed")
    public void result_should_be_displayed(String expectedResult) {
        System.out.println("Result should be " + expectedResult);
       String actualResult = cal.result.getText().trim();
        Assert.assertEquals(expectedResult,actualResult);
    }


}
