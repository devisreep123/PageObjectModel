package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class AlertPageAgain extends GenericWrappers {
	
	public AlertPageAgain enterAlertNames(String text) {
		
		enterAlertValuesNoSnap(text);
		return this;
	}


	public AlertPageAgain getTheTexts() {
		
		getAlertText();
		return this;
	}
	public SwitchPageAgain2 alertDismiss() {
		
		dismissAlert();
		return new SwitchPageAgain2();
	}
	public AlertPageAgain sleep2A() {
		
		waitProperty(3000);
		return this;
	}
}
