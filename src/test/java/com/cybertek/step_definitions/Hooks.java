package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * similar to TestBase.java in TestNG frameWork
 * we open close browsers here etc

 */
public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Before setUp method is running before the scenario");

    }
    @After
    public void tearDownScenario(Scenario scenario) {
        /**Scenario scenario : represents current running cucumber scenario
         * cast webdriver to TakeScreenshot interface
         * call getScreenshot as method and output Type.BYTES
         * save the result int byte[] array: byte[] image
         * attach the image into the scenario html report: scenario.attach(image/png" scenario.getName());
         * if scenario fails for any reason this code will take care of it
         */
        if(scenario.isFailed()) {
            byte[] image = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
        }
        System.out.println("AFTER - tearDown method is running after the scenario:" + scenario.getName());
        Driver.closeDriver();


    }

    /**
     * @AfterSteps  runs after each scenario steps
     * takes screenshot and attaches to the report
     * @param scenario
     */
//    @AfterStep
//    public void tearDownStep(Scenario scenario) {
//        byte[] image=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//        scenario.attach(image, "image/png", scenario.getName());
//    }

}
