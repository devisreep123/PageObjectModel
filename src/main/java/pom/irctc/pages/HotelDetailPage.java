package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailPage extends GenericWrappers{
	
	public HotelDetailPage switchAgainTo() {
		switchToLastWindow();
		return this;
	}
	
	public HotelDetailPage waitAgains() {
		waitProperty(3000);
		return this;
	}
	public HotelDetailPage getHotelName() {
		
		getTextByXpath(prop.getProperty("HotelDetailPage.GetHotelName.XPath"));
		return this;
	}
	public HotelDetailPage getHotelPrice() {
		
		getTextByXpath(prop.getProperty("HotelDetailPage.GetHotelPrice.XPath"));
		return this;
	}
	public GuestPage clickContinueToBook(){
		
		clickByXpath(prop.getProperty("HotelDetailPage.ContinueToBook.XPath"));
		return new GuestPage();
	}

}
