package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class openchromebrowser {

	public static void main(String[] args) {
	String key="webdriver.chrome.driver"; 
	String value="C:\\Users\\anzar\\Downloads\\installables\\chromedriver_win32\\chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();

	}

}
