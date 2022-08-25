package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class AlertPageAgain1 extends GenericWrappers{
	
	public SwitchPageAgain3 cancelTheAlert() {
		
		dismissAlert();
		return new SwitchPageAgain3();
	}
	
	
	
	

}
