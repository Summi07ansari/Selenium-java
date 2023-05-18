package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefoxbrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\geckodriver-v0.33.0-win32\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

	}

}
