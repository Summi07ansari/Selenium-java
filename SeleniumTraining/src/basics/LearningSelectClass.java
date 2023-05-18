package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningSelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("BOOKS")).click();

//		for (int i = 0; i <= 5; i++) {
//			WebElement sortbyDD = driver.findElement(By.id("products-orderby"));
//			Select sel = new Select(sortbyDD);
//			sel.selectByIndex(i);
//		}

//
//		WebElement sortbyDD = driver.findElement(By.id("products-orderby"));
//		Select sel = new Select(sortbyDD);
//		sel.selectByVisibleText("Name: Z to A");
//		WebElement sortbyDD1 = driver.findElement(By.id("products-orderby"));
//		Select sel1 = new Select(sortbyDD1);
//		sel1.selectByIndex(3);
//		WebElement sortbyDD2 = driver.findElement(By.id("products-orderby"));
//		Select sel2 = new Select(sortbyDD2);
//		sel2.selectByValue("https://demowebshop.tricentis.com/books?orderby=11");

		
		//to make it generic  
		WebElement sortbydd = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(sortbydd);
		List<WebElement> options = sel.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement sortbydd1 = driver.findElement(By.id("products-orderby"));
			Select sel1 = new Select(sortbydd1);
			sel1.selectByIndex(i);
		}
	}

}
