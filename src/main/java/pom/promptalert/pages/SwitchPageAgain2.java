package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class SwitchPageAgain2 extends GenericWrappers{
	
	public SwitchPageAgain2 verifyTextAlert(String text) {
		
		verifyTextContainsByXpath(prop.getProperty("SwitchPageAgain2.VerifyCancel.XPath"), text);
		return this;
	}
	
	public HomePageAgain defaultContent() {
		
		switchToDefaultContent();
		return new HomePageAgain();
	}
	
	
	
	

}
