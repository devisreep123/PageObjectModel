package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class SwitchPageAgain extends GenericWrappers {
	
	
	public SwitchPageAgain verifyTheText(String text) {
		
		verifyTextContainsByXpath(prop.getProperty("SwitchPageAgain.VeriftTexts.XPath"), text);
		
		return this;
	}
	public RefreshPage pageRefresh() {
		
		refreshPages();
		return  new RefreshPage();
	}
	
	
	

}
