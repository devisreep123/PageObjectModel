package pom.facebook.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

	public LoginPage clickOnCreateNewAccount() {
		
		clickByXpath(prop.getProperty("HomePage.CreatNewAccount.XPath"));
		return new LoginPage();
		
	}
	
	
}
