package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
	@Test
	public void myntra() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		driver.get("https://www.myntra.com/");
	    driver.findElement(By.xpath("//input[@value='']")).click();
	    driver.findElement(By.xpath("//input[@value='shoes']")).clear();
	    driver.findElement(By.xpath("//input[@value='shoes']")).sendKeys("shoes");
	    driver.findElement(By.xpath("//input[@value='shoes']")).sendKeys(Keys.ENTER);
	    
//		driver.findElement(By.linkText("Create Account")).click();
//		driver.findElement(By.name("email")).sendKeys("sumaiyakansari@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Summi07ansari#");
//		driver.findElement(By.name("mobile")).sendKeys("+919522320001");
//		driver.findElement(By.id("female")).click();
//		driver.findElement(By.linkText("/html/body/div[2]/div/div[1]/div/form/fieldset[2]/button")).click();
//		//driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
		//driver.findElement(By.xpath("//header[@id=\"desktop-header-cnt\"]/div[2]/div[3]/div/ul/li[6]")).click();
	}
}
