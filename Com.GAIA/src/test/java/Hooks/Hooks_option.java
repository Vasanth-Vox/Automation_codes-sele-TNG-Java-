package Hooks;

import java.io.File;
import java.io.IOException;

import org.junit.runner.manipulation.Orderable;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import stepDefinitions.BaseClass;

public class Hooks_option {
	WebDriver driver = BaseClass.driver;

	/*
	 * @Before(order = 1) public void beforemethod() {
	 * System.out.println("First he was born"); }
	 * 
	 * @After(order = 1) public void Aftermethod() { System.out.
	 * println("He will be going to acheive his passion one day - He believe"); }
	 */
	@Before("@First")
	public void Human2() {
		System.out.println("First - Run Scenario");
	}

	@After ("@First")
  public void God2() {
 System.out.println("After - Run First Scenario");
 }
	@Before("@Second")
	public void Human4() {
		System.out.println("Before - Run First Scenario");
	}

	@After ("@Second")
  public void God4() {
 System.out.println("Second - Run Scenario");
 }

	/*
	 * @BeforeStep () public void Human() {
	 * System.out.println("God should decide he was born"); }
	 * 
	 * @AfterStep () public void screenshotafter() throws IOException{ // TODO
	 * Auto-generated method stub // // String path =
	 * "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe"
	 * ; // System.setProperty("webdriver.chrome.driver", path); // // WebDriver
	 * driver = new ChromeDriver();
	 * 
	 * System.out.println("Taking a screenshot after each step..."); TakesScreenshot
	 * screnn1 = (TakesScreenshot) driver; File location =
	 * screnn1.getScreenshotAs(OutputType.FILE);
	 * 
	 * String filepath =
	 * "C:\\Users\\890489\\OneDrive - Cognizant\\Desktop\\MRRS\\Storage_screenshot"+
	 * System.currentTimeMillis() + ".png"; File storage = new File (filepath);
	 * 
	 * FileHandler.copy(location, storage);
	 * 
	 * 
	 * WebElement screen3 = driver.findElement(By.xpath(
	 * "//*[@id=\"container-2a25a4860e\"]/div/header/div[2]/div/div[1]/ul/li[3]/a"))
	 * ; screen3.click();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * TakesScreenshot screen2 = (TakesScreenshot) driver; location =
	 * screen2.getScreenshotAs(OutputType.FILE);
	 * 
	 * String filepath2 =
	 * "C:\\Users\\890489\\OneDrive - Cognizant\\Desktop\\GAIA\\GAIA 5.0\\tookss05.png"
	 * ; File storage2 = new File (filepath2); FileHandler.copy(location, storage2);
	 * 
	 * //https://practicetestautomation.com/practice-test-login/" //Ctrl + A & Ctrl
	 * + I = alignment //driver.close();
	 * 
	 * System.out.println("Code ran successfully" + filepath); }
	 * 
	 * @After public void tearDown() { if (driver != null) { driver.quit(); } }
	 */
}

//if user has different after/before for each scenario then use "Hookstags".
//if user has different after/before for same scenario or feature use "Order"