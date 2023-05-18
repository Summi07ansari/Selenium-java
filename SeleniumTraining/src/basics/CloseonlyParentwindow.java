package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseonlyParentwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String ParentHandle = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("Google+")).click();
		Set<String> WindowHandles = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String Wh : WindowHandles) {
			driver.switchTo().window(Wh);
			Thread.sleep(2000);
			if (!driver.getWindowHandle().equals(ParentHandle)) {
				driver.close();

			}
		}

	}

}
