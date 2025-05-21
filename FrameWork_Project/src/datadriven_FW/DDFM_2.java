package datadriven_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class DDFM_2 {
	//commits
	WebDriver driver ;
	String[][] data = null;
	
	@DataProvider(name = "datastore")
	public String[][] dataprovider() throws IOException {
		data = readxlfile();
		return data;
	}
	
	public String[][] readxlfile() throws IOException {
		String filepath = "./dataexcel/datadriven-sheet.xlsx";
		FileInputStream fiss = new FileInputStream(filepath);
		XSSFWorkbook book = new XSSFWorkbook(fiss);
		XSSFSheet sheet = book.getSheetAt(0);
		int lastrow = sheet.getLastRowNum();
		int lastcell = sheet.getRow(0).getLastCellNum();
		
		String[][] printxldata = new String[lastrow][lastcell];
		for(int i=1;i<=lastrow;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<lastcell;j++) {
				XSSFCell cell = row.getCell(j);
				//String value = cell.getStringCellValue();
				DataFormatter DFB = new DataFormatter();
				String value = DFB.formatCellValue(cell);
				System.out.println("value data is " + cell);
				printxldata[i-1][j]=value;
				
			}
		}
		return printxldata;
	}
	
	
	
	
	
	
	
		@Test(dataProvider = "datastore")
	public void loginpage(String Uname, String passd) {
		
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		username.sendKeys(Uname);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		password.sendKeys(passd);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		button.click();
		//driver.close();
}
		@BeforeTest
		public void beforetest() {
			String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
			
		}
		@AfterTest
		public void Aftertest() {
			driver.close();
		}
		}
