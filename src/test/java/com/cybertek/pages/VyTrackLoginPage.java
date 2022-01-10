package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {
    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(id = "_submit")
    public WebElement signBtn;
    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement dropDownToggle;

    @FindBy(linkText = "Logout")
    public WebElement logoutBtn;

    public void loginVyTrack(String user, String pass){
        userName.sendKeys(user);
        password.sendKeys(pass);
        signBtn.click();
    }

    public void loginVyTrack(XSSFCell cell) {
    }
}
