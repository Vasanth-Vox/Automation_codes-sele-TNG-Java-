package Automation_Practice_Sep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_page_22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/calendar");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		//Scroll to the Top of the Page
		scroll.executeScript("window.scrollTo(0, 0)");
		
		//Scroll to the Bottom of the Page
		scroll.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//Scroll to a Specific Element
		WebElement element = driver.findElement(By.id("xxx"));
		scroll.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//Scroll by Pixel
		 scroll.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		//driver.close();
		

	}

}
