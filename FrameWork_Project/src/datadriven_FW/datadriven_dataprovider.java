package datadriven_FW;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class datadriven_dataprovider {
	
	
	String[][] data = null;
	WebDriver driver;

	@DataProvider(name="passing")
	public String[][] dataprovider() throws IOException {
		
		data=Exceldata();
		return data;
		
	}
	//
	public String[][] Exceldata() throws IOException{
		String filepath = "./dataexcel/datadriven-sheet.xlsx";
		FileInputStream file = new FileInputStream(filepath);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheetAt(0);
		int lastrows = sheet.getLastRowNum();
		int lastcell = sheet.getRow(0).getLastCellNum();
		
		String[][] retrivedata = new String[lastrows][lastcell];
		for (int i=1;i<=lastrows;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0;j<lastcell;j++) {
				XSSFCell cell = row.getCell(j);
				//String value = cell.getStringCellValue();
				DataFormatter DFC = new DataFormatter();
				String value = DFC.formatCellValue(cell);
				retrivedata[i-1][j] = value;
				System.out.println(value);
		}
		}
		return retrivedata;
	}
	//
	
	@Test(dataProvider = "passing")
    public void loginto123(String Username, String passwrd) { // Change parameter type to String[]
        
       
        WebElement name = driver.findElement(By.id("email"));
        name.sendKeys(Username);
        WebElement password = driver.findElement(By.xpath("//div//input[@id='password']"));
        password.sendKeys(passwrd);
        
        WebElement button = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        button.click();
        System.out.println("completed successfully");

        
    }
	
	@BeforeTest
	public void before() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\890489\\Automation Testing Trainig phase"
	                + "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe");
	         driver = new ChromeDriver();
	        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
	}
	@AfterTest
	public void after() {
		driver.close();
	}
	

}
