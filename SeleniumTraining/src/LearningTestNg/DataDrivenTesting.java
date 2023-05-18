package LearningTestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	@Test(dataProvider="LoginData")
	public void LoginTestCase(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider(name="LoginData")
	public String[][] testData() {
		String[][] data =new String[2][2];
		data[0][0]="summi@gmail.com";
		data[0][1]="password123";
		data[1][0]="sumaiya@gmail.com";
		data[1][1]="password123";
		return data;
	}

}
