package LearningTestNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;

public class ChronologicalOrder {

	@Test
	public void TestAnnotation() {
		System.out.println("Test Annotation");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");

	}

	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");

	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test");

	}

	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");

	}

	@BeforeSuite

	public void BeforeSuite() {
		System.out.println("Before Suite");

	}

	@AfterSuite

	public void AfterSuite() {
		System.out.println("After Suite ");

	}

}
