package Automation_Practice_Sep;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_Upload_15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\890489\\Automation Testing Trainig phase\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		//driver.get("https://letcode.in/dropable");
		try {
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	// upload a file
		//if a file is in ur project insted local
		
		/*WebElement upload0 = driver.findElement(By.id("uploadFile"));
		File upath = new File(".\sampleFile.jpeg");
		upload0.sendKeys("upath.getAbsoluteFile()");
		System.out.println("File uploaded successfully");*/
		
		
		//WebElement upload = driver.findElement(By.id("uploadFile"));
		//upload.sendKeys("C:\\Users\\890489\\OneDrive - Cognizant\\Documents\\Snippy's\\PC_7.png");
		//System.out.println("File uploaded successfully");
		
		
		WebElement download = driver.findElement(By.id("downloadButton"));
		download.click();
		
		Thread.sleep(3000);
		
		String downloadpath = "C:\\Users\\890489\\Downloads";
		String filename = "sampleFile.jpeg";
		
		File file = new File(downloadpath + "/" + filename);
        if (file.exists()) {

  
            System.out.println("File downloaded successfully! and present" +   file.getName());
        } else {
            System.out.println("File download failed.");
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    } 
        driver.quit();
		
    }}
		
		//if a file is in ur project insted local - uese "user.dir" to download/upload.
		/*String paths = System.getProperty("user.home")+"/Downloads/";
		
		File location = new File(paths);
		
		File[] arraylist = location.listFiles();
		
		for (File filesinlocal : arraylist) {
			
			if (filesinlocal.getName().equals("sampleFile")) {
				System.out.println("file dowloaded and name is " + filesinlocal.getName() );
				break;
			}
			else {
				System.out.println("no files found in ur local");
		*/	
		
		




