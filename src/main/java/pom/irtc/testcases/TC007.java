package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
		@BeforeClass
		public void beforeClass() {
			testCaseName="TC007";
			testCaseDescription="To verify formc registration ";
			category="Smoke";
			author="Sreedevi";
			browser="chrome";
			url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		}
		
		
		@Test
		public void formCRegistration() {
		new HomePage()
		.clickOnSignUpRegistration()
		.enterUserId("devisreep123")
		.enterPassword("Sr33dE")
		.enterConfirmPassword("Sr33dE")
		.selectSecurityQuestion("What is your favorite author?")
		.enterSecurityAnswer("cssf")
		.enterName("Sreede")
		.selectGender("Female")
		.enterDateOfBirth("16/03/1983")
		.enterDesignation("vjhgkjh")
		.enterEmailId("devisree.p@gmail.com")
		.enterMobileNumber("9840326358")
		.enterPhoneNumber("9840362353")
		.enterHotelName("vnv")
		.enterCapacity("50")
		.enterAddress("cjbvv")
		.selectState("KERALA")
		.waitSleep()
		.selectCity("ALAPPUZHA")
		.selectAccomadationType("Hotel")
		.selectAccomadationGrade("Five Star")
		.enterHotelEmailId("devisree.p@gmail.com")
		.enterHotelMobileNumber("9840362356")
		.enterHotelPhoneNumber("9840362353")
		.enterPassenger1Name("DSree")
		.enterPassenger1Address("aVadbhs")
		.selectPassenger1State("KERALA")
		.waitSleep()
		.selectPassenger1City("ALAPPUZHA")
		.enterPassenger1EmailId("devisre@yahoo.com")
		.enterPassenger1PhoneNumber("9840363263")
		.enterPassenger1MobileNumber("9840363263")
		.clickOnAdd()
		.enterPassenger2Name("hvnv")
		.enterPassenger2Address("hvhlkjh")
		.selectPassenger2State("KERALA")
		.waitSleep()
		.selectPassenger2City("ALAPPUZHA")
		.enterPassenger2EmailId("vkjkhkj;lj")
		.enterPassenger2PhoneNumber("9864246245")
		.enterPassenger2MobileNumber("8993568976")
		.clickAdd()
		.enterPassenger3Name("caGsDH")
		.enterPassenger3Address("sgdshf")
		.selectPassenger3State("KERALA")
		.waitSleep()
		.selectPassenger3City("KOLLAM")
		.enterPassenger3EmailId("nvmnbmb")
		.enterPassenger3PhoneNumber("9986230543")
		.enterPassenger3MobileNumber("457964645")
		
		
		
		
		
		
		
		
		;
		
	}

}
