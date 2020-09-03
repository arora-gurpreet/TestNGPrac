package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Basics3 {
	
	
	
	@Test
	public void webloginCarLoan() {
		//selenium
		System.out.println("car loan web login");
		
	}
	
	@Test
	
	public void MobileLoginCarLoan() {
		//appium
		System.out.println("car loan mobile");
		
		
	}
	
	@Test
	public void MobileLoginCarLoan2() {
		//appium
		System.out.println("car loan mobile2");
		
	}

	
	@BeforeSuite
	public void MobileLoginCarLoanCopyBeforeSuite() {
		//appium
		System.out.println("this is Baics3 class-beforesuite method-i am number 1");
		
	}
	
	
	@Test
	public void MobileLoginCarLoan3() {
		//appium
		System.out.println("car loan mobile3");
		
	}


	
	@Test
	public void loginApi() {
		//Rest API automation
		System.out.println("car loan api");
		
	}
	

	@BeforeMethod
	public void TestBeforeMethod() {
		//Rest API automation
		System.out.println("I am in class Basics2 - and will be printed before every method in class Basics3");
		
	}
	
	
}
