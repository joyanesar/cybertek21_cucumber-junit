package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Scenario_Outline_SearchPage {


    public Google_Scenario_Outline_SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "q")
    public WebElement searchBar;

    @FindBy(xpath = "//div[@class='kp-header']//a[@class='FLP8od']")
    public WebElement searchResultCityName;
    //div[@class='kp-header']//a[@class='FLP8od']
}
