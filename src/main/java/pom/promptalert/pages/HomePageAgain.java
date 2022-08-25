package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class HomePageAgain  extends GenericWrappers {
	
public SchoolPage clickOnHome() {
		
		clickByXpathNoSnap(prop.getProperty("HomePageAgain.ClicksHome.XPath"));
		return new SchoolPage();
	}
	
	
	

}
