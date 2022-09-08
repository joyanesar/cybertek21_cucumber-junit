package com.cybertek.tests;

import com.cybertek.pages.VyTrackDashboardPage;
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
import java.io.FileOutputStream;
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
       // Driver.closeDriver();

    }
    @Test

    public  void loginDDTTest() throws IOException {
        //open excel workbook
        String filePath = "VyTrackQa2Users.xlsx";
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);

        //we need workSheet

        XSSFSheet workSheet = workbook.getSheetAt(0);


        /**

         String userName =  "user1";
         String password = "UserUser123";
         String firstName = "John";
         String lastName = "Doe";
         */

        for (int i = 1; i <= workSheet.getLastRowNum(); i++) {


        String userName = workSheet.getRow(i).getCell(0).toString();

        String password = workSheet.getRow(i).getCell(1).toString();

        String firstName = workSheet.getRow(i).getCell(2).toString();

        String lastName = workSheet.getRow(i).getCell(3).toString();

        VyTrackDashboardPage dashboardPage = new VyTrackDashboardPage();
        loginPage.loginVyTrack(userName, password);

        System.out.println("FullName = " + dashboardPage.fullName.getText());

        String actualFullName = dashboardPage.fullName.getText();

            XSSFCell resultCell = workSheet.getRow(i).getCell(4);
        if (actualFullName.contains(firstName) && actualFullName.contains(lastName)) {
            System.out.println("Pass");
            resultCell.setCellValue("PASS");
        } else {
            System.out.println("Fail");
            resultCell.setCellValue("FAIL");
        }

        dashboardPage.logout();

    }
         // save changes in the excel file

        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);

        in.close();
        out.close();
        workbook.close();


        }

        //open excel file
        //add page object
        //loop and read credentials
        //write the result in excel file


    }
