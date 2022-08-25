package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage switchWindow() {
		
		switchToLastWindow();
		return this;
	}
	public AccommodationPage clickOnMenuIcon() {
		
		clickByXpath(prop.getProperty("AccomadationPage.MenuIcon.Xpath"));
		return this;
	}

	public CoachCharterPage clickOnBookYourCoach() {
		
		clickByXpath(prop.getProperty("AccomadationPage.BookYourCoach.Xpath"));
		return new CoachCharterPage();
		
	}
	public CharterPage clickOnCharter() {
		
		clickByXpath(prop.getProperty("AccomadationPage.Charter.Xpath"));
		return new CharterPage();
	}
	public GuestLoginPage clickOnLogin() {
		
		clickByXpath(prop.getProperty("AccommodationPage.Login.XPath"));
		return new GuestLoginPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
