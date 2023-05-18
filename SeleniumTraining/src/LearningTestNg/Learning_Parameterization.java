package LearningTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Learning_Parameterization {

	/**
	 * This class is responsible to open browser, navigate to URL and close browser
	 * for every test case in suite
	 */
	WebDriver driver;

	@Parameters({ "browser", "URL" })
	@BeforeClass(alwaysRun = true)

	public void browserSetup( String browserName, String URL) {
		if (browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");

	}

	@AfterClass(alwaysRun = false)

	public void browserTeardown() {
		driver.quit();
	}

}
