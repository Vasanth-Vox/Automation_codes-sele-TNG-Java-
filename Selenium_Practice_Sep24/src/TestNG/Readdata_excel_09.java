package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdata_excel_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String file = "./Read-excel/data-sheet.xlsx";
		
		XSSFWorkbook wbbook;
		try {
			FileInputStream fis = new FileInputStream(file);
		
			wbbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wbbook.getSheetAt(0);
		// it helps t print al rows sheet.getPhysicalNumberOfRows();
		int lastrow = sheet.getLastRowNum();
		int lastcel = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <=lastrow ; i++) {
			XSSFRow row =  sheet.getRow(i);
			for (int j = 0; j <lastcel; j++) {
				XSSFCell cell = row.getCell(j);
				/*String value = cell.getStringCellValue();
			System.out.println(value);*/

				//use data format methd to print numeric values inplace of string

				DataFormatter DFT = new DataFormatter();
				String value = DFT.formatCellValue(cell);

				System.out.println(value);
			}}
		fis.close();
		} catch (IOException e) {
            e.printStackTrace();
	}
	}
}
