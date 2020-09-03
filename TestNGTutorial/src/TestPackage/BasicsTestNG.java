package TestPackage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class BasicsTestNG {

	
	@Test
	public void demo() {
		
		System.out.println("this is BasicTestNG class - demo method");
		Assert.assertFalse(true);
		
	}
	
	@AfterTest(groups= {"smoke"})
	public void demo3() {
		
		System.out.println("this is BasicTestNG class - testing AfterTest annotation - demo3 method");
		
	}
	
	
	
	@Test(groups= {"smoke"})
	public void demo2() {
		
		System.out.println("this BasicTestNG class - demo2 method");
		
	}
	
	@AfterSuite(groups= {"smoke"})
	public void demo4AfterSuite() {
		
		System.out.println("this BasicTestNG class - demo4 method after suite");
		
	}
	
}
