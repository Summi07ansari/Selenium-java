package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_iframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/anzar/Downloads/iframe%20(2).html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@id='gavtab-7']")).click();

		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}

}
