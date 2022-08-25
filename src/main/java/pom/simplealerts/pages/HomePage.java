package pom.simplealerts.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	

	 public HomePage waitHere() {
		 waitProperty(3000);
		 return this;
	 }
	
	public SwitchHomePage switchFrame() {
		switchToFrameByIndex(1);
		return  new SwitchHomePage();
	}
	
 
	
	
	
	
	
	
	
	
	
	
	
	

}
