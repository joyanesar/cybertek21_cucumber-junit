package com.cybertek.step_definitions;

import com.cybertek.pages.CloudTablesPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class CloudTablesDefs {

    CloudTablesPage tablesPage = new CloudTablesPage();
    @Given("User is on cloudTables homepage")
    public void user_is_on_cloudTables_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));
        Assert.assertEquals("Editor | Editing for DataTables",Driver.getDriver().getTitle());
    }
    @When("User clicks on New button")
    public void user_clicks_on_new_button() {
        tablesPage.creatNew.click();
    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String fName) {
        tablesPage.getName(fName);
    }
    @And("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lName) {
     tablesPage.getLastName(lName);
    }
    @And("User enters {string} to position field")
    public void user_enters_to_position_field(String pos) {
        tablesPage.getPosition(pos);

    }
    @And("User enters {string} to salary field")
    public void user_enters_to_salary_field(String sal) {
       tablesPage.getSalary(sal);
    }
    @And("User clicks on create button")
    public void user_clicks_on_create_button() {
        tablesPage.newBtn.click();




    }

}
