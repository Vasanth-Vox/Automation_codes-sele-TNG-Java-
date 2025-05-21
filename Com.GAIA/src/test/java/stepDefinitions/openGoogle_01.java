package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class openGoogle_01 {
	WebDriver driver = BaseClass.driver;
	
	
	@Given("User login to cts site")
	public void user_login_to_cts_site() {
	    // Write code here that turns the phrase above into concrete actions
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.get("https://www.cognizant.com/in/en");
		driver.manage().window().maximize();
	    
	}

	@When("when user enter any terms and type {string}")
	public void when_user_enter_any_terms_and_type(String searchword) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(searchword);
		Thread.sleep(3000);
	}

	@When("user action press enter")
	public void user_action_press_enter() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

	}

	@Then("User able to achieve it")
	public void user_able_to_achieve_it() {
	    // Write code here that turns the phrase above into concrete actions
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		//driver.close();
	    
	}

	 
}
