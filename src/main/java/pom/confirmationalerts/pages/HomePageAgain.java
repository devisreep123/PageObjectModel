package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class HomePageAgain extends GenericWrappers{

	
	
 public SchoolPage clickHome() {
		
		clickByXpath(prop.getProperty("HomePageAgain.Home.XPath"));
		return new SchoolPage();
	}
	
	
	
	
	
}
