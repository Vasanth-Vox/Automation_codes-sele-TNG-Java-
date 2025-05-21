package Automation_Practice_Sep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar_Picking_18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		/*driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement calender = driver.findElement(By.id("datetimepicker1"));
		calender.click();
		Thread.sleep(3000);
		//select year from dd
		WebElement uparrow = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/span[1]"));
		uparrow.click();
		//select month from dropdown
		WebElement month = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/select"));
		Select select = new Select(month);
		select.deselectByVisibleText("June");
		//select date 
		WebElement clickdate = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/span[25]"));
		clickdate.click();*/
		
		
		driver.get("https://letcode.in/calendar");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement date20 = driver.findElement(By.xpath("//button[contains(text(),'20')][1]"));
		date20.click();
		Thread.sleep(3000);
		
		WebElement panel = driver.findElement(By.xpath("//input[@class='datetimepicker-dummy-input is-datetimepicker-range']"));
		panel.click();
		
		WebElement dt30 = driver.findElement(By.xpath("//button[contains(text(),'30')]"));
		dt30.click();
	}

}
