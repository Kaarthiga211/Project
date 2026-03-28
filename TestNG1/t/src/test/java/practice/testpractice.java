package practice;

import org.testng.annotations.Test;

public class testpractice {

	@Test
public void TestMethod() {
	System.out.println("...Executing test methods");
}
	@Test(dependsOnMethods="TestMethod")
public void TestMethod1() {
	System.out.println("...Executing test methods11");
}
}
