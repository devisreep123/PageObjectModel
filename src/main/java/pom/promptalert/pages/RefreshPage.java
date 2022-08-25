package pom.promptalert.pages;

import wrappers.GenericWrappers;

public class RefreshPage extends GenericWrappers {
	
	public SwitchPageAgain1 switchFramesAgain() {
		
		switchToFrameByIndex(1);
		return new SwitchPageAgain1();
	}
	
	public RefreshPage sleepAgains1() {
		
		waitProperty(3000);
		return this;
	}
	
	
	
	
	

}
