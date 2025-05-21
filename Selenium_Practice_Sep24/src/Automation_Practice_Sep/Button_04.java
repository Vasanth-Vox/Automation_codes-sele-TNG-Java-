package Automation_Practice_Sep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		//click on element tab & button icon in panle
		
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='menuform:m_button']")).click();
		
		//disable
		WebElement enable = driver.findElement(By.xpath("//button[contains(@id,'j_idt88:j_idt92')]"));
		Boolean val = enable.isEnabled();
		System.out.println(val);
		 
		//position
		WebElement position = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
		//Point XYV = position.getLocation();
		int x = position.getLocation().getX();
		int y = position.getLocation().getY();
		System.out.println("Xvalue " + x + " y value " + y);
		
		//color- bg
		WebElement color = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96' and @name='j_idt88:j_idt96']"));
		String colors = color.getCssValue("background");
		System.out.println("Button color is " + colors);
		
		//hover over
		WebElement element = driver.findElement(By.id("j_idt88:j_idt100"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		
		//click uncick
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
		//driver.findElement(By.xpath("//div[@class='card ui-fluid']")).click();
		
		//width & heigt
		WebElement widt = driver.findElement(By.xpath("//div//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"));
		int height = widt.getSize().getHeight();
		int weignt = widt.getSize().getWidth();
		System.out.println(" Height is " + height + "width is " + weignt);
		
		//total buttons count
		List <WebElement> buttons = driver.findElements(By.tagName("button"));
		int total = buttons.size();
		System.out.println("Count is " + total);
	
		System.out.println("code ran successfully");
		
		driver.close();
	}

}
