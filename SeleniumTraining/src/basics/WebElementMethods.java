package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement books = driver.findElement(By.partialLinkText("BOOKS"));
		// books.clear(); //to clear existing value from the text field
		//books.click(); // to perform click action on webelement
		System.out.println(books.getAttribute("a")); // used to fetch the attribute value
		//when the attribute name is passed
		
		System.out.println(books.getCssValue("color")); //used to fetch css value such as color,font etc 
		System.out.println(books.getTagName()); //used to fetch tag of the element
		System.out.println(books.getText()); //used to fetch text of the element
		System.out.println(books.isDisplayed());//used to check weather element is displayed in web page
		System.out.println(books.isEnabled());//used to check weather element is enabled in web page
//		books.isSelected();  used to check if the element is selected
//		books.sendKeys(args); used to enter values in the text field 
//		books.submit(); //used to click on element with type ='submit'
//		books.findElement(null);
//		books.findElements(null); used to find child of webelement
//		books.getLocation(); returns location of the element in the type of point 
//		books.getRect(); returns rectangular property of the element in the type of rectangle
//		books.getSize(); return size of the webelement i the type of dimensions
//		books.getScreenshotAs(null);

	}

}