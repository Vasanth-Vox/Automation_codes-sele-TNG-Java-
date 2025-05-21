package Page_object_model_FW;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POM_Runner {

	@Test
	public  void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\890489\\Automation Testing Trainig phase"
				+ "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//login site - first
		/*WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button"));
		login.click();*/

		//basic structure
		/*POM_Login_Details_1.userName(driver).sendKeys("Admin");
		POM_Login_Details_1.Password(driver).sendKeys("admin123");
		POM_Login_Details_1.Login(driver).click();*/
		
		PageFactory.initElements(driver, POM_Login_Details_1.class);
		
		//industry structure 
		POM_Login_Details_1.username.sendKeys("Admin");
		POM_Login_Details_1.Password.sendKeys("admin123");
		POM_Login_Details_1.login.click();
		
		
		//filling inside - second
		/*WebElement MyInfo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
		MyInfo.click();
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span"));
		radiobutton.click();
		WebElement Save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));
		Save.click();*/
		
		//basic structure
		/*POM_profile_2.profiletab(driver).click();
		POM_profile_2.Radiobutton(driver).click();
		POM_profile_2.Savebutton(driver).click();*/
		
		PageFactory.initElements(driver, POM_profile_2.class);
		
		//Industy structure
		POM_profile_2.profile.click();;
		POM_profile_2.radio.click();
		POM_profile_2.save.click();
		
		System.out.println("both task run successfull;y");
		driver.close();
	}

}


