package basics;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeallthetabwithoutQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	//	String ParentHandle = driver.getWindowHandle();
		driver.findElement(By.linkText("Facebook")).click();
		driver.findElement(By.linkText("Twitter")).click();
		driver.findElement(By.linkText("Google+")).click();
		Set<String> WindowHandles = driver.getWindowHandles();
//another way
//		Iterator<String> iterator = WindowHandles.iterator();
//
//		while (iterator.hasNext()) {
//			String handle = iterator.next();
//			driver.switchTo().window(handle);
//			driver.close();
//		}

		for (String Wh : WindowHandles) {
			driver.switchTo().window(Wh);
			driver.close();
		}
	}

}
