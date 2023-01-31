package com.kitap.mobilebase;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.io.*;

public class ExcelSheet {
    FileInputStream fis = new FileInputStream(".\\src\\test\\resource\\extentconfig\\Demo_Sample.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet("Sheet1");
    int rows = sheet.getLastRowNum();
    int cols = sheet.getRow(rows).getLastCellNum();

    public ExcelSheet() throws IOException {
    }

    @DataProvider(name = "db")
    public Object[][] dataprovider() {
        Object[][] data = new Object[rows][1];
        Hashtable<String, String> table = null;
        for (int rowNum = 1; rowNum <= rows; rowNum++) {
            table = new Hashtable<String, String>();
            for (int colNum = 0; colNum < cols; colNum++) {
                table.put(sheet.getRow(0).getCell(colNum).getStringCellValue(), sheet.getRow(rowNum).getCell(colNum).getStringCellValue());
            }
            data[rowNum - 1][0] = table;
        }
        System.out.println(table);
        return data;
    }
}
