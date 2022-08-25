package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.promptalert.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To verify prompt alert ";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	}
	
	
	@Test
	public void promptAlert() {
		
		new HomePage()
		
		.sleep()
		.switchFrames()
		.sleeps()
		.clickOnTryIts1()
		.sleepsAg()
		.enterAlertName("Sreedevi")
		.sleepsAg()
		.getTheText()
		.sleepsAg()
		.alertAccept()	
		.verifyTheText("Hello Sreedevi! How are you today?")
		.pageRefresh()
		.sleepAgains1()
		.switchFramesAgain()
		.sleepAgain()
		.clickOnTryIts()
		.sleep2A()
		.enterAlertNames("Sree")
		.sleep2A()
		.getTheTexts()
		.sleep2A()
		.alertDismiss()
		.verifyTextAlert("User cancelled ")
		.defaultContent()
		.clickOnHome()
			
		
		;
	}

}
