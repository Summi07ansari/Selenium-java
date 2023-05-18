package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_HardASsertion {
	@Test
	public void Assertion() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver  driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/login");
	Assert.assertTrue(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login"));
	//Assert.assertTrue(driver.getCurrentUrl().equals("https://github.com"));
    Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed()); 
    Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
	driver.quit();
}
	}
