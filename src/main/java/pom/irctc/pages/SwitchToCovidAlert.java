package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SwitchToCovidAlert extends GenericWrappers{
	
	public CovidAlertPage switchFra() {
		
		frameByFrame();
		return new CovidAlertPage();
	}
	

}
