package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Data_driven_2type_05 {

	WebDriver driver;
	@Given("the user is landed to login page2")
	public void the_user_is_landed_to_login_page2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\890489\\Automation Testing Trainig phase"
                + "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        driver.manage().window().maximize();
	}

	@When("if2 user enters username and password")
	public void if2_user_enters_username_and_password(DataTable dataTables) {
		
	List<Map<String, String>> key_value = dataTables.asMaps(String.class, String.class);
	String uname = key_value.get(0).get("userName");
	String pwdd = key_value.get(0).get("password");
	
	WebElement name = driver.findElement(By.id("email"));
	name.sendKeys(uname);
    WebElement password = driver.findElement(By.xpath("//div//input[@id='password']"));
    password.sendKeys(pwdd);
	}

	@Then("now click the login button to move home page2")
	public void now_click_the_login_button_to_move_home_page2() {
		WebElement button = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        button.click();
        System.out.println("completed login successfully");
        //driver.close();
	}



}
