package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class SwitchPageAgain1 extends GenericWrappers {

	public AlertPageAgain clickOnTryItAgain() {
		
		clickByXpathNoSnap(prop.getProperty("SwitchPageAgain1.ClickTryIt.XPath"));
		return new  AlertPageAgain();
	}
	
	
}
