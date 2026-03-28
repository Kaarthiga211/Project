package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demosoftassert {
@Test
public void demoTesT() {
	String actualValue="PEC";
	String expectedValue="PEC";
	

//Soft Assert
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(actualValue, expectedValue);
			//sa.assertAll();-> if we use before the if else not worked
			if(actualValue.equals(expectedValue)) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
sa.assertAll();//it will both soft and hard assert--->conform put in the last in the code it can be executes and stop the code




}

}
