package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmentslist {
//to print the all text Of all the links developed in the webpage
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i<links.size(); i++) {
			// gettext will return the text of webelement
			System.out.println(links.get(i).getText());
		}
        //used for each below
		// for(WebElement link:links){
		// System.out.println(link.getText());}
	}

}
