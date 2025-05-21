package Automation_Practice_Sep;

import static org.junit.Assert.assertArrayEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Get_Title_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.cognizant.com");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		String exptitle = driver.getTitle();
		String Acttite = "Cognizant|cheers";
		
		//Assert.assertEquals(exptitle, false);
		
		if (Acttite.equalsIgnoreCase(exptitle)) {
			System.out.println("Content is same with title");
		
		}
		else {
			System.out.println("Break it");
		}
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.close();
	
}
}