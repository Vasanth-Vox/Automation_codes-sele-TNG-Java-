package Automation_Practice_Sep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip_Text_12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		//driver.get("https://letcode.in/dropable");
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement tooltiphover = driver.findElement(By.id("menuform:j_idt38"));
		Actions hover = new Actions (driver);
		hover.moveToElement(tooltiphover).perform();
		Thread.sleep(3000);
		String textt = tooltiphover.getText();
		System.out.println(textt);
		
		driver.close();

	}

}
