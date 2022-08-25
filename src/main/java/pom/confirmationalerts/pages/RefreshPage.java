package pom.confirmationalerts.pages;

import wrappers.GenericWrappers;

public class RefreshPage extends GenericWrappers{
	
	public SwitchPageAgain1 switchFrames() {
		
		frameByFrame();
		return new  SwitchPageAgain1();
	}

}
