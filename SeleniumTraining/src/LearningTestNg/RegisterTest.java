package LearningTestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends Learning_Parameterization {//Base class also
	@Test
	public void registertest() {

		driver.findElement(By.linkText("Register")).click();
		String gender = "gender-female";
		driver.findElement(By.id("gender-female")).click();
		String firstname = "Summi";
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		String lastname = "Ansari";
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		String email = "Summi0728@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(email);
		String password = "summianzar28";
		driver.findElement(By.id("Password")).sendKeys(password);
		String confirmpassword = "summianzar28";
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);

		driver.findElement(By.id("register-button")).click();

		if (driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(email)) {
			System.out.println("PASSED user is successfully logged in");
		} else {
			System.out.println("FAILED user is not successfully logged in");
		}
	}
}
