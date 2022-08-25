package pom.simplealerts.pages;

import wrappers.GenericWrappers;

public class HomePageAgain extends GenericWrappers{
	
 public SchoolPage clickOnHome() {
		
		clickByXpath(prop.getProperty("HomePageAgain.ClickHome.XPath"));
		return new SchoolPage();
	}	
	

}
