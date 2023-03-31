package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {

    public AmazonLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
   @FindBy(partialLinkText = "sign in")
    public WebElement signBtn;
    @FindBy(id = "ap_email")
    public  WebElement inputEmail;
    @FindBy(id = "ap_password")
    public WebElement inputPassword;
    @FindBy(xpath = "//span[contains(text(),'Hello, Nesar')]")
    public WebElement loggedIn;
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//span[contains(text(),'Newest HP 14')][1]")
    public WebElement hpLaptop;

    @FindBy(xpath = "//input[@value='Add to Cart']")
    public WebElement shoppingCart;
    @FindBy(xpath = "//input[@aria-labelledby='attachSiNoCoverage-announce']")
    public WebElement noThanks;
    @FindBy(id = "attach-close_sideSheet-link")
    public WebElement close;

    @FindBy(xpath= "//span[@class='nav-cart-count nav-progressive-attribute nav-progressive-content nav-cart-1']")
    public WebElement itemAdded;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal'][1]")
    public WebElement item;
    @FindBy(linkText = "Next")
    public  WebElement nextBtn;


}
