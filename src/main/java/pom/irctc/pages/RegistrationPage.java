package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.UserName.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	public RegistrationPage pageDowns() {
    	pageDown();
    	return this;
    }
	public RegistrationPage sleepWait(){
		waitProperty(2000);
		return this;
	}
	public RegistrationPage clickOnPreferredLanguage() {
		
		clickByXpath(prop.getProperty("RegistrationPage.PreferredLanguage.XPath"));
		return this;
	}
	public RegistrationPage selectPreferredLanguage() {
		
		clickByXpath(prop.getProperty("RegistrationPage.SelectPreferredLanguage.XPath"));
		return this;
		
	}
	public RegistrationPage clickOnSecurityQuestion() {
		
		clickByXpath(prop.getProperty("RegistrationPage.SecurityQuestion.XPath"));
		return this;
		
	}
	public RegistrationPage selectSecurityQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.SelectSecurityQuestion.XPath"));
		return this;
	}
	
	public RegistrationPage enterSecurityAnswer(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.SecurityAnswer.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnContinue() {
		
		clickByXpath(prop.getProperty("RegistrationPage.Continue.XPath"));
		return this;
	}
	
	public RegistrationPage enterFirstName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Firstname.XPath"), data);
		return this;
	}
	public RegistrationPage enterMiddleName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.XPath"), data);
		return this;
		
	}
	
	public RegistrationPage enterLastName(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.LastName.XPath"), data);
		return this;
		
	}
	
	public RegistrationPage clickOnSelectOccupation() {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickSelectOccupation.XPath"));
		return this;
	}
	
	public RegistrationPage selectOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.SelectOccupation.XPath"));
		return this;
		
	}
	public RegistrationPage enterDateOfBirth(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.DateOfBirth.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnMarried() {
		
		clickByXpath(prop.getProperty("RegistrationPage.Married.XPath"));
		return this;
	}
	
	public RegistrationPage selectCountry(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Country.XPath"), value);
		return this;
			
	}
	public RegistrationPage clickOnFemale() {
		
		clickByXpath(prop.getProperty("RegistrationPage.clickOnFemale.XPath"));
		return this;
		
	}
	public RegistrationPage enterEmail(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Email.XPath"), data);
		return this;
	}
	public RegistrationPage enterMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.XPath"), data);
		return this;
	}
	
			
	public RegistrationPage selectANationality(String value){
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.Nationality.XPath"), value);
		return this;
	}
		
	public RegistrationPage clickContinue() {
		
		clickByXpath(prop.getProperty("RegistrationPage.clickContinue.XPath"));
		return this;
	}
	public RegistrationPage enterFlatNumber(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.FlatNumber.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterStreet(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Street.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterArea(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.Area.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterPinCode(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.PinCode.XPath"), data);
		return this;
	}
	
	public RegistrationPage enterState(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.State.XPath"), data);
		return this;
	}
	public RegistrationPage selectCitys(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.City.XPath"), value);
		return this;
		
	}
	public RegistrationPage selectAPostoffice(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("RegistrationPage.PostOffice.XPath"), value);
		return this;
	}
	public RegistrationPage enterPhoneNumber(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.PhoneNumber.XPath"), data);
		return this;
	}
	
	public RegistrationPage clickOnNo() {
		
		clickByXpath(prop.getProperty("RegistrationPage.ClickNo.XPath"));		
		return this;
	}
	public RegistrationPage enterOfficeNumber(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeNumber.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeStreet(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeAddress1.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeArea(String data) {
				
		enterByXpath(prop.getProperty("RegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	public RegistrationPage clickOnOfficeCountry() {
		
	    clickByXpath(prop.getProperty("RegistrationPage.OfficeCountry.XPath"));
		return this;
		
	}
	
	public RegistrationPage selectOfficeCountry() {
		
		clickByXpath(prop.getProperty("RegistrationPage.SelectOfficeCountry.XPath"));
		return this;
	}
	public RegistrationPage enterOfficePincode(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficePinCode.XPath"), data);
		return this;
	}
	public RegistrationPage enterOfficeState(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeState.XPath"), data);
		return this;
	}
	
	public RegistrationPage selectOfficeCity(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficeState.XPath"), data);
		
		return this;
		
	}
	public RegistrationPage selectOfficePostOffice(String value) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficePostOffice.XPath"), value);
		
		return this;
	}
	public RegistrationPage enterOfficePhoneNumber(String data) {
		
		enterByXpath(prop.getProperty("RegistrationPage.OfficePhoneNumber.XPath"), data);
		return this;
	}
	/*public RegistrationPage switchFrames() {
		
		frameByFrame();
		return this;
	}*/
	
	
	
	
	
	
	
	
	
	
}
