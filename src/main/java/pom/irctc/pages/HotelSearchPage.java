package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelSearchPage extends GenericWrappers {

	public HotelSearchPage switchToNext() {
		
		switchToLastWindow();
		return this;
	}
	
	public HotelSearchPage waitAgain() {
		waitProperty(3000);
		return this;
	}
public HotelDetailPage clickOnFirstHotel() {
		
		clickByXpath(prop.getProperty("HotelSearchPage.ClickOnFirstHotel.XPath"));
		return new HotelDetailPage();
	}

}
