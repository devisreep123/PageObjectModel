package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify FACEBOOK registration for the new user sign up";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.facebook.com";
	}
	
	
	@Test
	public void facebookSignUp() {
		
		new HomePage()
		.clickOnCreateNewAccount()
		.enterFirstName("Sreedevi")
		.enterSurName("Prasadini")
		.enterMobileNumber("984032635")
		.enterNewPassword("Dev6y%H")
		.selectDateOfBirth("26")
		.selectMonthOfBirth("Mar")
		.selectYearOfBirth("1982")
		.clickOnGender()
		;
		
	}

}
