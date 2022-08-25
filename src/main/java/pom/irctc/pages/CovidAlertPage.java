package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{

	
	
	public HomePage clickOnOK() {
		clickByXpath(prop.getProperty("CovidAlertPage.ClickOk.XPath"));
		return new HomePage();
		
	}
	public CovidAlertPage waitingSleep() {
		
		waitProperty(3000);
		return this;
	}
	
}
