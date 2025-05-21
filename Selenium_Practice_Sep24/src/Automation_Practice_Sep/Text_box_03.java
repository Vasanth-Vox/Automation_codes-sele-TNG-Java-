package Automation_Practice_Sep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_box_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO text box works
		
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		//type name in text box
		WebElement type = driver.findElement(By.id("j_idt88:name"));
		type.sendKeys("Vasanth gopz");
		//appened text /retrieve also	
		WebElement append = driver.findElement(By.id("j_idt88:j_idt91"));
	    append.sendKeys("/Tamilnadu/india");
	    String value =   append.getAttribute("value");
		System.out.println("The text is " + value);
		//verify the chekc box enabled /disabled
		WebElement enable = driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean result = enable.isEnabled();
		System.out.println(result);
		//clear the box
		WebElement clearbox = driver.findElement(By.id("j_idt88:j_idt95"));
		clearbox.clear();
		//editor
		WebElement textedit = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]"));
		textedit.sendKeys("Vasanth_Vox");
		//make it bold 
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_toolbar\"]/span[5]/button[1]")).click();
		//make error
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		
		
		//Type your name and choose the third option
		WebElement type_select = driver.findElement(By.id("j_idt106:auto-complete_input"));
		type_select.sendKeys("vasanth");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li[3]")).click();
		
		
		//click and cancel
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/button[13]")).click();
		
		
		// width of text box
		WebElement width = driver.findElement(By.xpath("//input[@id='j_idt88:name' and @name = 'j_idt88:name']"));
		int height = width.getSize().getHeight();
		int widtht = width.getSize().getWidth();
		System.out.println("Text box height is " + height + "Textbox width is " + width);
		
		//POston of textbox
		WebElement position = driver.findElement(By.xpath("//div[5]//div//input[@id='j_idt88:j_idt99']"));
		Point xy = position.getLocation();
		int xvalue = xy.getX();
		int yvalue = xy.getY();
		System.out.println("position of X is" + xvalue + "position of Y value is " + yvalue);
		
		Thread.sleep(3000);
		driver.close();
	
		System.out.println("code ran succesfully & browser got closed now");
	

	}

}
