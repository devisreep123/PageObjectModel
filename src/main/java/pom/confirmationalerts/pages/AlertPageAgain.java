package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class AlertPageAgain extends GenericWrappers{
	
public AlertPageAgain readText() {
		
		getAlertText();
		return this;
	}
	public SwitchPageAgain2 acceptTheAlerts() {
		
		acceptAlert();
		return new SwitchPageAgain2();
	}
	

}
