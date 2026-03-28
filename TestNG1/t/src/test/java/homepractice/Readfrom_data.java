package homepractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
@Test
public class Readfrom_data {
public void read() throws IOException {
	FileInputStream fis=new FileInputStream(
			"C:\\OrangeHRM_TestScrpitData\\paractice_Data.xlsx");

Workbook work=WorkbookFactory.create(fis);
Sheet s1=work.getSheet("Sheet1");
for(int i=0;i<=s1.getLastRowNum();i++) {

	String data=s1.getRow(i).getCell(3).getStringCellValue();

System.out.println(data);
}
}
}
