package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement_TC {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/index.php");
		// driver.findElement(By.xpath("//button[@id=\"u_0_k_Fc\"]")).click();
		// driver.findElement(By.linkText("Create new account")).click();
		WebElement hiddenTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
		// "/html/body/div[1]/div/div/section/div/div[1]/div[2]/div/div[2]/form/div/input"));
		// (//input[@class='form-control']
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Female';", hiddenTextField);
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//label[text()='Custom']")).click();

	}

}
