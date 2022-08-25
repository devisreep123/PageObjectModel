package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers {
	
	public HotelPage switchToWindow() {
		switchToLastWindow();
		return this;
	}
	public HotelPage enterCityHotelName(String data) {
		
		enterByXpath(prop.getProperty("HotelPage.CityHotelName.XPath"), data);
		return this;
	}
	public HotelPage clickCity() {
		
		clickByXpath(prop.getProperty("HotelPage.City.XPath"));
		return this;
	}
	public HotelPage sleepFirst() {
		waitProperty(3000);
		return this;
	}
	public HotelPage clickCheckInDate() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckInDate.XPath"));
		return this;
	}

	public HotelPage clickCheckInYear() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckInYear.XPath"));
		return this;
	}
	public HotelPage clickYearOfCheckIn() {
		
		clickByXpath(prop.getProperty("HotelPage.YearOfCheckIn.XPath"));
		return this;
	}
	public HotelPage clickCheckInMonth() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckInMonth.XPath"));
		return this;
	}
	public HotelPage clickCheckInDay() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckInDay.XPath"));
		return this;
	}
	public HotelPage clickCheckOutDate() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckOutDate.XPath"));
		return this;
	}

	public HotelPage clickCheckOutYear() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckOutYear.XPath"));
		return this;
	}
	public HotelPage selectCheckOutYear() {
		
		clickByXpath(prop.getProperty("HotelPage.SelectCheckOutYear.XPath"));
		return this;
	}
	public HotelPage clickCheckOutMonth() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckOutMonth.XPath"));
		return this;
	}
	public HotelPage clickCheckOutDay() {
		
		clickByXpath(prop.getProperty("HotelPage.CheckOutDay.XPath"));
		return this;
	}
	public HotelPage clickRooms() {
		
		clickByXpath(prop.getProperty("HotelPage.Rooms.XPath"));
		return this;
	}
	public HotelPage selectNumberOfRooms(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("HotelPage.NumberOfRooms.XPath"), value);
		return this;
	}
	public HotelPage selectNumberOfAdults(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("HotelPage.NumberOfAdults.XPath"), value);
		return this;
	}
	public HotelPage clickDone() {
		
		clickByXpath(prop.getProperty("HotelPage.ClickDone.XPath"));
		return this;
	}
	
	public HotelSearchPage clickFindHotel() {
		
		clickByXpath(prop.getProperty("HotelPage.FindHotels.XPath"));
		return new HotelSearchPage();

	}
}
