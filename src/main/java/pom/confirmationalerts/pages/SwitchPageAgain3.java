package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class SwitchPageAgain3 extends GenericWrappers {

public SwitchPageAgain3 verifyTheText(String text) {
	
		verifyTextContainsByXpath(prop.getProperty("SwitchPageAgain3.VeriftTexts.XPath"), text);
		
		return new SwitchPageAgain3();
	}
	
public HomePageAgain backToHomePage() {
	
	switchToDefaultContent();
	return new  HomePageAgain();
}


}
