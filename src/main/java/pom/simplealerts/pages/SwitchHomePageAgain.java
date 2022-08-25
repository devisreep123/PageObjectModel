package pom.simplealerts.pages;

import wrappers.GenericWrappers;

public class SwitchHomePageAgain extends GenericWrappers{
 
	public HomePageAgain switchBack() {
		 switchToDefaultContent();
		 return new HomePageAgain();
	 }
	 

}
