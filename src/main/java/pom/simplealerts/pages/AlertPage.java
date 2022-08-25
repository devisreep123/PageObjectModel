package pom.simplealerts.pages;

import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers {
	
 public AlertPage readText() {
	 
	 getAlertText();
	 return this;
 }
	
	public SwitchHomePageAgain acceptTheAlerts() {
		
		acceptAlert();
		return new SwitchHomePageAgain();
	}
	
	

}
