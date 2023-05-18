package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbDrivermethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		String Title = driver.getTitle();
		System.out.println(Title);
		// chcking url
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// chcking pagesource
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

		// maximize browser
		driver.manage().window().maximize();
		// driver.manage().window().fullscreen();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to("https://github.com/");
		// driver.close();
		// driver.quit();
	}

}
