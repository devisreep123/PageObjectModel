package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.simplealerts.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify simple alert";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	
	@Test
	public void simpleAlerts() {
		
		new HomePage()
		.waitHere()
		.switchFrame()
		.waitHere()
		.clickOnTryIt()
		.readText()
		.acceptTheAlerts()
		.switchBack()
		.clickOnHome()
		;
				
	}

	

}
