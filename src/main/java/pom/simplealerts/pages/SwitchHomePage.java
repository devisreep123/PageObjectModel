package pom.simplealerts.pages;

import wrappers.GenericWrappers;

public class SwitchHomePage extends GenericWrappers {

	
 public AlertPage clickOnTryIt() {
		
		clickByXpathNoSnap(prop.getProperty("SwitchHomePage.TryIt.XPath"));
		return new AlertPage() ;
	}

 public SwitchHomePage waitHere() {
	 waitProperty(3000);
	 return this;
 }
 
	
}
