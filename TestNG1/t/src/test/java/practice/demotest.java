package practice;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import Genericutility.Baseclass;

public class demotest  extends Baseclass {
@Test(priority=0)
public void login(Method m1) {
	System.out.println("Executing"+m1);
}
@Test(dependsOnMethods="login")
public void addemployee(Method m2) {
	System.out.println("Executing"+m2);
}
@Test(dependsOnMethods= "login")
public void logout(Method m3) {
	System.out.println("Executing"+m3);
}

}
