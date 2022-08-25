package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	
	public SwitchPage switchFrames() {
		frameByFrame();
		return new SwitchPage();
	}
	
public HomePage sleep() {
	
	waitProperty(3000);
	return this;
}
	
}
