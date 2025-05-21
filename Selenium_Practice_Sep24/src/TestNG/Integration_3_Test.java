package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Integration_3_Test {
	
	@Test(dataProvider="getdata", dataProviderClass = Inegration_2_DP.class)
    public void loginto123(String[] loading) { // Change parameter type to String[]
        System.out.println("value 1: " + loading[0]);
        System.err.println("value 2: " + loading[1]);
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\890489\\Automation Testing Trainig phase"
                + "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        WebElement name = driver.findElement(By.id("email"));
        name.sendKeys(loading[0]);
        WebElement password = driver.findElement(By.xpath("//div//input[@id='password']"));
        password.sendKeys(loading[1]);
        
        WebElement button = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        button.click();
        System.out.println("completed successfully");

        driver.close();
    }
}



