package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIndDepXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		String price = driver
				.findElement(By.xpath("//a[contains(text(),'inch Laptop')]/../..//span[@class='price actual-price']"))
				.getText();
		System.out.println(price);
	}

}
