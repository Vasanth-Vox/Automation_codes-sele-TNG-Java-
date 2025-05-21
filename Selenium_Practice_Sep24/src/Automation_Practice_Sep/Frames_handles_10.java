package Automation_Practice_Sep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_handles_10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
	    driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		String text = frame1.getText();
		System.out.println("Text is" + text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement nestedframe = driver.findElement(By.id("Click"));
		nestedframe.click();
		System.out.println("nested clicked successfully");
		
		List<WebElement> finalf = driver.findElements(By.xpath("//iframe"));
		Thread.sleep(4000);
		int number = finalf.size();
		//Thread.sleep(4000);
		System.out.println("total num of frames is " + number);
		
		driver.close();
		
		
		
		
		

	}

}
