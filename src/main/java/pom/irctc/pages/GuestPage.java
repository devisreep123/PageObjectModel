package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestPage extends GenericWrappers{
	
	public GuestPage clickOnGuestLogin() {
		
		clickByXpath(prop.getProperty("GuestPage.ClickOnGuestLogin.XPath"));
		return this;
	}
	
	public GuestPage enterEmail(String data) {
		
		enterByXpath(prop.getProperty("GuestPage.EmailId.XPath"), data);
		return this;
	}
	public GuestPage enterMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("GuestPage.MobileNumbers.XPath"), data);
		return this;
	}
	public HotelPassengerDetailsPage clickLogin() {
		
		clickByXpath(prop.getProperty("GuestPage.ClickOnLogin.XPath"));
		return new HotelPassengerDetailsPage();
	}

}
