package com.cybertek.step_definitions;

import com.cybertek.pages.Calculat.PercentageCalculator;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class Percentage_Defs {

        @Given("User is on percentage calculator page")
    public void user_is_on_percentage_calculator_page() {
       Driver.getDriver().get(ConfigurationReader.getProperty("percentage"));
            Assert.assertEquals("Percentage Calculator",Driver.getDriver().getTitle());
    }

    @Then("User should see following calculations:")
    public void user_should_see_following_calculations(Map<Integer,Integer> valuesMap) {
        System.out.println("valuesMap = " + valuesMap);

        PercentageCalculator  calculator = new PercentageCalculator();
        calculator.percent.sendKeys("5");

        for(Integer inputKey : valuesMap.keySet()){
            calculator.input.clear();
            calculator.input.sendKeys(inputKey +"" + Keys.ENTER);
            BrowserUtils.sleep(1);

            System.out.println("Input value  = " + inputKey);
            System.out.println("Expected 5% value  = " + valuesMap.get(inputKey));
            System.out.println("Actual 5% calculated value " + calculator.result.getAttribute("value") );
            System.out.println("===============================");
            //assert
            Assert.assertEquals("Results not match", "" +valuesMap.get(inputKey), ""+ calculator.result.getAttribute("value"));

        }






    }
}