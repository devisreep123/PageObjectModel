package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class SwitchPageAgain extends GenericWrappers{
	
	
	public SwitchPageAgain verifyTheText(String text) {
		
		verifyTextContainsByXpath(prop.getProperty("SwitchPageAgain.VeriftText.XPath"), text);
		
		return new SwitchPageAgain();
	}
	
	public RefreshPage pageRefresh() {
		
		refreshPages();
		return new RefreshPage();
	}

}
