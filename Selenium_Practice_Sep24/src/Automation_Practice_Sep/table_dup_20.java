package Automation_Practice_Sep;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_dup_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.id("simpletable"));
		//find the table column size
		List<WebElement> colsize = 	table.findElements(By.tagName("th"));
		int countc = colsize.size();
		System.out.println("Column count is" + countc);
		//print the column text
		for (WebElement webElementc : colsize) {
			String textc = webElementc.getText();
			System.out.println(textc);
		}
		
		//find the table row size
		List<WebElement> row_size = table.findElements(By.cssSelector("tbody tr"));
		int rowS = row_size.size();
		System.out.println(rowS);
		if (rowS==3) {
			System.out.println("row is pass");
		} else {
			System.out.println("row is fail");
		}
		// print the column text
		for (WebElement webElementr : row_size) {
			String textr = webElementr.getText();
			System.out.println(textr);
		}
		
		
		//now find & print the particular row tds
		
		for (WebElement rowtext : row_size) {
			List<WebElement> colum1 = 	rowtext.findElements(By.tagName("td"));
			WebElement textp = colum1.get(0);
			String print = textp.getText();
			System.out.println("printing the specfic columns text");
			System.out.println(print);
				
		
		//in the above check if yeswanth matches tick the box
		
		if (("Yashwanth").equals(print)) {
			WebElement cbox = colum1.get(3).findElement(By.tagName("input"));
			cbox.click();
			
			
		} else {
			System.out.println("not same with text");
		}
		
		}
		
		System.out.println("code ran done");
		
		
		
		
		
		
	List<WebElement> addition = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[2]"));
	
	int sum = 0;
 // Iterate through each price element and add the price to the sum
    for (WebElement priceElement : addition) {
        int price = Integer.parseInt(priceElement.getText());
        sum += price;
      
    }
    System.out.println("totla is " + sum);
		
		//table[@id='shopping']/tbody/tr/td[2][contains(text(),'150')]
		//(//table[@id='shopping']/tbody/tr/td[2])[1]
driver.close();
	}

}
