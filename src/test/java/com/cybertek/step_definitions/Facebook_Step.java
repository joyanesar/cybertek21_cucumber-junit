package com.cybertek.step_definitions;

import com.cybertek.pages.Login_Facebook;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Facebook_Step {
        Login_Facebook login_facebook = new Login_Facebook();
    @Given("User is on the facebook  home page")
    public void user_is_on_the_facebook_home_page() {
      Driver.getDriver().get(ConfigurationReader.getProperty("facebook.url"));
    }
    @When("User should enter email {string} and password {string}")
    public void user_should_enter_email_and_password(String email, String password) {
       login_facebook.login(email,password);
       login_facebook.loginButton.click();
    }

}
