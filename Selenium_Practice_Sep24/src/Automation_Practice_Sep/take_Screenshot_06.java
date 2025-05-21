package Automation_Practice_Sep;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class take_Screenshot_06 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cognizant.com");
		driver.manage().window().maximize();

		TakesScreenshot screnn1 = (TakesScreenshot) driver;
		File location = screnn1.getScreenshotAs(OutputType.FILE);

		String filepath = "C:\\Users\\890489\\OneDrive - Cognizant\\Desktop\\GAIA\\GAIA 5.0\\tookss01.png";
		File storage = new File (filepath);

		FileHandler.copy(location, storage);

		WebElement screen3 = driver.findElement(By.xpath("//*[@id=\"container-2a25a4860e\"]/div/header/div[2]/div/div[1]/ul/li[3]/a"));
		screen3.click();

		Thread.sleep(3000);

		TakesScreenshot screen2 = (TakesScreenshot) driver;
		location = screen2.getScreenshotAs(OutputType.FILE);

		String filepath2 = "C:\\Users\\890489\\OneDrive - Cognizant\\Desktop\\GAIA\\GAIA 5.0\\tookss05.png";
		File storage2 = new File (filepath2);	
		FileHandler.copy(location, storage2);	

		//https://practicetestautomation.com/practice-test-login/"
		//Ctrl + A  & Ctrl + I = alignment
		driver.close();

		System.out.println("Code ran successfully");
	}


}
