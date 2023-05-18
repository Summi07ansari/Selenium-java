package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnigMultiselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:/Users/anzar/Downloads/MultipleDropdown.html");

		WebElement Food = driver.findElement(By.name("menu"));
		Select sel = new Select(Food);
		boolean flag = sel.isMultiple();
		System.out.println(flag);
		sel.selectByVisibleText("Pizza");
		sel.selectByVisibleText("Burger");

	}

}
