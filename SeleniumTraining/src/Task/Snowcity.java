package Task;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Snowcity {

	@Test
	public void direction() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://snowcityblr.com/contact-us/");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@referrerpolicy='no-referrer-when-downgrade']")));
		driver.findElement(By.xpath("//a[@class='navigate-link']")).click();
		Set<String> windowhandles= driver.getWindowHandles();
		for(String s: windowhandles) //this part is for cookies accept all button which i got 
		{
			driver.switchTo().window(s);
			if(driver.getTitle().contains("Google")) {
				action.sendKeys(Keys.TAB).build().perform();
				action.sendKeys(Keys.TAB).build().perform();
				action.sendKeys(Keys.TAB).build().perform();
				action.sendKeys(Keys.TAB).build().perform();
				action.sendKeys(Keys.ENTER).build().perform();
				
			}
		}
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement mapLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='navigate-text']")));
	//	WebElement mapLink = driver.findElement(By.cssSelector("div.navigate-text"));

        // Perform click action
       // mapLink.click();

        // Perform click action
     //   mapLink.click();
	  //  driver.get("https://www.google.com/maps/dir//Snow+City+1st+floor,+Snow+city+Fun+World+Complex+Jayamahal+Main+Rd,+opposite+TV+Tower,+J.C.Nagar,+Bengaluru,+Karnataka+560006/@13.0057596,77.5920609,16z/data=!4m8!4m7!1m0!1m5!1m1!1s0x3bae164e98b3c235:0xbb66b50f30bb665b!2m2!1d77.5920609!2d13.0057596");
	  //  Thread.sleep(2000);

	}

}
