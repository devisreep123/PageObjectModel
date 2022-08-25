package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.confirmationalerts.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify confirmation alert ";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	
	
	@Test
	public void confirmationAlerts() {
		
		new HomePage()
		.switchFrame()
		.clickOnTryIt()
		.readText()
		.acceptTheAlerts()
		.verifyTheText("You pressed OK")
		.pageRefresh()
		.switchFrames()
		.clickOnTryItAgain()
		.readText()
		.acceptTheAlerts()
		.clickOnTryIt()
		.cancelTheAlert()
		.verifyTheText("You pressed Cancel!")
		.backToHomePage()
		.clickHome()
		
		
		
		
		
		
		
		
		;
	}

}
