package main_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class first_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("login.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		ExtentTest test = extent.createTest("vasanth maven");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vasanth@gmai.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("gopz");
		driver.findElement(By.xpath("//*[@id=\"signInForm\"]/div[3]/input")).submit();
		test.pass("Test passed");
		driver.quit();
		extent.flush();
	}

}
