package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//input[@type='file']"))
				.sendKeys("C:/Users/anzar/Downloads/Sumaiya_Ansari_V0.1.pdf");

	}

}
