package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public SwitchPage switchFrame() {
		frameByFrame();
		return new SwitchPage();
	}
	
	public HomePage waitHeres() {
		
		waitProperty(3000);
		return this;
	}
	
	

}
