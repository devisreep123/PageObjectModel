package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.ClickOnRegister.XPath"));
		return new RegistrationPage();
	}
	
	
	
	public HomePage mouseHoverOnHolidays() {
		//mouseHoverByXPath("//a[text()=' HOLIDAYS ']");
		clickByXpath(prop.getProperty("HomePage.MouseHoverOnHolidays.XPath"));
		return this;
	}
	
	
		



	public HomePage mouseHoverOnStays() {
		//mouseHoverByXPath("//span[text()='Stays']");
		clickByXpath(prop.getProperty("HomePage.MouseHoverOnStays.XPath"));
		return this;
	}
	
	
		// TODO Auto-generated method stub
		
	



	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("HomePage.Lounge.XPath"));
		return new AccommodationPage();
	}
	
}
