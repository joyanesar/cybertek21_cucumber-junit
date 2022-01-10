package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelReadSheetData {
    String filePath = "Employees.xlsx";  // store file
    int usedRowsCount;
    int usedRowsCount1;

    @Test

    public void readExcelSheetData() throws IOException {
        // open the Employees.xlsx using Apache POI
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);

        //Go to "data" sheet
        XSSFSheet dataSheet= workbook.getSheetAt(0);

        //print column names  row is 0 cell 0, 1 ,2
//        System.out.println("COLUMN NAMES:");
//        System.out.println(dataSheet.getRow(0).getCell(0));
//        System.out.println(dataSheet.getRow(0).getCell(1));
//        System.out.println(dataSheet.getRow(0).getCell(2));


//        System.out.println("------------------------");
//
//        //loop and print all 3 column and names
//        for(int i = 0; i <= 2; i++){
//            System.out.println(dataSheet.getRow(0).getCell(i));
//        }
        //find out number of rows in the worksheet
//        int rowsCount = dataSheet.getPhysicalNumberOfRows();
//        System.out.println("rowsCount = " + rowsCount);

         usedRowsCount = dataSheet.getLastRowNum();
       // System.out.println("usedRowsCount = " + usedRowsCount);

        //print all first names using a loop

        for(int i = 0; i <= usedRowsCount; i++){
            System.out.println(dataSheet.getRow(i).getCell(0));

            }
        //loop and find "Fahim" in firstname column.
//        //print her first lastname and job id then exit loop
//        System.out.println();
//
//        for(int i = 1; i <= dataSheet.getLastRowNum(); i++){
//            if(dataSheet.getRow(i).getCell(0).toString().equals("Fahima"));
//            System.out.println(dataSheet.getRow(i).getCell(0) +" | "+ dataSheet.getRow(i).getCell(1) +" | "+
//                    dataSheet.getRow(i).getCell(2));
//            break;


       }




    }

