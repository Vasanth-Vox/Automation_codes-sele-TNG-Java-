package Page_object_model_FW;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM_Login_Details_1 {

	//basic structure
	/*public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	}
	public static WebElement Password(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	}
	public static WebElement Login(WebDriver driver) {
		return driver.findElement(By.xpath("//button"));
	}*/
	
	
	//Industry structure - using without findElemer
	@FindBy(how=How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	public static WebElement username;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	public static WebElement Password;
	
	@FindBy(xpath = "//button")
	public static WebElement login;
	
	

}
