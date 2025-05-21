package Automation_Practice_Sep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Keyboard_Robot_23 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       Robot robot = new Robot();
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.click();
		 robot.keyPress(KeyEvent.VK_WINDOWS);
		//Robot robot = new Robot();
		String names = "Vasanth";
		name.sendKeys(names);
		//robot.keyPress(KeyEvent.VK_BACK_SPACE);
		// Use Robot to perform BACKSPACE action
 
        
        // Simulate BACKSPACE key press and release for each character
		/*
		 * for (int i = 0; i < names.length(); i++) { // Adjust count to match the
		 * length of the input robot.keyPress(KeyEvent.VK_BACK_SPACE);
		 * robot.keyRelease(KeyEvent.VK_BACK_SPACE); }
		 */
		/*
		 * robot.keyPress(KeyEvent.VK_TAB); robot.keyPress(KeyEvent.VK_TAB);
		 * robot.keyPress(KeyEvent.VK_RIGHT);
		 */
		
       
		
		
		

	}

}
