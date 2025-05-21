package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Parallel_TestNG_07 {
	WebDriver driver;
	@BeforeSuite
	public void beforeall() {
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
	}
	@Test
	public void Code_Let() {
		driver.get("https://letcode.in/table");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> rows =   table.findElements(By.cssSelector("tbody tr"));  //(By.Css selector("tbody tr")
		int Rsize = rows.size();
		System.out.println("total rows count is " + Rsize);

	} 
	@Test
	public void Code_Let1() {
		driver.get("https://letcode.in/table");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> rows =   table.findElements(By.cssSelector("tbody tr"));  //(By.Css selector("tbody tr")
		int Rsize = rows.size();
		System.out.println("total rows count is " + Rsize);

	} 


	
	/*
	 * @Test public void Leafground() { driver.get("https://www.flipkart.com/");
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * //driver.manage().window().maximize(); WebElement image1 =
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"container\"]/div/div[1]/div/div/div/div/" +
	 * "div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[4]/div/div/div/div/img"
	 * )).click(); }
	 */
	
	@AfterSuite
	public void afterall() {
		driver.quit();
	}
	

}
