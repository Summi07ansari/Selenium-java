package LearningTestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Learning_Parameterization  { //Base class also
	@Test
	public void loginTest() {

		String username = "Sumaiyakansari@gmail.com";
		String password = "summianzar28";
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

}
