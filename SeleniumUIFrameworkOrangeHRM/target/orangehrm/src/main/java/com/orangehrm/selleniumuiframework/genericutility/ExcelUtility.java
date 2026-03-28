package com.orangehrm.selleniumuiframework.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtility {

    private Workbook wb;
    private Sheet sh;

    // Load Excel
    public void loadExcelFile(String filepath, String sheetName)
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(filepath);
        wb = WorkbookFactory.create(fis);
        sh = wb.getSheet(sheetName);

        if (sh == null) {
            throw new RuntimeException("Sheet not found: " + sheetName);
        }
    }

    // Read Cell (NULL SAFE)
    public String getDataFromSingleCell(int rowNum, int cellNum) {

        if (sh == null) {
            throw new RuntimeException("Excel not loaded. Call loadExcelFile() first.");
        }

        Row row = sh.getRow(rowNum);
        if (row == null) {
            System.out.println("Row " + rowNum + " is NULL");
            return "";
        }

        Cell cell = row.getCell(cellNum);
        if (cell == null) {
            System.out.println("Cell [" + rowNum + "," + cellNum + "] is NULL");
            return "";
        }

        String value = "";

        switch (cell.getCellType()) {

            case STRING:
                value = cell.getStringCellValue();
                break;

            case NUMERIC:
                double num = cell.getNumericCellValue();
                value = (num % 1 == 0)
                        ? String.valueOf((int) num)
                        : String.valueOf(num);
                break;

            case BOOLEAN:
                value = String.valueOf(cell.getBooleanCellValue());
                break;

            case BLANK:
                value = "";
                break;

            default:
                value = "";
        }

        return value;
    }

    // Write Data
    public void writeDataIntheCell(String filepath, String sheetName,
                                  int rowNum, int cellNum, String data)
            throws EncryptedDocumentException, IOException {

        FileInputStream fis = new FileInputStream(filepath);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet(sheetName);

        Row row = sheet.getRow(rowNum);
        if (row == null) row = sheet.createRow(rowNum);

        Cell cell = row.getCell(cellNum);
        if (cell == null) cell = row.createCell(cellNum);

        cell.setCellValue(data);

        FileOutputStream fos = new FileOutputStream(filepath);
        wb.write(fos);

        fos.close();
        wb.close();
    }

    // DataProvider
    public Object[][] getDataFromExcelSheet() {

        int rowCount = sh.getLastRowNum();
        int colCount = sh.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][colCount];

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] = getDataFromSingleCell(i, j);
            }
        }

        return data;
    }

    // Close Workbook
    public void closeWorkbook() throws IOException {
        if (wb != null) {
            wb.close();
        }
    }
}