package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MockarooPage extends BasePage {


    @FindBy(name = "num_rows")
    public WebElement numberOfRows;

    @FindBy(id = "mui-component-select-file_format")
    public WebElement formatDropDown;


    @FindBy(xpath = "//li[.='Excel']")
    public WebElement excelOption;

    @FindBy(xpath = "//span[.='Preview']")
    public WebElement previewBtn;

    @FindBy(xpath = "//table//th")
    public List<WebElement> tableHeaders ;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> tableRows;

    @FindBy(xpath = "//span[.='Download Data']")
    public WebElement downloadBtn;


    public void selectOption(){    // this method does two jobs
        formatDropDown.click();
        excelOption.click();
    }






}
