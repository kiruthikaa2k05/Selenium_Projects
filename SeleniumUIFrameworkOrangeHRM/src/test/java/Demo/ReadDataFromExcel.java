package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\OrangeHRM_TestScript_Data\\Book1.xlsx");
		//1.Navigating into workbook
		Workbook workbook = WorkbookFactory.create(fis); //virtual copy of physical file with help of workbook
	    //2.Navigating into sheet
		 Sheet sheet = workbook.getSheet("Sheet1");
		//3.navigating into row
		Row row = sheet.getRow(1);
		//4.Navigating into cell
		Cell cell = row.getCell(1);
		String vacanyName = cell.getStringCellValue();
		//it should read the first vacancy name 
		System.out.println(vacanyName);
		
		for(int i=0;i<=sheet.getLastRowNum();i++) {
			System.out.println(sheet.getRow(i).getCell(1).getStringCellValue());
		}
	
	
	
	}

}
