package Automation_Practice_Sep;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_08 {

	public static void main(String[] args) {
		// TODO Alerts
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		//simple Alert
		
		WebElement simplea = driver.findElement(By.id("accept"));
		simplea.click();
		Alert accept = driver.switchTo().alert();
		accept.accept();
		
		// confirm alert
		WebElement confirm = driver.findElement(By.id("confirm"));
		confirm.click();
		Alert dismiss = driver.switchTo().alert();
		String text = dismiss.getText();
		System.out.println("Text"  +  text);
		dismiss.dismiss();

		//prompt alert
		driver.findElement(By.id("prompt")).click();
		Alert sendk = driver.switchTo().alert();
		sendk.sendKeys("vasanth u ready");
		sendk.accept();
		WebElement gettext = driver.findElement(By.id("myName"));
		String texta = gettext.getText();
		System.out.println("text " + texta);
		
		//smart alert/not alert
		driver.findElement(By.id("modern")).click();
		driver.findElement(By.xpath("//button[@class='modal-close is-large']")).click();
		
		
		driver.close();
		
		

	}

}
