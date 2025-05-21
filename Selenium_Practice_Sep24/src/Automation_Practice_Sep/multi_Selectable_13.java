package Automation_Practice_Sep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multi_Selectable_13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		//driver.get("https://letcode.in/dropable");
		driver.get("https://letcode.in/selectable");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement seleni = driver.findElement(By.xpath("//h3[text()='Selenium']"));
		WebElement Appium = driver.findElement(By.xpath("//h3[text()='Appium']"));
		WebElement Webd = driver.findElement(By.xpath("//h3[text()='Webdriver.io']"));
		
		Actions action = new Actions(driver);
		
	  /*action.clickAndHold(seleni).perform();
		action.clickAndHold(Appium).perform();
		action.clickAndHold(Webd).perform();*/
		
		action.keyDown(Keys.CONTROL).click(seleni).click(Appium).click(Webd).perform();
		
		Thread.sleep(3000);
		driver.close();

	}

}
