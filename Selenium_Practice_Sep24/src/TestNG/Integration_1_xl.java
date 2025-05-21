package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Integration_1_xl {
	public static String[][] Excelmainlogin() {
		// TODO Auto-generated method stub

		String file = "./Read-excel/data-sheet.xlsx";
		
		XSSFWorkbook wbbook = null;
		try {
			FileInputStream fis = new FileInputStream(file);
		
			wbbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wbbook.getSheetAt(0);
		// it helps t print al rows sheet.getPhysicalNumberOfRows();
		int lastrow = sheet.getLastRowNum();
		int lastcel = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[lastrow][lastcel];
		for (int i = 1; i <=lastrow ; i++) {
			XSSFRow row =  sheet.getRow(i);
			for (int j = 0; j <lastcel; j++) {
				XSSFCell cell = row.getCell(j);
				/*String value = cell.getStringCellValue();
			System.out.println(value);*/

				//use data format methd to print numeric values inplace of string

				DataFormatter DFT = new DataFormatter();
				String value = DFT.formatCellValue(cell);

				//System.out.println(value);
				data[i-1][j]= value;
			
			}}
		fis.close();
		
		
		
		} catch (IOException e) {
            e.printStackTrace();
	}
		return null;
		
	}
	//return data();

}
