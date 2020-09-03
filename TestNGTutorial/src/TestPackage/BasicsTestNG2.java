package TestPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsTestNG2 {
	
	@Test(groups= {"smoke"})
	public void test2() {
	System.out.println("hi this is BasicTestgNG2 class - test2 method");

}
	
	@BeforeTest
	public void Prerequisite() {
		System.out.println("checking @beforetest annotation defined in BAsicTestNG2 class - PreREquisite method ");
		
	}
}
