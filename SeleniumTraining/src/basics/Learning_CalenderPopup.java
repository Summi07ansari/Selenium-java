package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Learning_CalenderPopup {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.co.uk/");
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.xpath("//div[text()='May 2023']/../..//li[text()='15']")).click();
		
		driver.findElement(By.id("rdatelbl")).click();
		driver.findElement(By.id("trd_1_12/06/2023")).click();

	}

}
