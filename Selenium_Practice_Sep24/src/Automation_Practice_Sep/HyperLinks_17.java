package Automation_Practice_Sep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks_17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node0rxdfo8ktt79x16gv4y89tp0317289397.node0");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement home = driver.findElement(By.linkText("Go to Dashboard"));
		home.click();
		driver.navigate().back();
		
		//Find the URL destination without clicking me.
		
		WebElement destination = driver.findElement(By.partialLinkText("ithout clicking me."));
		String reach = destination.getAttribute("href");
		System.out.println("url supose to go on " + reach);
		
		//find the broken
		
		WebElement broken = driver.findElement(By.linkText("Broken?"));
		broken.click();
		String brokenurl = driver.getTitle();
		if (brokenurl.contains("404")) {
			System.out.println("url is broken");
		}
		else {
			System.out.println("url is not broken");
		}
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement home2 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]/div[1]/div/div/a"));
		home2.click();
		
		driver.navigate().back();
		
		//count of links
		List<WebElement> count = driver.findElements(By.tagName("a"));
		int urlc = count.size();
		System.out.println("total url count s " + urlc);
		
		driver.close();

	}

}
//stale element exception will come when we use already identfied 
//peopertys, it will be changes once we back, forward or refresh action.
//so user find again