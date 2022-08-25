package pom.irctc.pages;

import wrappers.GenericWrappers;

public class TourismPage extends GenericWrappers{
	
	public TourismPage switchWindows() {
		switchToLastWindow();
		return this;
	}
	/*public TourismPage enterCity(String data) {
		enterByXpath("//input[@class='form-control btn-radius-none ng-valid ng-dirty ng-touched']", data);
		return this;
	}
	
	public TourismPage clickChennai() {
		
		clickByXpath("//span[text()='CHENNAI']");
		return this;
	}*/
	public TourismPage waitProper() {
		
		waitProperty(3000);
		return this;
	}
	public HotelPage clickOnHotels() {
		
		clickByXpath(prop.getProperty("TourismPage.Hotels.XPath"));
		return new HotelPage();
		
	}

}
