package LearningTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * 
 * @author anzar
 *
 */

public class Base {

	/**
	 * This class is responsible to open browser, navigate to URL and close browser
	 * for every test case in suite
	 */
	WebDriver driver;

	@BeforeClass
	public void browserSetup() {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");

	}

	@AfterClass

	public void browserTeardown() {
		driver.quit();
	}

}
