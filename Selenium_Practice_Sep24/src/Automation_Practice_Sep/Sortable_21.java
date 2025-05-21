package Automation_Practice_Sep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/sortable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//find a xpath for entire list
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"cdk-drop-list-2\"]/div"));
		
		WebElement drag = elements.get(3);
		WebElement drop = elements.get(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		driver.close();

	}

}
