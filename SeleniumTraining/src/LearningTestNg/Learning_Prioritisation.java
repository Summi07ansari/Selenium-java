package LearningTestNg;

import org.testng.annotations.Test;

public class Learning_Prioritisation {

	@Test(priority = 2)
	public void loginTest() {
		System.out.println("Login test case code");
	}

	@Test(priority = 1)
	public void registerTest() {
		System.out.println("Register test case code");
	}

	@Test(priority = 4)
	public void cartTest() {
		System.out.println("cart test case code");
	}

	@Test(priority = 3)
	public void wishlistTest() {
		System.out.println("wishlist test case code");
	}

	@Test(priority = 5)
	public void endtoendTest() {
		System.out.println("end to end flow test case code");
		// int i=1/0;
	}

}
