package basics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropofAllelement {
	static ChromeDriver driver;
	static Actions action;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[text()='Oslo'][2]"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Norway']"));
		action.dragAndDrop(source, target).build().perform();
		
		WebElement source1 = driver.findElement(By.xpath("//div[text()='Stockholm'][2]"));
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Sweden']"));
		action.dragAndDrop(source1, target1).build().perform();
		
		WebElement source2 = driver.findElement(By.xpath("//div[text()='Washington'][2]"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='United States']"));
		action.dragAndDrop(source2, target2).build().perform();
		
		WebElement source3 = driver.findElement(By.xpath("//div[text()='Copenhagen'][2]"));
		WebElement target3 = driver.findElement(By.xpath("//div[text()='Denmark']"));
		action.dragAndDrop(source3, target3).build().perform();

		WebElement source4 = driver.findElement(By.xpath("//div[text()='Rome'][2]"));
		WebElement target4 = driver.findElement(By.xpath("//div[text()='Italy']"));
		action.dragAndDrop(source4, target4).build().perform();

		WebElement source5 = driver.findElement(By.xpath("//div[text()='Madrid'][2]"));
		WebElement target5 = driver.findElement(By.xpath("//div[text()='Spain']"));
		action.dragAndDrop(source5, target5).build().perform();

		
		WebElement source6 = driver.findElement(By.xpath("//div[text()='Seoul'][2]"));
		WebElement target6 = driver.findElement(By.xpath("//div[text()='South Korea']"));
		action.dragAndDrop(source6, target6).build().perform();

	}
}
