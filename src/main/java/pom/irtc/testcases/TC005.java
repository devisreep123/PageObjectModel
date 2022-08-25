package pom.irtc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify irctc hotelgst validation";
		category="Smoke";
		author="Sreedevi";
		browser="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	
	@Test
public void hotelBookingGstValidation(){
		
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
		.selectNumberOfRooms("1")
		.sleepFirst()
		.selectNumberOfAdults("3")
		.sleepFirst()
		.clickDone()
		.sleepFirst()
		.clickFindHotel()
		.switchToNext()
		.waitAgain()
		.clickOnFirstHotel()
		.switchAgainTo()
		.waitAgains()
		.getHotelName()
		.waitAgains()
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
		.selectGst("Yes")
		.enterGstNumber("6564")
		.enterCompanyName("css")
		.enterCompanyAddress("cjhvj")
		.clickContinue()
		.verifyGstNumber("Please Enter Valid GSt number")
		
				
		;
		
	
	
	
	
	
}
	
	
	

}
