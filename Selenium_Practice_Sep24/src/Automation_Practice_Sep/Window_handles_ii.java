package Automation_Practice_Sep;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles_ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(100, null);
		// store parent window before any actions
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		String parenturl = driver.getCurrentUrl();
		System.out.println("Tit,e of parent is " + parenturl);

		driver.findElement(By.id("home")).click();
		Set<String> childwin = driver.getWindowHandles();
		System.out.println("both id is " + childwin);
		List<String> childwindow = new ArrayList<String>(childwin);

		driver.switchTo().window(childwindow.get(1));
		String bothurl = driver.getCurrentUrl();
		System.out.println("Title of parent is " + bothurl);
		String pagetitle = driver.getTitle();
		System.out.println("Title is " + pagetitle);
		driver.switchTo().window(childwindow.get(0));

		driver.findElement(By.id("multi")).click();
		Set<String> childwin2 = driver.getWindowHandles();
		childwindow = new ArrayList<String>(childwin2);

		//ordered way - for (int i = 0; i < childwindow.size(); i++)
			for (int i=childwindow.size()-1; i>=0;i--)
		{
			driver.switchTo().window(childwindow.get(i));
			
			driver.close();
		}
		System.out.println("COunt is" + childwindow.size());
		/*
		 * driver.switchTo().window(childwindow.get(2)); driver.close();
		 * driver.switchTo().window(childwindow.get(1)); driver.close();
		 * driver.switchTo().window(childwindow.get(0)); driver.close();* /*Set<String>
		 * childwin2 = driver.getWindowHandles(); childwindow.clear();
		 * childwindow.addAll(childwin2); driver.switchTo().window(childwindow.get(0));
		 * driver .close();
		 * 
		 * driver.findElement(By.id("multi")).click(); //Set<String> childwin3 =
		 * driver.getWindowHandles();   
		 */

		System.out.println("code ran successfully");

	}

}
