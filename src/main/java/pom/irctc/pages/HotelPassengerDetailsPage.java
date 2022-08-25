package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPassengerDetailsPage extends GenericWrappers{
	
	public HotelPassengerDetailsPage switchAgain2() {
		switchToLastWindow();
		return this;
	}
	
	public HotelPassengerDetailsPage selectTitle(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("HotelPassengerDetailsPage.Title.XPath"), value);
		return this;
	}
	
	public HotelPassengerDetailsPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("HotelPassengerDetailsPage.FirstName.XPath"), data);
		return this;
	}
	public HotelPassengerDetailsPage enterLastName(String data) {
		
		enterByXpath(prop.getProperty("HotelPassengerDetailsPage.LastName.XPath"), data);
		return this;
	}
	public HotelPassengerDetailsPage selectState(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("HotelPassengerDetailsPage.State.XPath"), value);
		return this;
	}
	public HotelPassengerDetailsPage selectGst(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("HotelPassengerDetailsPage.Gst.XPath"), value);
		return this;
	}
	public HotelPassengerDetailsPage enterGstNumber(String data) {
		
		enterByXpath(prop.getProperty("HotelPassengerDetailsPage.GstNumber.XPath"), data);
		return this;
	}
	public HotelPassengerDetailsPage enterCompanyName(String data) {
		
		enterByXpath(prop.getProperty("HotelPassengerDetailsPage.CompanyName.XPath"), data);
		return this;
	}
	public HotelPassengerDetailsPage enterCompanyAddress(String data) {
		
		enterByXpath(prop.getProperty("HotelPassengerDetailsPage.CompanyAddress.XPath"), data);
		return this;
	}
	
	public HotelPassengerDetailsPage clickContinue(){
		
		clickByXpath(prop.getProperty("HotelPassengerDetailsPage.Continue.XPath"));
		return this;
	}
	public HotelPassengerDetailsPage clickOnIAgree(){
		
		clickByXpath(prop.getProperty("HotelPassengerDetailsPage.IAgree.XPath"));
		return this;
	}
	
	public HotelPassengerDetailsPage clickOnMakePayment(){
		
		clickByXpath(prop.getProperty("HotelPassengerDetailsPage.MakePayment.XPath"));
		return this;
	}
	
	public HotelPassengerDetailsPage clickOnVerify(){
		
		clickByXpath(prop.getProperty("HotelPassengerDetailsPage.Verify.XPath"));
		return this;
	}
	
	public HotelPassengerDetailsPage verifyOtp(String text) {
		
		verifyTextContainsByXpath(prop.getProperty("HotelPassengerDetailsPage.VerifyOtp.XPath"), text);
		
		return this;
	}
	public HotelPassengerDetailsPage verifyGstNumber(String text) {
		
		verifyTextByXpath(prop.getProperty("HotelPassengerDetailsPage.VerifyGstNumber.XPath"), text);
		return this;
	}
	
}


