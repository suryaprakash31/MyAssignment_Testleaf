package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class GetValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook("./Excelsheets/testdata.xlsx");
		//get sheet from excel
		XSSFSheet sheetAt = wb.getSheetAt(0);
		//get into the rowCount//ignore header value
		int rowCount = sheetAt.getLastRowNum();
		System.out.println("Row Count: " + rowCount);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Physical number of rows including header: " + physicalNumberOfRows);
		short lastCellNum = sheetAt.getRow(1).getLastCellNum();
		System.out.println("Column Count: "+lastCellNum);
		String stringCellValue = sheetAt.getRow(3).getCell(2).getStringCellValue();
		System.out.println("String cell value at row 3 cell 2 is: " + stringCellValue);
		//to get all values:
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String allValue = sheetAt.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println(allValue);
			}
			System.out.println("==================");
			
		}
		wb.close();
		


	}

}
