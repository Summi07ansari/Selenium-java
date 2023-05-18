package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Learning_notificationPopup {

	public static void main(String[] args) {

		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("disable-notifications");
		// options.addArguments("start-maximized");
		// options.addArguments("--headless");
		// options.addArguments("--incognito");
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\geckodriver-v0.33.0-win32\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(new FirefoxProfile());

		options.addPreference("dom.webnotifications.enabled", false);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.easemytrip.com/");
		// System.out.println("browser launched");
	}

}
