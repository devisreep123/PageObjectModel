package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{

	public CharterPage clickOnEnquiryForm() {
		
		clickByXpath(prop.getProperty("CharterPage.ClickOnEnquiryForm.XPath"));
		return this;
	}
	public CharterPage threadSleeps() {
		
		waitProperty(3000);
		return this;
	}
	public CharterPage enterApplicantName(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.ApplicantName.XPath"), data);
		return this;
	}
	public CharterPage enterOrganisation(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.Organisation.XPath"), data);
		return this;
	}
	public CharterPage enterAddress(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.Address.XPath"), data);
		return this;
	}
	public CharterPage enterMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.MobileNumber.XPath"), data);
		return this;
	}
	public CharterPage enterEmailAddress(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.EmailAddress.XPath"), data);
		return this;
	}
	
	public CharterPage selectSaloon(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("CharterPage.Saloon.XPath"), value);
		return this;
	}
	public CharterPage enterOriginationStation(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.OriginationStation.XPath"), data);
		return this;
	}
	
	public CharterPage enterdestinationStation(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.DestinationStation.XPath"), data);
		return this;
	}
	
	public CharterPage clickOnDateOfDeparture() {
		
		clickByXpath(prop.getProperty("CharterPage.DateOfDeparture.XPath"));
		return this;
	}
	
	public CharterPage clickOnMonthDeparture() {
		
		clickByXpath(prop.getProperty("CharterPage.MonthDeparture.XPath"));
		return this;
	}
	public CharterPage selectOnYearDeparture(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("CharterPage.YearDeparture.XPath"), value);
		return this;
	}
	public CharterPage clickOnDayDeparture() {
		
		clickByXpath(prop.getProperty("CharterPage.DayDeparture.XPath"));
		return this;
	}
	
public CharterPage clickOnDateOfArrival() {
		
		clickByXpath(prop.getProperty("CharterPage.DateOfArrival.XPath"));
		return this;
	}
	
	
	public CharterPage selectYearArrival(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("CharterPage.YearArrival.XPath"), value);
		return this;
	}
public CharterPage clickOnMonthArrival() {
		
		clickByXpath(prop.getProperty("CharterPage.MonthArrival.XPath"));
		return this;
	}
	public CharterPage clickOnDayArrival() {
		
		clickByXpath(prop.getProperty("CharterPage.DayArrival.XPath"));
		return this;
	}
	public CharterPage enterDuration(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.Duration.XPath"), data);
		return this;
	}
	
	public CharterPage enterNumberOfCoaches(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.NumberOfCoaches.XPath"), data);
		return this;
	}
	public CharterPage enterNumberOfPassengers(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.NumberOfPassengers.XPath"), data);
		return this;
	}
	public CharterPage enterPurposeOfChart(String data) {
	
	enterByXpath(prop.getProperty("CharterPage.PurposeOfChart.XPath"), data);
	return this;
	}
	public CharterPage enterAdditionalServices(String data) {
		
		enterByXpath(prop.getProperty("CharterPage.AdditionalServices.XPath"), data);
		return this;
	}

	



}
