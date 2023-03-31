package com.cybertek.step_definitions;

import com.cybertek.pages.Login_Facebook;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Facebook_Scenario_Outline_StepDif {

    Login_Facebook login  = new Login_Facebook();
    @Given("User is on the facebook page")
    public void user_is_on_the_facebook_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("facebook.url"));
    }
    @When("User should enter email {string} password {string}")
    public void user_should_enter_email_password(String email  , String password) {
      login.emailInput.sendKeys(email);
      login.password.sendKeys(password, Keys.ENTER);
    }
    @And("User click login button")
    public void user_click_login_button() {

    }
    @Then("Facebook login page should be displayed")
    public void facebook_login_page_should_be_displayed() {
        login.loginButton.isDisplayed();
        System.out.printf(login.loginButton.getText());
    }

}
