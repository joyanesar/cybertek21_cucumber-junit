package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lyft_Estimate_Page {
    public Lyft_Estimate_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "fare-start")
    public WebElement pickUpAddress;

    @FindBy(xpath = "//input[@name='fare-end']")
    public WebElement dropOffAddress;

    @FindBy(xpath = "//button[.='Get estimate']")

    public WebElement estimate;

    @FindBy(xpath = "//h3[@data-testid='cost-estimates-title']")

    public WebElement rideTypesHeader;

    @FindBy(xpath = "//table/tbody/tr[1]/td[3]")
    public WebElement lyftPrice;

    @FindBy(xpath = "//small[.='Please select a valid location.']")
    public WebElement errorMsg;


    public void pickUpLocation(String location){
        pickUpAddress.sendKeys(location);


    }
    public void setDropOffLocation(String drop_Off){
        dropOffAddress.sendKeys(drop_Off);
        estimate.click();
    }

}
