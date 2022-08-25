package pom.irctc.pages;

import wrappers.GenericWrappers;

public class DishaPage extends GenericWrappers {
	
public SwitchToCovidAlert dishaClose() {
		
		clickByXpath(prop.getProperty("DishPage.Close.Xpath"));
		return new SwitchToCovidAlert();
	}

}
