package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class AlertPage extends GenericWrappers {

	public AlertPage sleepsAg() {
		
		waitProperty(2000);
		return this;
	}
public AlertPage enterAlertName(String text) {
	
	
	enterAlertValuesNoSnap(text);
	
	return this;
}



public AlertPage getTheText() {
	
	getAlertText();
	return this;
}
public SwitchPageAgain alertAccept() {
	
	acceptAlert();
	return new SwitchPageAgain();
	
}




}
