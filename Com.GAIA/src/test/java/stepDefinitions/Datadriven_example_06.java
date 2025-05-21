package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datadriven_example_06 {
	WebDriver driver;
	@Given("the user is landed to login page now")
	public void the_user_is_landed_to_login_page_now() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\890489\\Automation Testing Trainig phase"
                + "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        driver.manage().window().maximize();
	    
	}

	@When("if2 user enters {string} and {string} now")
	public void if2_user_enters_and_now(String uname, String pwdd) {
		WebElement name = driver.findElement(By.id("email"));
		name.sendKeys(uname);
	    WebElement password = driver.findElement(By.xpath("//div//input[@id='password']"));
	    password.sendKeys(pwdd);
	}

	@Then("now click the login button to move home page now")
	public void now_click_the_login_button_to_move_home_page_now() {
		WebElement button = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        button.click();
        System.out.println("completed login successfully");
	}




}
