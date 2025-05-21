package stepDefinitions;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Data_driven_login_04 {
	WebDriver driver;
	
	
	@Given("the user is landed to login page")
	public void the_user_is_landed_to_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\890489\\Automation Testing Trainig phase"
                + "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        driver.manage().window().maximize();
		
	    }

	@When("if user enters username and password")
	public void if_user_enters_username_and_password(DataTable dataTable) {
		List<String> details = dataTable.asList(String.class);
		String Username = details.get(0);
		String passwrd = details.get(1);
		WebElement name = driver.findElement(By.id("email"));
		name.click();
        name.sendKeys(Username);
        WebElement password = driver.findElement(By.xpath("//div//input[@id='password']"));
        password.click();
        password.sendKeys(passwrd);
       
	}
	
	@Then("now click the login button to move home page")
	public void now_click_the_login_button_to_move_home_page() {
		WebElement button = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        button.click();
        System.out.println("completed successfully");
		
	}
	@BeforeSuite
	@Given("testng before dummy run")
	public void testng_before_dummy_run() {
		System.out.println("completed successfully");
		 System.out.println("completed successfully");
		 System.out.println("completed successfully"); 
	}
	


}
