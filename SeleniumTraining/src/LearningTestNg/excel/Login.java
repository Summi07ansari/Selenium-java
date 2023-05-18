package LearningTestNg.excel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import LearningTestNg.ReadingExcel;

public class Login {
	

	
	@Test(dataProvider="LoginData")
	public void loginTest(String username,String password) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");
//		String username = "Sumaiyakansari@gmail.com";
//		String password = "summianzar28";
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		if (driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(username)) {
			System.out.println("PASSED user is successfully logged in");
		} else {
			System.out.println("FAILED user is not successfully logged in");
		}
	}
	@DataProvider( name="LoginData", parallel=false)
	public String[][] testData() throws EncryptedDocumentException, IOException {
		return ReadingExcel.testData("NewLoginData");
	}
	




}
