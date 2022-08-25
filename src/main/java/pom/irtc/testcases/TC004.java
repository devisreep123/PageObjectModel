package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
		
		
		@BeforeClass
		public void beforeClass() {
			testCaseName="TC004";
			testCaseDescription="To verify irctc hotel booking otp validation ";
			category="Smoke";
			author="Sreedevi";
			browser="chrome";
			url="https://www.irctc.co.in/nget/train-search";
		}
		
		
		@Test
		public void hotelBookingOtpValidation() {
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnLogin()
		.clickOnGuestLogin()
		.enterEmail("devisree.p@gmail.com")
		.enterMobileNumber("9840362536")
		.clickLogin()
		.switchWindows()
		.waitProper()
		.clickOnHotels()
		.switchToWindow()
		.enterCityHotelName("New")
		.clickCity()
		.sleepFirst()
		.clickCheckInDate()
		.sleepFirst()
		.clickCheckInYear()
		.sleepFirst()
		.clickYearOfCheckIn()
		.sleepFirst()
		.clickCheckInMonth()
		.sleepFirst()
		.clickCheckInDay()
		.sleepFirst()
		.clickCheckOutDate()
		.sleepFirst()
		.clickCheckOutYear()
		.sleepFirst()
		.selectCheckOutYear()
		.sleepFirst()
		.clickCheckOutMonth()
		.sleepFirst()
		.clickCheckOutDay()
		.sleepFirst()
		.clickRooms()
		.sleepFirst()
		.selectNumberOfRooms("1")
		.sleepFirst()
		.selectNumberOfAdults("3")
		.sleepFirst()
		.clickDone()
		.clickFindHotel()
		.switchToNext()
		.waitAgain()
		.clickOnFirstHotel()
		.switchAgainTo()
		.waitAgains()
		.getHotelName()
		.getHotelPrice()
		.waitAgains()
		.clickContinueToBook()
		.clickOnGuestLogin()
		.enterEmail("devisree.p@gmail.com")
		.enterMobileNumber("9840362635")
		.clickLogin()
		.switchAgain2()
		.selectTitle("Mrs")
		.enterFirstName("Sree")
		.enterLastName("prasas")
		.selectState("KERALA")
		.selectGst("No")
		.clickContinue()
		.clickOnIAgree()
		.clickOnMakePayment()
		.clickOnVerify()
		.verifyOtp("otp is required")
				
		
		
		
		
		
		
		;
		
		
	}

}
