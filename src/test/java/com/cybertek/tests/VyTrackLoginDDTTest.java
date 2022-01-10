package com.cybertek.tests;

import com.cybertek.pages.VyTrackLoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.apache.poi.hssf.record.aggregates.RowRecordsAggregate;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class VyTrackLoginDDTTest {
    String filePath = "VyTrackQa2Users.xlsx";
    VyTrackLoginPage loginPage = new VyTrackLoginPage();
      @Before
    public void setUp(){
        //set up browser
        //open the url
      Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        Assert.assertEquals("Login",Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getTitle());
    }

    @After
    public void tearDown(){
        Driver.closeDriver();

    }
    @Test

    public  void loginDDTTest() throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        XSSFSheet datasheet = workbook.getSheet("data");
//        System.out.println(workSheet.getRow(0).getCell(0)); // username
//        System.out.println(workSheet.getRow(0).getCell(1)); // password
        //find out number of rows in the worksheet

        String usernameField  = String.valueOf(datasheet.getRow(0).getCell(0));
        String passwordField  = String.valueOf(datasheet.getRow(0).getCell(1));
        System.out.println(usernameField + ", and ," + passwordField);

        String userName = String.valueOf(datasheet.getRow(1).getCell(0));
        String password  = String.valueOf(datasheet.getRow(1).getCell(1));

//        int rowCount = datasheet.getPhysicalNumberOfRows();
//        System.out.println("rowCount = " + rowCount);
         int usedRowsCount = datasheet.getLastRowNum();
        XSSFCell result = datasheet.getRow(0).getCell(4);



    //     System.out.println("usedRowsCount = " + usedRowsCount);

        //loginPage.loginVyTrack(userName,password);
        //print all users using a loop

        for(int i = 1; i <=usedRowsCount; i++){
            loginPage.loginVyTrack(datasheet.getRow(i).getCell(0).toString(),datasheet.getRow(i).getCell(1).toString());
            loginPage.dropDownToggle.click();
            loginPage.logoutBtn.click();
                break;



            }
        if(Driver.getDriver().getTitle().equals("Dashboard")){
            result.toString().equals("pass");

        }



        }

        //open excel file
        //add page object
        //loop and read credentials
        //write the result in excel file


    }
