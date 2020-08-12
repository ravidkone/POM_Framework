import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelFile {

	public static void main(String[] args) {
		String sFile = System.getProperty("user.dir")+"/testExcel.xls";
		//Libreoffice --> MSExcel --> paid version 
		// Java will not methods to read or write excel
		// Third party libraries whihc is available. You have to download those and add it to the project
		// poi<version>.jar  --> you guys will get it from our google drive
	// Go to Project + RightClick + BuildPath --> Configure Build Path
	//Libraries Tab + Add External Jar (using file explore selected the jar file) + Apply and close)
		
		//DONT CREATE EXCEL FILE USING ECLIPSE --> Create Using Excel file it will work
		//TO READ XLS file :  Jar required only poi-3.9.jar
/*try {
		FileInputStream fi = new FileInputStream(sFile);
		//Threads, Thread safe, Stringbufffer
		// clone - Excel
		HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(sFile));
		HSSFSheet myExcleSheet = myExcelBook.getSheet("InsructorInfo");
		HSSFRow row1 = myExcleSheet.getRow(0);
		System.out.println(row1);
		System.out.println(row1.getCell(0).getStringCellValue());
		System.out.println(row1.getCell(1).getNumericCellValue());
		System.out.println(row1.getCell(2).getStringCellValue());
		HSSFRow row3 = myExcleSheet.getRow(2);
		System.out.println(row3.getCell(0).getStringCellValue());
		System.out.println(row3.getCell(1).getNumericCellValue());
		System.out.println(row3.getCell(2).getStringCellValue());
		
		
	}catch(Exception a) {
		System.out.println(a);
	}
*/
try {
	//TO READ XLSX file : Jar Required :: xmlbeans-3.1.0.jar,poi-ooxml-4.1.2.jar,
	//poi-4.1.2.jar,dom4j-1.6.1.jar,commons-math3-3.6.1.jar,commons-collections4-4.1.jar,
	//commons-compress-1.18.jar,commons-codec-1.14.jar
	sFile = System.getProperty("user.dir")+"/testExcel.xlsx";
	XSSFWorkbook myExBook1 = new XSSFWorkbook(new FileInputStream(sFile));
	XSSFSheet myExcelSheet1 = myExBook1.getSheet("InsructorInfo");
	XSSFRow row1_1 = myExcelSheet1.getRow(0);

	System.out.println(row1_1.getCell(0).getStringCellValue());
	System.out.println(row1_1.getCell(1).getNumericCellValue());
	System.out.println(row1_1.getCell(2).getStringCellValue());

	
	//To write it into Excel File
	Workbook book = new XSSFWorkbook();
    Sheet sheet = book.createSheet("Birthdays");
    Row row = sheet.createRow(0); 

    Cell name = row.createCell(0);
    name.setCellValue("Sri");
    sheet.autoSizeColumn(1);
    
    book.write(new FileOutputStream("Temp.xls"));
    book.close();
	System.out.println("Done");
	
}catch(Exception b) {
	System.out.println(b);
}

/*
 File Handling --> txt read /write
 .properties file --> getting properties from them
 Excel file reaading 
 * */
	}

}
