package Automation_Practice_Sep;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles_09 {

	public static void main(String[] args) throws InterruptedException {
		// TODO code for window handles
		 
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/window.xhtml");
		//storing parent window
		String parentwindow = driver.getWindowHandle();
		String current = driver.getCurrentUrl();
		System.out.println("url is " + current);
		
		
		WebElement clicko = driver.findElement(By.id("j_idt88:new"));
		clicko.click();
		
		Set<String> childwindows = driver.getWindowHandles();
		int count = driver.getWindowHandles().size();
		System.out.println("Total window count is " + count);
		
		for (String newchildwindows : childwindows){
			driver.switchTo().window(newchildwindows);
			System.out.println("now current is " + driver.getCurrentUrl());
		}
		Thread.sleep(3000);
//driver.close();
driver.switchTo().window(parentwindow);
driver.close();

	}

}
