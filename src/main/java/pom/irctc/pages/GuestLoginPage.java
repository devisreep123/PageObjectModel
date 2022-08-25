package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestLoginPage extends GenericWrappers {
	
	public GuestLoginPage clickOnGuestLogin() {
		
		clickByXpath(prop.getProperty("GuestLoginPage.GuestLogin.XPath"));
		return this;
	}
	
	public GuestLoginPage enterEmail(String data) {
		
		enterByXpath(prop.getProperty("GuestLoginPage.Email.XPath"), data);
		return this;
	}
	public GuestLoginPage enterMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("GuestLoginPage.MobileNumber.XPath"), data);
		return this;
	}
	public TourismPage clickLogin() {
		
		clickByXpath(prop.getProperty("GuestLoginPage.ClickLogin.XPath"));
		return new TourismPage();
	}
public TourismPage switchWindow1() {
	switchToLastWindow();
	return new TourismPage();
}
}
