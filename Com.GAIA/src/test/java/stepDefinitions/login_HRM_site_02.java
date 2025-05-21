package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Classes.page_class_objects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_HRM_site_02 {
	
	page_class_objects Objectstore = new page_class_objects();
WebDriver driver;
@Given("user is landed to login page")
public void user_is_landed_to_login_page() {
    // Write code here that turns the phrase above into concrete actions
	String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
  
}

@When("user enters username and password")
public void user_enters_username_and_password() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	driver.findElement(Objectstore.userfield).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
   
}

@When("click the login button to move home page")
public void click_the_login_button_to_move_home_page() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	String AT = driver.getTitle();
	String ET = "OrangeHRM";
	if (AT.equals(ET)) {
		System.out.println("user has logged successfuly");
	} else {
		System.out.println("Login errors");
	}

}

@Then("user do any simple actions inside the page {string}")
public void user_do_any_simple_actions_inside_the_page(String Middlename) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
	Thread.sleep(3000);
	//middle name
	driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys(Middlename);
	
	

}


}
