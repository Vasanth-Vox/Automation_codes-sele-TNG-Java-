package Automation_Practice_Sep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_one_19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();


		WebElement table = driver.findElement(By.id("simpletable"));
	
		List<WebElement> headers =   table.findElements(By.tagName("th"));
		int size = headers.size();
		System.out.println("total header count is " + size);
		for (WebElement columntext : headers) {
			String texting = columntext.getText();
			System.out.println(texting);
		}
	
		List<WebElement> rows =   table.findElements(By.cssSelector("tbody tr"));  //(By.Css selector("tbody tr")
		int Rsize = rows.size();
		System.out.println("total rows count is " + Rsize);
		if (Rsize==3) {
			System.out.println("pass");
		} else { System.out.println("fail");}
		
		for (WebElement frows : rows) {
			List<WebElement> firstrows =	frows.findElements(By.tagName("td"));
			WebElement value = firstrows.get(1);
			WebElement value1 = firstrows.get(2);
			System.out.println(value.getText() +
					value1.getText());
		}
		
		/*for (int i = 0; i < Rsize; i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			WebElement firstc = columns.get(1);
			String text = firstc.getText();
			System.out.println(text);
			if (text.equals("Yashwanth")) {
				WebElement clicking = rows.get(3).findElement(By.id("second"));
				clicking.click();
			break;
			}
		}*/
		//td[normalize-space()=Raj]//following::td[1]
		
		for (WebElement actrows : rows) {
			List<WebElement> column =  actrows.findElements(By.tagName("td"));
			WebElement firstc = column.get(1);
			String text = firstc.getText();
			System.out.println(text);
			if (text.equals("Raj")) {
				WebElement clicking = column.get(3).findElement(By.tagName("input"));
				clicking.click();
				Thread.sleep(3000);
			break;
			}
			
		}
		

		System.out.println("code ran successfully ");
		//Thread.sleep(5000);
		driver.close();
		

	}
}
