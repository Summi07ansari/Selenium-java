package LearningTestNg;

import org.testng.annotations.Test;

public class LearningDependson {



	@Test(dependsOnMethods = "registerTest")
	public void loginTest() {
		System.out.println("Login test case code");
	}

	@Test()
	public void registerTest() {
		System.out.println("Register test case code");
		//int i=1/0;
	}

	@Test()
	public void cartTest() {
		System.out.println("cart test case code");
	}

	@Test()
	public void wishlistTest() {
		System.out.println("wishlist test case code");
	}

	@Test()
	public void endtoendTest() {
		System.out.println("end to end flow test case code");
		// int i=1/0;
	}



}
