package Page_object_model_FW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_Type_02 {
	
	public static WebElement username;
	public static WebElement password;
	public static WebElement submit;
	
	@Test
	public  void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\890489\\Automation Testing Trainig phase"
				+ "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		PageFactory.initElements(driver, POM_Type_02.class);
		
		username.sendKeys("student");
		password.sendKeys("Password123");
		submit.click();
		
		System.out.println("Code ran successfully");
		driver.quit();

}
}