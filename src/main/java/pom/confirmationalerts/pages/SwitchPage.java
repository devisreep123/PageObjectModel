package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class SwitchPage extends GenericWrappers{

public AlertPage clickOnTryIt() {
		
		clickByXpathNoSnap(prop.getProperty("SwitchPage.TryIt.XPath"));
		return new AlertPage();
	}
	
}
