package pom.facebook.pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
	public LoginPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("LoginPage.FirstName.XPath"), data);
		return this;
	}
	public LoginPage enterSurName(String data) {
		
		enterByXpath(prop.getProperty("LoginPage.LastName.XPath"), data);
		return this;
	}
	public LoginPage enterMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("LoginPage.Email.XPath"), data);
		return this;
	}
	public LoginPage enterNewPassword(String data) {
		
		enterByXpath(prop.getProperty("LoginPage.NewPassword.XPath"), data);
		return this;
	}
	
	public LoginPage selectDateOfBirth(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("LoginPage.DateOfBirth.XPath"), value);
		return this;
	}
	
	public LoginPage selectMonthOfBirth(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("LoginPage.MonthOfBirth.XPath"), value);
		return this;
	}
	public LoginPage selectYearOfBirth(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("LoginPage.YearOfBirth.XPath"), value);
		return this;
	}
	public LoginPage clickOnGender() {
		
		clickByXpath(prop.getProperty("LoginPage.Gender.XPath"));
		return this;
	}
	
	
	
	
	
	
	
	
}
