/*
 * package Automation_Practice_Sep;
 * 
 * import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.Select;
 * 
 * public class dropdown_select_05 {
 * 
 * public static void main(String[] args) throws InterruptedException { // TODO
 * code for dropdown selection
 * 
 * String path = "C:\\Users\\890489\\Automation Testing Trainig phase" +
 * "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";
 * 
 * System.setProperty("webdriver.chrome.driver", path);
 * 
 * WebDriver driver = new ChromeDriver();
 * 
 * driver.get(
 * "https://www.leafground.com/select.xhtml;jsessionid=node0ept93bu4td3u6uy75tidsqc46890337.node0"
 * );
 * 
 * driver.manage().window().maximize();
 * 
 * //select with index try { WebElement index =
 * driver.findElement(By.xpath("//select[@class = 'ui-selectonemenu']")); Select
 * select1 = new Select(index); select1.selectByIndex(1); Thread.sleep(2000);
 * 
 * //select1.deselectByIndex(1); //Thread.sleep(2000);
 * 
 * 
 * WebElement textp = select1.getFirstSelectedOption(); String name =
 * textp.getText(); System.out.println(" GFDT Text is " + name);
 * Thread.sleep(1000); //driver.close();
 * 
 * 
 * WebElement scroll = driver.findElement(By.id("j_idt87:lang_label")); Select
 * scrl = new Select(scroll); scrl.selectByIndex(0);
 * 
 * 
 * 
 * driver.get("https://www.cognizant.com/in/en");
 * driver.manage().window().maximize();
 * 
 * //select by value WebElement value =
 * driver.findElement(By.id("form-options-2120717168")); Select select2 = new
 * Select(value); select2.selectByValue("Europe"); Thread.sleep(2000); //select
 * by visibe texzst WebElement visible =
 * driver.findElement(By.id("form-options-2137556778")); Select select3 = new
 * Select(visible); select3.selectByVisibleText("Career Seekers");
 * 
 * Thread.sleep(2000);
 * 
 * //select by send keys
 * 
 * 
 * WebElement dropdown3 = driver.findElement(By.id("form-options-353899333"));
 * Select ddb3 = new Select(dropdown3);
 * dropdown3.sendKeys("Cognizant Alumni Job Seeker"); String vals =
 * dropdown3.getAttribute("value"); System.out.println("attribute " + vals);
 * 
 * List<WebElement> counts = ddb3.getOptions(); int ddc = counts.size();
 * System.out.println("ddc counts is " + ddc); Thread.sleep(2000);
 * 
 * 
 * List<WebElement> countsx = ddb3.getOptions(); countsx.forEach(i->
 * System.out.println("count is" + i.getText()));
 * 
 * 
 * Thread.sleep(2000);
 * 
 * System.out.println("all ran successfully"); driver.close(); } catch
 * (Exception e) { e.printStackTrace(); }
 * 
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 */


package Automation_Practice_Sep; // Corrected package declaration

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_select_05 {

    public static void main(String[] args) throws InterruptedException {
        // TODO code for dropdown selection

        String path = "C:\\Users\\890489\\Automation Testing Trainig phase"
                + "\\Selenium_Practice_Sep24\\chromedriver\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", path);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0ept93bu4td3u6uy75tidsqc46890337.node0");

        driver.manage().window().maximize();

        // select with index
        try {
            WebElement index = driver.findElement(By.xpath("//select[@class = 'ui-selectonemenu']"));
            Select select1 = new Select(index);
            select1.selectByIndex(0);
            Thread.sleep(2000);

            WebElement textp = select1.getFirstSelectedOption();
            String name = textp.getText(); 
            System.out.println(" GFDT Text is " + name);
            Thread.sleep(1000); 

            WebElement scroll = driver.findElement(By.id("j_idt87:lang_label"));
            Select scrl = new Select(scroll);
            scrl.selectByIndex(0);

            driver.get("https://www.cognizant.com/in/en");
            driver.manage().window().maximize();

            // select by value
            WebElement value = driver.findElement(By.id("form-options-2120717168"));
            Select select2 = new Select(value);
            select2.selectByValue("Europe");
            Thread.sleep(2000);

            // select by visible text (corrected typo)
            WebElement visible = driver.findElement(By.id("form-options-2137556778"));
            Select select3 = new Select(visible);
            select3.selectByVisibleText("Career Seekers");

            Thread.sleep(2000);

            // select by send keys
            WebElement dropdown3 = driver.findElement(By.id("form-options-353899333"));
            Select ddb3 = new Select(dropdown3);
            dropdown3.sendKeys("Cognizant Alumni Job Seeker");
            String vals = dropdown3.getAttribute("value");
            System.out.println("attribute " + vals);

            List<WebElement> counts = ddb3.getOptions(); // Specify type for List
            int ddc = counts.size();
            System.out.println("ddc counts is " + ddc);
            Thread.sleep(2000);

            List<WebElement> countsx = ddb3.getOptions(); // Specify type for List
            countsx.forEach(i -> System.out.println("count is " + i.getText())); // Corrected lambda

            Thread.sleep(2000);

            System.out.println("all ran successfully");
            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
