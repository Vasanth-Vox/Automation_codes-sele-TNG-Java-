package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parameter_2 {
	
	
	@Test
	public void parameter2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1000, null);
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		//username.click();
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("username"));
		//password.click();
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(text(),'')]")).click();
		driver.close();
	}

}
