package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers{
	
	public AlertPage readText() {
		
		getAlertText();
		return this;
	}
	public SwitchPageAgain acceptTheAlerts() {
		
		acceptAlert();
		return new SwitchPageAgain();
	}

}
