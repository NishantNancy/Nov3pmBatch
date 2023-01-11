package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ToWriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//the physical representation ogf excel file to java representation
		FileInputStream fis=new FileInputStream("./testData/Book5.xlsx");
		// loading the java representation
		Workbook workbook = WorkbookFactory.create(fis);
		// writing the data in java representation
		workbook.getSheet("Sheet1").getRow(1).createCell(4).setCellValue("Value");
		
		FileOutputStream fos=new FileOutputStream("./testData/Book5.xlsx");
		
		workbook.write(fos);
		System.out.println("Data is modified");
		
		
		
		

	}

}
