package LearningTestNg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTestDDT {
	@Test(dataProvider = "RegisterData")

	public void RegisterTest(String gender, String firstname, String lastname, String email, String password,
			String confirmpassword) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.linkText("Register")).click();
		// String gender = "gender-female";
		driver.findElement(By.id("gender-female")).click();
		// String firstname = "Summi";
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		// String lastname = "Ansari";
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		// String email = "Summi0728@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(email);
		// String password = "summianzar28";
		driver.findElement(By.id("Password")).sendKeys(password);
		// String confirmpassword = "summianzar28";
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);

		driver.findElement(By.id("register-button")).click();

		if (driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(email)) {
			System.out.println("PASSED user is successfully logged in");
		} else {
			System.out.println("FAILED user is not successfully logged in");
		}

	}

	@DataProvider(name = "RegisterData")
	public String[][] Register() throws EncryptedDocumentException, IOException {
		return ReadingExcel.testData("Register");
	}
}
