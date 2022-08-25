package pom.phptravelsregistration.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public HomePage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("HomePage.FirstName.XPath"), data);
		return this;
	}
	
	public HomePage enterLastName(String data) {
		
		enterByXpath(prop.getProperty("HomePage.LastName.XPath"), data);
		return this;
	}
	public HomePage enterEmailAddress(String data) {
		
		enterByXpath(prop.getProperty("HomePage.Email.XPath"), data);
		return this;
	}
	
	public HomePage clickOnCountryCode() {
		
		clickByXpath(prop.getProperty("HomePage.CountryCode.XPath"));
		return this;
	}
	
	public HomePage clickOnCountry() {
		
		clickByXpath(prop.getProperty("HomePage.Country.XPath"));
		return this;
	}
	public HomePage enterPhoneNumber(String data) {
		
		enterByXpath(prop.getProperty("HomePage.PhoneNumber.XPath"), data);
		return this;
	}
	
	public HomePage enterCompanyName(String data) {
		
		enterByXpath(prop.getProperty("HomePage.CompanyName.XPath"), data);
		return this;
	}
	
	public HomePage enterStreetAddress(String data) {
	
	enterByXpath(prop.getProperty("HomePage.StreetAddress.XPath"), data);
	return this;
}
	public HomePage enterStreetAddress2(String data) {
		
		enterByXpath(prop.getProperty("HomePage.StreetAddress2.XPath"), data);
		return this;
	}
	
	public HomePage enterCity(String data) {
		
		enterByXpath(prop.getProperty("HomePage.City.XPath"), data);
		return this;
	}
	public HomePage enterSate(String data) {
	
	enterByXpath(prop.getProperty("HomePage.State.XPath"), data);
	return this;
}
	public HomePage enterPostCode(String data) {
	
	enterByXpath(prop.getProperty("HomePage.PostCode.XPath"), data);
	return this;
}
	public HomePage selectCountry(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("HomePage.Country1.XPath"), value);
		return this;
	}
	
	public HomePage enterMobile(String data) {
		
		enterByXpath(prop.getProperty("HomePage.MobileNumber.XPath"), data);
		return this;
	}
	
	public HomePage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("HomePage.Password.XPath"), data);
		return this;
	}
	
	public HomePage enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("HomePage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
