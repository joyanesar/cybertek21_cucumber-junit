package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablesPage {
    public CloudTablesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement creatNew;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement firstName;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement lastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement position;

    @FindBy(id = "DTE_Field_office")
    public WebElement office;


    @FindBy(id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy(className = "btn")
    public WebElement newBtn;

    public void getName(String fName) {
        firstName.sendKeys(fName);
    }

    public void getLastName(String lName) {
        lastName.sendKeys(lName);

    }

    public void getPosition(String pos) {
        position.sendKeys(pos);

    }

    public void getSalary(String sal) {
        salary.sendKeys(sal);
    }
}