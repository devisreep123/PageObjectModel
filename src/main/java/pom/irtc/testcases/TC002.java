package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify irctc book the coach  ";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	
	@Test
	public void irctcBookYourCoach(){
		
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnMenuIcon()
		.clickOnBookYourCoach()
		.againSwitch()
		.clickOnNewUserSignUp()
		.enterUserId("DevisreepL")
		.waitHere()
		.enterPassword("D@veesree1p")
		.waitHere()
		.enterConfirmPassword("D@veesree1p")
		.waitHere()
		.selectSecurityQuestion("What is your pet name?")
		.enterSecurityAnswer("chee")
		.clickDateOfBirth()
		.waitHere()
		.selectMonth("Mar")
		.selectYear("1982")
		.clickOnDate()
		.waitHere()
		.clickOnGenderFemale()
		.clickOnMaritalStatus()
		.waitHere()
		.enterEmailId("devisree.p@gmail.com")
		.selectOccupation("Public")
		.enterFirstName("SREE")
		.waitHere()
		.enterMiddleName("CH")
		.enterLastName("PRASADINI")
		.selectNationality("Indian")
		.waitHere()
		.enterFlatNumber("86")
		.enterStreet("IRWIN")
		.enterArea("MOWLE")
		.waitHere()
		.pageDowns1()
		.selectCountry("India")
		.waitHere()
		.enterMobileNumber("9840362618")
		.waitHere()
		.enterPinCode("688013")
		.waitHere()
		.pageDowns1()
		.selectCity("Alappuzha")
		.selectState("KERALA")
		.waitHere()
		.selectPostOffice("Thathampally S.O")
		.waitHere()
		.pageDowns1()
		.clickCopyResidence()
		.waitHere()
		.enterOfficeFlatNumber("89")
		.waitHere()
		.enterOfficeStreet("PYE")
		.waitHere()
		.enterOfficeArea("OAKES")
		.waitHere()
		.selectOfficeCountry("India")
		.waitHere()
		.enterOfficeMobileNumber("9840362617")
		.waitHere()
		.enterOfficePinCode("688013")
		.waitHere()
		.pageDowns1()
		.selectOfficeCity("Alappuzha")
		.waitHere()
		.selectOfficeState("KERALA")
		.waitHere()
		.selectOfficePostOffice("Thathampally S.O")
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		;
		
	}

}
