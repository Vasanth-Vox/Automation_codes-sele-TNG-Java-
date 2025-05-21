package Automation_Practice_Sep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button_Checkbox_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		driver.manage().window().maximize();
		
		//select any radio button
		
		WebElement select1 = driver.findElement(By.xpath("//label[@class='radio']/input[@id='foo']"));
		select1.click();
		
		//find the disabled button
		
		WebElement disabled = driver.findElement(By.id("maybe"));
		Boolean value = disabled.isEnabled();
		System.out.println("Button is  "  + value);
		
		//finding the already selected one
		WebElement existselection = driver.findElement(By.xpath("//label[@class='radio']/input[@id='foo']"));
		Boolean val0 = existselection.isSelected();
		System.out.println("button value is " + val0);
		String val = existselection.getText();
		System.out.println("selected text is ex " + val);
		
		
		
		//Checkboxes
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'][1]")).click();
		
		///select and cancel pop up
		
	    driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]")).click();
	    Thread.sleep(3000);
		
		//tristate
	    int i = 0;
	    while(i<=2) {
	    driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
	    //Thread.sleep(3000);
	    i++;
	    }
	  
	    //multi select checkbox
	    driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
	    //select option from List box
	    WebElement multi1 =  driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[1]/div/div[2]"));
	    multi1.click();
	    driver.findElement(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked'][3]")).click(); 
	    driver.findElement(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked'][6]")).click();
	    
	    Thread.sleep(3000);
	    
		System.out.println("code ran successfully ");
		driver.close();
		
	}

}
