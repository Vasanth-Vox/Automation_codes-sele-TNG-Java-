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

public class Before_After_TestNG_03 {
	WebDriver driver;
	long startime;
	long endtime ;
	@BeforeSuite
	public void openBrowser() {
		startime = System.currentTimeMillis();
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
	public void Leafground() {
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node0rxdfo8ktt79x16gv4y89tp0317289397.node0");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		WebElement home = driver.findElement(By.linkText("Go to Dashboard"));
		home.click();
		driver.navigate().back();
	}
	
	@Test
	public void Flipkart() {
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[4]/div/div/div/div/img"));
		image1.click();
	

	}
	
	@AfterSuite
	public void endBrowser() {
		 endtime = System.currentTimeMillis();
		long total = endtime-startime;
		System.out.println("Total time taken is" + total);
		driver.close();
		
	}

}

