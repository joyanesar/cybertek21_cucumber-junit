package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {


    @Test
    public void readingFromExcel() throws IOException {
        //Open excel workbook using XSSFWorkbook class
        //pass filename in the constructor

        XSSFWorkbook workbook = new XSSFWorkbook("Employees.xlsx");
        //Go to worksheet
        XSSFSheet worksheet = workbook.getSheet("data");

        System.out.println(worksheet.getRow(1).getCell(0));


       int rowCount = worksheet.getLastRowNum();
       //System.out.println("Total rows is " + rowCount);

        for(int i =0; i < rowCount; i++) {


            String data = worksheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println("list from the excel " + data);

        }
    }
}
