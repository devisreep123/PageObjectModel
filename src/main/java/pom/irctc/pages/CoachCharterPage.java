package pom.irctc.pages;

import wrappers.GenericWrappers;

   public class CoachCharterPage extends GenericWrappers {
	
	   public CoachCharterPage againSwitch() {
		   switchToLastWindow();
		   return this;
	   }
         public UserRegistrationPage clickOnNewUserSignUp() {
        	 
        	 clickByXpath(prop.getProperty("CoachCharterPage.NewUserSignUp.Xpath"));
        	 return new UserRegistrationPage();
         }
         
         
         
         
         
}
