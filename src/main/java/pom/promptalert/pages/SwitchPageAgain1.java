package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class SwitchPageAgain1 extends GenericWrappers{


public SwitchPageAgain1 sleepAgain() {
	
	waitProperty(3000);
	return this;
}
public AlertPageAgain clickOnTryIts() {
		
		clickByXpathNoSnap(prop.getProperty("SwitchPageAgain1.ClickTryIts.XPath"));
		return new AlertPageAgain();
	}
}
