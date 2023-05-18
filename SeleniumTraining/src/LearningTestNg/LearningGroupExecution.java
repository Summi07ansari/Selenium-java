package LearningTestNg;

import org.testng.annotations.Test;

public class LearningGroupExecution {

	@Test(groups = "Functional")
	public void loginTest() {
		System.out.println("Login test case code");
	}

	@Test(groups = "Integration")
	public void registerTest() {
		System.out.println("Register test case code");
	}

	@Test(groups = "Integration")
	public void cartTest() {
		System.out.println("cart test case code");
	}

	@Test(groups = "Integration", dependsOnGroups = "System")
	public void wishlistTest() {
		System.out.println("wishlist test case code");
	}

	@Test(groups = "System")
	public void endtoendTest() {
		System.out.println("end to end flow test case code");
		int i=1/0;
	}
}
