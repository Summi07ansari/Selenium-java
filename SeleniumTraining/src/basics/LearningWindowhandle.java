package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);

		driver.findElement(By.linkText("Facebook")).click();
		//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		driver.findElement(By.linkText("BOOKS")).click();
		Set<String> Wh = driver.getWindowHandles();

		for (String s : Wh) {
			System.out.println(s);
		}

	}

}
