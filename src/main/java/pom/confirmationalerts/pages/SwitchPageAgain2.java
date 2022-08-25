package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class SwitchPageAgain2 extends GenericWrappers {
	
public AlertPageAgain1 clickOnTryIt() {
		
		clickByXpathNoSnap(prop.getProperty("SwitchPageAgain2.ClickOnTryIt.XPath"));
		return new AlertPageAgain1();
	}
	
	
	
	

}
