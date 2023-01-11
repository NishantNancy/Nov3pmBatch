package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchClassDetailsFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./testData/Book3.xlsx");
		
		 Workbook workbook = WorkbookFactory.create(fis);
		 
		 String name1 = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
		 boolean gf = workbook.getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
		 double age = workbook.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();
		 
		 System.out.println(gf);
		 System.out.println(name1);
		 System.out.println(age);

	}

}
 