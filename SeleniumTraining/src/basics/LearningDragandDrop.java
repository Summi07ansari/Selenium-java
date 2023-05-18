package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningDragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[text()='Oslo'][2]"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Norway']"));
//		WebElement source1=driver.findElement(By.xpath("//div[text()='Stockholm'][2]"));
//		WebElement target1 = driver.findElement(By.xpath("//div[text()='Sweden']"));
//		
	
		action.dragAndDrop(source, target).build().perform();
	}

}
