package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.in;

public class ExcelWrite {
    String filePath = "Employees.xlsx";

    @Test
    public void writeToExcelSheet() throws IOException {
        //open the Employees.xlsx using Apache POI
        FileInputStream in = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(in);

        //Goto "data" sheet. or goto first sheet by index
        XSSFSheet dataSheet = workbook.getSheetAt(0);

        //add a column name "Salary" and save into file
        XSSFCell salaryColCell = dataSheet.getRow(0).createCell(3);
        salaryColCell.setCellValue("Salary");


        XSSFCell salary1 = dataSheet.getRow(1).createCell(3);
        salary1.setCellValue(150000 +"$");

        XSSFCell salary2 = dataSheet.getRow(2).createCell(3);
        salary2.setCellValue(135000 +"$");

        XSSFCell salary3 = dataSheet.getRow(3).createCell(3);
        salary3.setCellValue(125000 +"$");

        XSSFCell salary4 = dataSheet.getRow(7).createCell(3);
        salary4.setCellValue(145000 +"$");

        //save the changes:
        //open to write to the file: FileInputStream -> reading
        //                           FileOutputStream -> writing
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();
        workbook.close();
        in.close();


    }
}
