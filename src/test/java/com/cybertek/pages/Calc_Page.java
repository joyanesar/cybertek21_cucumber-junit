package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calc_Page {
    public Calc_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "sciOutPut")
    public WebElement result;


    public void clickOn(String buttonText){
        WebElement elem = Driver.getDriver().findElement(By.xpath("//span[.='" + buttonText + "']"));
        elem.click();
    }

    }



