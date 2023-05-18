package Task;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium extends Base {
	
	@Test
	public void seleniumTestExecuter() throws InterruptedException {
		
		driver.get("https://www.selenium.dev/support/");	
		openTab("https://www.selenium.dev/documentation/",driver);
        openTab("https://www.selenium.dev/about/",driver);
        openTab("https://www.selenium.dev/downloads/",driver);
        openTab("https://www.selenium.dev/blog/",driver);
        openTab("https://www.selenium.dev/projects/",driver);
        openTab("https://www.selenium.dev/support/",driver); 
        
        
        Thread.sleep(1000);
        
        Set<String> WindowHandles = driver.getWindowHandles();
    	for (String Wh : WindowHandles) {
			driver.switchTo().window(Wh);
			if (driver.getCurrentUrl().equals("https://www.selenium.dev/documentation/")) {
				 driver.findElement(By.xpath("//a[@id='m-documentationwebdriver']/span")).click();
				 Thread.sleep(10000);
            }
		}
    	  Thread.sleep(10000);
	}


	
	 public static void openTab(String url, WebDriver driver) {
	        ((JavascriptExecutor) driver).executeScript("window.open()");

	        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(tabs.size() - 1));

	        driver.get(url);
	    }
}
