package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class SwitchPage extends GenericWrappers{

public AlertPage clickOnTryIts1() {
		
		clickByXpathNoSnap(prop.getProperty("SwitchPage.TryIts.XPath"));
		return new AlertPage();
	}
public SwitchPage sleeps() {
	
	waitProperty(3000);
	return this;
}
	
}
