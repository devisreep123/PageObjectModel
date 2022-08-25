package pom.formc.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers{
	
	public UserRegistrationPage enterUserId(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.UserId.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterPassword(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.Password.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterConfirmPassword(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.ConfirmPassword.Xpath"), data);
	return this;
}
	public UserRegistrationPage selectSecurityQuestion(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.SecurityQuestion.Xpath"), value);
		return this;
	}
	
	public UserRegistrationPage enterSecurityAnswer(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.SecurityAnswer.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.Name.Xpath"), data);
		return this;
	}
	public UserRegistrationPage selectGender(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Gender.Xpath"), value);
		return this;
	}
	public UserRegistrationPage enterDateOfBirth(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.DateOfBirth.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterDesignation(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.Designation.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterEmailId(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.EmailId.Xpath"), data);
	return this;
}
	public UserRegistrationPage enterMobileNumber(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.MobileNumber.Xpath"), data);
	return this;
}
	public UserRegistrationPage enterPhoneNumber(String data) {
	
	enterByXpath(prop.getProperty("UserRegistrationPage.PhoneNumber.Xpath"), data);
	return this;
}
	public UserRegistrationPage enterHotelName(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelName.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterCapacity(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.Capacity.Xpath"), data);
		return this;
	}
	public UserRegistrationPage enterAddress(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.Address.Xpath"), data);
		return this;
	}
	
	public UserRegistrationPage selectState(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.State.Xpath"), value);
		return this;
	}
	
	public UserRegistrationPage waitSleep() {
		waitProperty(3000);
		return this;
	}
	
	public UserRegistrationPage selectCity(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.City.Xpath"),value);
		
		return this;
	}
	
	public UserRegistrationPage selectAccomadationType(String value) {
	
	selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Accomadation.Xpath"), value);
	return this;
}
	public UserRegistrationPage selectAccomadationGrade(String value) {
		
		selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.AccomadationGrade.Xpath"), value);
		return this;
	}
	
	public UserRegistrationPage enterHotelEmailId(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelEmail.Xpath"), data);
		return this;
	}
		public UserRegistrationPage enterHotelMobileNumber(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelMobileNumber.Xpath"), data);
		return this;
	}
		public UserRegistrationPage enterHotelPhoneNumber(String data) {
		
		enterByXpath(prop.getProperty("UserRegistrationPage.HotelPhoneNumber.Xpath"), data);
		return this;
	}
	
		public UserRegistrationPage enterPassenger1Name(String data) {
			
			enterByXpath(prop.getProperty("UserRegistrationPage.Passenger1Name.Xpath"), data);
			return this;
		}
		public UserRegistrationPage enterPassenger1Address(String data) {
			
			enterByXpath(prop.getProperty("UserRegistrationPage.Passenger1Address.Xpath"), data);
			return this;
		}
	
		public UserRegistrationPage selectPassenger1State(String value) {
			
			selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Passenger1State.Xpath"), value);
			return this;
		}
	
		public UserRegistrationPage selectPassenger1City(String value) {
			
			selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Passenger1City.Xpath"), value);
			return this;
		}
		public UserRegistrationPage enterPassenger1EmailId(String data) {
			
			enterByXpath(prop.getProperty("UserRegistrationPage.Passenger1EmailId.Xpath"), data);
			return this;
		}
			public UserRegistrationPage enterPassenger1PhoneNumber(String data) {
			
			enterByXpath(prop.getProperty("UserRegistrationPage.Passenger1PhoneNumber.Xpath"), data);
			return this;
		}
			public UserRegistrationPage enterPassenger1MobileNumber(String data) {
			
			enterByXpath(prop.getProperty("UserRegistrationPage.Passenger1MobileNumber.Xpath"), data);
			return this;
		}
			public UserRegistrationPage clickOnAdd() {
				
				clickByXpath(prop.getProperty("UserRegistrationPage.Add.Xpath"));
				return this;
			}
			
			public UserRegistrationPage enterPassenger2Name(String data) {
				
				enterByXpath(prop.getProperty("UserRegistrationPage.Passenger2Name.Xpath"), data);
				return this;
			}
			public UserRegistrationPage enterPassenger2Address(String data) {
				
				enterByXpath(prop.getProperty("UserRegistrationPage.Passenger2Address.Xpath"), data);
				return this;
			}
		
			public UserRegistrationPage selectPassenger2State(String value) {
				
				selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Passenger2State.Xpath"), value);
				return this;
			}
		
			public UserRegistrationPage selectPassenger2City(String value) {
				
				selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Passenger2City.Xpath"), value);
				return this;
			}
			public UserRegistrationPage enterPassenger2EmailId(String data) {
				
				enterByXpath(prop.getProperty("UserRegistrationPage.Passenger2EmailId.Xpath"), data);
				return this;
			}
				public UserRegistrationPage enterPassenger2PhoneNumber(String data) {
				
				enterByXpath(prop.getProperty("UserRegistrationPage.Passenger2PhoneNumber.Xpath"), data);
				return this;
			}
				public UserRegistrationPage enterPassenger2MobileNumber(String data) {
				
				enterByXpath(prop.getProperty("UserRegistrationPage.Passenger2MobileNumber.Xpath"), data);
				return this;
			}
		
				public UserRegistrationPage clickAdd() {
					
					clickByXpath(prop.getProperty("UserRegistrationPage.Add1.Xpath"));
					return this;
				}
				
				public UserRegistrationPage enterPassenger3Name(String data) {
					
					enterByXpath(prop.getProperty("UserRegistrationPage.Passenger3Name.Xpath"), data);
					return this;
				}
				public UserRegistrationPage enterPassenger3Address(String data) {
					
					enterByXpath(prop.getProperty("UserRegistrationPage.Passenger3Address.Xpath"), data);
					return this;
				}
			
				public UserRegistrationPage selectPassenger3State(String value) {
					
					selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Passenger3State.Xpath"), value);
					return this;
				}
			
				public UserRegistrationPage selectPassenger3City(String value) {
					
					selectVisibleTextByXpath(prop.getProperty("UserRegistrationPage.Passenger3City.Xpath"), value);
					return this;
				}
				public UserRegistrationPage enterPassenger3EmailId(String data) {
					
					enterByXpath(prop.getProperty("UserRegistrationPage.Passenger3EmailId.Xpath"), data);
					return this;
				}
					public UserRegistrationPage enterPassenger3PhoneNumber(String data) {
					
					enterByXpath(prop.getProperty("UserRegistrationPage.Passenger3PhoneNumber.Xpath"), data);
					return this;
				}
					public UserRegistrationPage enterPassenger3MobileNumber(String data) {
					
					enterByXpath(prop.getProperty("UserRegistrationPage.Passenger3MobileNumber.Xpath"), data);
					return this;
				}
			
			
	
	
}
