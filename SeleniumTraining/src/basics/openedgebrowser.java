package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class openedgebrowser {

	public static void main(String[] args) {
	String key="webdriver.edge.driver";
	String value="C:\\Users\\anzar\\Downloads\\installables\\edgedriver_win64\\msedgedriver.exe";
	System.setProperty(key, value);
	EdgeDriver driver =new EdgeDriver();
	

	}

}
