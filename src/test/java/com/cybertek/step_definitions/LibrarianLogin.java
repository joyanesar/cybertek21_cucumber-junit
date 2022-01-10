package com.cybertek.step_definitions;

import com.cybertek.pages.LibrarianPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LibrarianLogin {
    LibrarianPage login = new LibrarianPage();
    @Given("User is on the librarian  home page")
    public void user_is_on_the_librarian_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("librarian.url"));
        Assert.assertEquals("Login - Library",Driver.getDriver().getTitle());
    }
    @When("User should enter email address")
    public void user_should_enter_email_address() {
        login.email.sendKeys("librarian12@library");
    }
    @When("User should enter password")
    public void user_should_enter_password() {
        login.password.sendKeys("AOYKYTMJ");
    }
    @Then("User click on login button")
    public void user_click_on_login_button() {
        login.signIn.click();
    }
    @Then("login page should be displayed")
    public void login_page_should_be_displayed() {
        login.library.isDisplayed();
        System.out.println(login.library.getText());
    }


}
