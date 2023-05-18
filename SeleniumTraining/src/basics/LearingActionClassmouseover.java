package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearingActionClassmouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Actions Acc = new Actions(driver);
		WebElement computerlink = driver.findElement(By.linkText("COMPUTERS"));
		Acc.moveToElement(computerlink).build().perform();
		//composite action
		Acc.moveToElement(driver.findElement(By.linkText("Desktops"))).click().build().perform();
	}

}
