package demo;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadFromData {

    @Test
    public void test() throws IOException {

    
        FileInputStream fis = new FileInputStream("C:\\OrangeHRM_TestScrpitData\\Vacancy_Data.xlsx");

     
        Workbook workbook = WorkbookFactory.create(fis);

     
        Sheet sheet = workbook.getSheet("AddVacancy");
        
        for(int i=2;i<=	sheet.getLastRowNum();i++) {
//
//         Row row = sheet.getRow(i);          // get row
//        	Cell cell = row.getCell(1);         // get cell (column index)
//        	String data = cell.getStringCellValue(); // get value
//

            String data = sheet.getRow(i).getCell(1).getStringCellValue();
            System.out.println(data);
        }


       
    
         
        workbook.close();

    }
}
