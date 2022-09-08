package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;

public class Login_Facebook  extends  BasePage{

    @FindBy(id = "email")
    public WebElement emailInput;
    @FindBy(id = "pass")
    public WebElement password;
    @FindBy(name = "login")
    public WebElement loginButton;

    public void login(String e, String p){
        emailInput.sendKeys(e);
        password.sendKeys(p);
        loginButton.click();
    }
}
