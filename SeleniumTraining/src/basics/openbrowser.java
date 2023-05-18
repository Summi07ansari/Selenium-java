package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver"; 
		String value="C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key, value);
		//ChromeDriver driver=new ChromeDriver();
		//casting chromedriver to webdriver
		//according to architecture chrome driver act as child of webdriver
		//that is why it is upcasting
		WebDriver driver=new ChromeDriver();

	}

}
