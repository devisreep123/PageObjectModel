package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers  {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify irctc charter registration ";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	
	@Test
	public void irctcCharter() {
		
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnMenuIcon()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterApplicantName("Sree")
		.enterOrganisation("css")
		.enterAddress("dgkjhkj")
		.enterMobileNumber("9840326523")
		.enterEmailAddress("devisree.p@gmail.com")
		.selectSaloon("Saloon Charter")
		.enterOriginationStation("Cochin")
		.enterdestinationStation("Chennai")
		.clickOnDateOfDeparture()
		.threadSleeps()
		.selectOnYearDeparture("2023")
		.threadSleeps()
		.clickOnMonthDeparture()
		.threadSleeps()
		.clickOnDayDeparture()
		.threadSleeps()
		.clickOnDateOfArrival()
		.threadSleeps()
		.selectYearArrival("2023")
		.threadSleeps()
		.clickOnMonthArrival()
		.threadSleeps()
		.clickOnDayArrival()
		.threadSleeps()
		.enterDuration("2")
		.enterNumberOfCoaches("2")
		.enterNumberOfPassengers("6")
		.enterPurposeOfChart("Own")
		.enterAdditionalServices("none")
		
		
		;
		
		
		
		
	}

}
