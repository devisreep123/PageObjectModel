package pom.irtc.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;

import wrappers.ProjectWrappers;

public class TC013 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify irctc  registration ";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	
	@Test
	public void irctcRegistration() {
		
				
		new CovidAlertPage()
		
		.waitingSleep()
		 .clickOnOK()
		.clickOnRegister()
		.enterUserName("Sreedevi123p")
		.pageDowns()
		.enterPassword("Secret123$")
		.enterConfirmPassword("Secret123$")
		.sleepWait()
		.clickOnPreferredLanguage()
		.sleepWait()
		.selectPreferredLanguage()
		.sleepWait()
		.clickOnSecurityQuestion()
		.sleepWait()
		.selectSecurityQuestion()
		.sleepWait()
		.enterSecurityAnswer("sdv")
		.clickContinue()
		.enterFirstName("Sredevi")
		.enterMiddleName("Pras")
		.enterLastName("PRasdaini")
		.sleepWait()
		.clickOnSelectOccupation()
		.sleepWait()
		.selectOccupation()
		.sleepWait()
		.enterDateOfBirth("16-03-1982")
		.clickOnMarried()
		.selectCountry("India")
		.clickOnFemale()
		.enterEmail("devisree.p@gmail.com")
		.enterMobileNumber("9840362659")
		.selectANationality("India")
		.clickContinue()
		.enterFlatNumber("bhagya")
		.enterStreet("irwin")
		.enterArea("mowle")
		.sleepWait()
		.enterPinCode("688013")
		.enterState("Kerala")
		.selectCitys("Alappuzha")
		.selectAPostoffice("Thathampally S.O")
		.enterPhoneNumber("9853026498")
		.sleepWait()
		.clickOnNo()
		.enterOfficeNumber("9803265423")
		.enterOfficeStreet("ponds")
		.enterOfficeArea("irwin")
		.sleepWait()
		.clickOnOfficeCountry()
		.selectOfficeCountry()
		.enterOfficePincode("688013")
		.enterOfficeState("Kerala")
		.sleepWait()
		.selectOfficeCity("Alappuzha")
		.sleepWait()
		.selectOfficePostOffice("Thathampally S.O")
		.sleepWait()
		.enterOfficePhoneNumber("9840326595")
		.pageDowns()
		.sleepWait()
		//.clickOnCheckBoxes()
			
		
		;
		
		
	}

}
