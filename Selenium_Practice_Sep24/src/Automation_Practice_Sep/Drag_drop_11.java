package Automation_Practice_Sep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		//driver.get("https://letcode.in/dropable");
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		//drag & drop
		WebElement drag = driver.findElement(By.id("form:drag_content"));
		WebElement drop = driver.findElement(By.id("form:drop_content"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		//action.clickAndHold(drag).moveToElement(drop).release(drop).perform();
		
		

		//drag only
		WebElement element = driver.findElement(By.id("form:conpnl_content"));
		action.dragAndDropBy(element, 60, 90).perform();
		Thread.sleep(3000);

		System.out.println("Drag and drop happened successfullfy");
		driver.close();

	}

}
