package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoWebAppGet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       
       driver.get("https://demowebshop.tricentis.com/");
       
       driver.get("https://www.facebook.com/");
	}

}
