package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_SoftAssert {

	@Test
	public void Assertion() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
    WebDriver  driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demowebshop.tricentis.com/login");
//	Assert.assertTrue(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/login"));
//	//Assert.assertTrue(driver.getCurrentUrl().equals("https://github.com"));
//    Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed()); 
//    Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
	
	SoftAssert ast=new SoftAssert();
	ast.assertEquals(driver.getTitle(),"De Web Shop");
	driver.quit();
	ast.assertAll(); //to give the details of failure
}


	
}
