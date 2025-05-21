package Automation_Practice_Sep;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;





public class Search_enter_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path2 = "./chromedriver/chromedriver.exe";
		//String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path2);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		//Click on harmburger menu
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		/*Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a"));
        actions.moveToElement(we).build().perform();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,500)", "");*/
		
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//WebElement scroll = driver.findElement(By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]"));
      //  executor.executeScript("arguments[0].scrollIntoView(true);", scroll);
		
		//click on tv arrow
		driver.findElement(By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]")).click();
		//click on tv on
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[9]/li[3]/a")).click();
		//now select year check box
		WebElement element = driver.findElement(By.id("apb-browse-refinements-checkbox_2"));
		element.isEnabled();
		System.out.println("yes" + element );
		element.click();
		//click on samsung
		driver.findElement(By.xpath("//*[@id=\"p_123/46655\"]/span/a/div")).click();
		//click add to cart
		driver.findElement(By.id("a-autoid-1-announce")).click();
		//view cart
		driver.findElement(By.linkText(" Go to Cart")).click();
		//click dd
		WebElement dds = driver.findElement(By.id("a-autoid-0-announce"));
		
		Select select = new Select(dds);
		select.selectByIndex(0);
		System.out.println("removed from cart & Search it new");
		//click on logo
		driver.findElement(By.id("nav-logo-sprites")).click();
		//search it now
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptop" + Keys.ENTER);
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
