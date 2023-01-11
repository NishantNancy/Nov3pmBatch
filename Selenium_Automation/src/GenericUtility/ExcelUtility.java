package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String fetchStringDataFromExcelSheets(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fisexcel=new FileInputStream("./testData/Bookn.xlsx");
		Workbook workbook = WorkbookFactory.create(fisexcel);
		
		 return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
	}
	
	


}
