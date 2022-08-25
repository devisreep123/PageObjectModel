package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravelsregistration.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To verify phptravel registration ";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.phptravels.org/register.php";
	}
	
	
	@Test
	public void phpTravelRegistration() {
		
		
		new HomePage()
		.enterFirstName("sree")
		.enterLastName("Prasadini")
		.enterEmailAddress("devisree.p@gmail.com")
		.clickOnCountryCode()
		.clickOnCountry()
		.enterPhoneNumber("9840362356")
		.enterCompanyName("gjhg")
		.enterStreetAddress("pye")
		.enterStreetAddress2("nlkjl")
		.enterCity("Alappuzha")
		.enterSate("Kerala")
		.enterPostCode("688013")
		.selectCountry("India")
		.enterMobile("9840632653")
		.enterPassword("S$Rthjkg")
		.enterConfirmPassword("S$Rthjkg")
		
		
		
		
		
		
		
		
		
		;
		
	}

}
