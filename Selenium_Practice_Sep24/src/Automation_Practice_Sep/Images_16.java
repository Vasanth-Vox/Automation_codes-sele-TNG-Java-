package Automation_Practice_Sep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement image1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/a[4]/div/div/div/div/img"));
		image1.click();
		
		
		WebElement image2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[4]/div/div[2]/div/div/div[1]/div/div[1]/div/a/div[1]/div/img"));
		//current page naturalWidth = 9
		if(image2.getAttribute("naturalWidth").equals(0)) {
			System.out.println("image is broken");
		} else {
			System.out.println("image is not broken");
		}
		
		driver.close();

	}

}
