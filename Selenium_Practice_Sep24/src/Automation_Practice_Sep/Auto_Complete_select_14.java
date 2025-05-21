package Automation_Practice_Sep;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Complete_select_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		//driver.get("https://letcode.in/dropable");
		driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("S");
		
		List<WebElement> alloption = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
	
		System.out.println("count is " + alloption.size());
		
		for (WebElement webElements : alloption) {
			if (webElements.getText().equals("Lisp")) {
				webElements.click();
				System.out.println("Text got clicked");
				System.out.println("Text is same " + webElements.getText());
				break;
			} else {
				System.out.println("iteration is not matching with text");
			}
		} 
		
		driver.close();
		System.out.println("ran successfully");

	}

}
