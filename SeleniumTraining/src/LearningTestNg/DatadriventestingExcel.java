package LearningTestNg;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadriventestingExcel {

	@Test(dataProvider="Register")
	public void RegisterTestData(String Gender,String FirstName,String LastName,String Email,String Password) {
		System.out.println(Gender);
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(Password);
	}
	@DataProvider(name="Register")
	public String[][] testData() throws EncryptedDocumentException, IOException {
		
		
		return ReadingExcel.testData("RegisterData");
	}


}
