package pom.irctc.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers {

	public UserRegistrationPage enterUserId(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.UserId.XPath"), data);
   	 return this;
    }
    public UserRegistrationPage pageDowns1() {
    	pageDown();
    	return this;
    }
	public UserRegistrationPage waitHere() {
		waitProperty(3000);
		return this;
	}
    public UserRegistrationPage enterPassword(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.Password.XPath"), data);
   	 return this;
   	 
    }
    public UserRegistrationPage enterConfirmPassword(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.Confirmpassword.XPath"), data);
   	 return this;
    }
    
    public UserRegistrationPage selectSecurityQuestion(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.SelectSecurityQuestion.XPath"), value);
   	 return this;
    }
    public UserRegistrationPage enterSecurityAnswer(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.SecurityAnswer.XPath"), data);
   	 return this;
    }
    public UserRegistrationPage clickDateOfBirth() {
   	 
   	 clickByXpath(prop.getProperty("UserRegistrationPage.DateOfBirth.XPath"));
   	 return this;
    }
    
    public UserRegistrationPage selectMonth(String value) {
   	 
    	selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Month.XPath"), value);
   	 
   	 return this;
    }
    public UserRegistrationPage selectYear(String value) {
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Year.XPath"), value);
   	 
   	 return this;
    }  
    public UserRegistrationPage clickOnDate() {
   	 
   	 clickByXpath(prop.getProperty("UserRegistrationPage.Date.XPath"));
   	 return this;
    }
    public UserRegistrationPage clickOnGenderFemale() {
   	 
   	 clickByXpath(prop.getProperty("UserRegistrationPage.Gender.XPath"));
   	 return this;
    
    }
    public UserRegistrationPage clickOnMaritalStatus() {
   	 
   	 clickByXpath(prop.getProperty("UserRegistrationPage.MaritalStatus.XPath"));
   	 return this;
    }
    
    public UserRegistrationPage enterEmailId(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.Email.XPath"), data);
   	 return this;
    }
    public UserRegistrationPage selectOccupation(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Occupation.XPath"), value);
   	 return this;
    }
    
    public UserRegistrationPage enterFirstName(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.Firstname.XPath"), data);
   	 return this;
    }
    
    public UserRegistrationPage enterMiddleName(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.MiddleName.XPath"), data);
   	 return this;
    }
    public UserRegistrationPage enterLastName(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.Lastname.XPath"), data);
   	 return this;
    }
    public UserRegistrationPage selectNationality(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Nationality.XPath"), value);
   	 return this;
    }
    public UserRegistrationPage enterFlatNumber(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.FlatNumber.XPath"), data);
   	 return this;
    }
    
    public UserRegistrationPage enterStreet(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.Street.XPath"), data);
   	 return this;
    }
    public UserRegistrationPage enterArea(String data) {

        enterByXpath(prop.getProperty("UserRegistrationPage.Area.XPath"), data);
        return this;
    }
    
    public UserRegistrationPage selectCountry(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Country.XPath"), value);
   	 return this;
    }
    
    public UserRegistrationPage enterMobileNumber(String data) {
   	 
        enterByXpath(prop.getProperty("UserRegistrationPage.Mobile.XPath"), data);
        return this;
    }
    public UserRegistrationPage enterPinCode(String data) {
   	 
        enterByXpath(prop.getProperty("UserRegistrationPage.Pincode.XPath"), data);
        return this;
    }
    
    public UserRegistrationPage selectCity(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.City.XPath"), value);
   	 return this;
    }
    public UserRegistrationPage selectState(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.State.XPath"), value);
   	 return this;
    }
    public UserRegistrationPage selectPostOffice(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.PostOffice.XPath"), value);
   	 return this;
    }
    public UserRegistrationPage clickCopyResidence() {
   	 
   	 clickByXpath(prop.getProperty("UserRegistrationPage.CopyResidence.XPath"));
   	 return this;
    } 
    public UserRegistrationPage enterOfficeFlatNumber(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.OfficeFlatNumber.XPath"), data);
   	 return this;
    }
    
    public UserRegistrationPage enterOfficeStreet(String data) {
   	 
   	 enterByXpath(prop.getProperty("UserRegistrationPage.OfficeStreet.XPath"), data);
   	 return this;
    }
    public UserRegistrationPage enterOfficeArea(String data) {

        enterByXpath(prop.getProperty("UserRegistrationPage.OfficeArea.XPath"), data);
        return this;
    }	 
    public UserRegistrationPage selectOfficeCountry(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.OfficeCountry.XPath"), value);
   	 return this;
    }
    public UserRegistrationPage enterOfficeMobileNumber(String data) {
   	 
        enterByXpath(prop.getProperty("UserRegistrationPage.OfficeMobileNumber.XPath"), data);
        return this;
    }
    public UserRegistrationPage enterOfficePinCode(String data) {
   	 
        enterByXpath(prop.getProperty("UserRegistrationPage.OfficePinCode.XPath"), data);
        return this;
    }
    public UserRegistrationPage selectOfficeCity(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.OfficeCity.XPath"), value);
   	 return this;
    }
    public UserRegistrationPage selectOfficeState(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.OfficeState.XPath"), value);
   	 return this;
    }
    public UserRegistrationPage selectOfficePostOffice(String value) {
   	 
   	 selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.OfficePostOffice.XPath"), value);
   	 return this;
    }
    
    
    
    
}
