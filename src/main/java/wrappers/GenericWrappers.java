package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

	public static RemoteWebDriver driver;
	
	public static Properties prop =null;
	
	public void loadObjects() {
		 prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadObjects() {
		prop=null;
	}
	
	
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//	System.out.println("The browser "+browser+" got launcehd with the given url "+url+" successfully");
			
			reportStep("The browser "+browser+" got launcehd with the given url "+url+" successfully", "pass");
			
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The browser "+browser+" is not launcehd due to session not created error");
			
			reportStep("The browser "+browser+" is not launcehd due to session not created error", "fail");
			
		} catch (InvalidArgumentException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launched as url doesnt con tain http/https");
			reportStep("The browser "+browser+" is not launched as url doesnt con tain http/https", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser "+browser+" is not launcehd due to unknonwn error");
			reportStep("The browser "+browser+" is not launcehd due to unknonwn error", "fail");
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is  entered with data"+data);
			
			reportStep("The element with id "+idValue+" is  entered with data", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application ");
			
			reportStep("The element with id "+idValue+" is not visible in the application ", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The elemnt with id "+idValue+" is not stable in the application");
			reportStep("The elemnt with id "+idValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactable in the application ");
			reportStep("The element with name "+nameValue+" is not interactable in the application ", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered in the application due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered in the application due to unknown error", "fail");
		}
		
		
		
		}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			
			//System.out.println("The element with the name "+xpathValue+" is entered with data"+data);
			reportStep("The element with the name "+xpathValue+" is entered with data"+data, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			
			//System.err.println("The element with name "+xpathValue+" is not found in the DOM");
			reportStep("The element with name "+xpathValue+" is not found in the DOM", "fail");
			
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+xpathValue+" is not visible in the application");
			reportStep("The element with name "+xpathValue+" is not visible in the application", "fail");
			
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with the name "+xpathValue+" is not interactable in the application");
			reportStep("The element with the name "+xpathValue+" is not interactable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with the name "+xpathValue+" is not stable in the application");
			reportStep("The element with the name "+xpathValue+" is not stable in the application", "fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with the name "+xpathValue+" is not entered in the application due to unkown error");
			reportStep("The element with the name "+xpathValue+" is not entered in the application due to unkown error", "fail");
			
		}
		
			
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
				
			String tit=driver.getTitle();
			if(tit.equals(title)) {
				//System.out.println("The title of the browser "+title+" is verified successfully");
				reportStep("The title of the browser "+title+" is verified successfully", "pass");
				
			} else {
				//System.out.println("The title of the browser is not verified ");
				reportStep("The title of the browser "+title+" is verified successfully", "fail");
			}
			
		}  catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The title of the browser "+title+" is not launched due to unknown error");
			reportStep("The title of the browser "+title+" is verified successfully", "fail");
		}
		 
		}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
	
		try {
			String actualText=driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with id "+id+"  holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with id "+id+"  holding the text "+actualText+" is matched with expected text "+text, "pass");
			}else
			{
				//System.out.println("The element with id "+id+" holding the text "+actualText+" is not matched with expected text "+text);
				reportStep("The element with id "+id+" holding the text "+actualText+" is not matched with expected text "+text, "fail");
			}
						
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
				
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application ");
			reportStep("The element with id "+id+" is not visible in the application ", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application ");
			reportStep("The element with id "+id+" is not interactable in the application ", "fail");
			
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not stable in the application");
				reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The locator with id "+id+" is not found due to unknown error in the application");
			reportStep("The locator with id "+id+" is not found due to unknown error in the application", "fail");
		}
	}
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText=driver.findElementByXPath(xpath).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with id "+xpath+" holding the text "+actualText+" is matched with expected text "+text);
				
				reportStep("The element with id "+xpath+" holding the text "+actualText+" is matched with expected text "+text, "pass");
			}else
			{
				//System.out.println("The element with id "+xpath+" holding the text "+actualText+" is not matched with expected text "+text);
				reportStep("The element with id "+xpath+" holding the text "+actualText+" is not matched with expected text "+text, "fail");
			}
			
		}catch (NoSuchElementException e) {
			//System.err.println("The element with id "+xpath+" is not found in the DOM");
			reportStep("The element with id "+xpath+" is not found in the DOM", "fail");
				
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpath+" is not visible in the application ");
			reportStep("The element with id "+xpath+" is not visible in the application ", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpath+" is not interactable in the application ");
			reportStep("The element with id "+xpath+" is not interactable in the application ", "fail");
		}catch (StaleElementReferenceException e) {
				// TODO: handle exception
			//System.err.println("The element with id "+xpath+" is not stable in the application");
			reportStep("The element with id "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpath+" is not found in the applocation due to unknown error");
			reportStep("The element with id "+xpath+" is not found in the applocation due to unknown error", "fail");
			}
		
			}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText=driver.findElementByXPath(xpath).getText();
			if(actualText.contains(text)) {
				//System.out.println("The element with id "+xpath+" holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with id "+xpath+" holding the text "+actualText+" is matched with expected text "+text, "pass");
			}else
			{
				//System.out.println("The element with id "+xpath+" holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with id "+xpath+" holding the text "+actualText+" is not matched with expected text "+text, "fail");
			}
			
		}catch (NoSuchElementException e) {
			//System.err.println("The element with id "+xpath+" is not found in the DOM");
			reportStep("The element with id "+xpath+" is not found in the DOM", "fail");
				
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpath+" is not visible in the application ");
			reportStep("The element with id "+xpath+" is not visible in the application ", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpath+" is not interactable in the application ");
			reportStep("The element with id "+xpath+" is not interactable in the application ", "fail");}
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				
				//System.err.println("The element with id "+xpath+" is not stable in the application");
				reportStep("The element with id "+xpath+" is not stable in the application","fail");
			}
		catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+xpath+" is not found in the application due to unknown error");
			reportStep("The element with id "+xpath+" is not found in the application due to unknown error", "fail");
		}	
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		try
		{
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+ "is clicked in the application");
			reportStep("The element with id "+id+ "is clicked in the application", "pass");
			
		} 
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application ");
			reportStep("The element with id "+id+" is not visible in the application ", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is unable to click");
			reportStep("The element with id "+id+" is unable to click", "fail");
		} 	catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not stable");
			reportStep("The element with id "+id+" is not stable", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+id+" is not clicked in the application due to unknown error");
			reportStep("The element with id "+id+" is not clicked in the application due to unknown error", "fail");
		}
		
					
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
	try {
		driver.findElementByClassName(classVal).click();
		
		//System.out.println("The element with classname "+classVal+ "is clicked");
		reportStep("The element with classname "+classVal+ "is clicked", "pass");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with classname "+classVal+" is not found in the DOM");
		reportStep("The element with classname "+classVal+" is not found in the DOM", "fail");
	} catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with classname "+classVal+" is not visible in the application ");
		reportStep("The element with classname "+classVal+" is not visible in the application ", "fail");
	} catch (ElementClickInterceptedException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with classname "+classVal+" is not able to click");
		reportStep("The element with classname "+classVal+" is not able to click", "fail");
	} 	catch (StaleElementReferenceException e) {
		// TODO: handle exception
		
		//System.err.println("The element with classname "+classVal+" is not stable");
		reportStep("The element with classname "+classVal+" is not stable", "fail");
	} catch (WebDriverException e) {
		// TODO: handle exception
		
		//System.err.println("The element with classname "+classVal+" is not clicked due to unknown error");
		reportStep("The element with classname "+classVal+" is not clicked due to unknown error","fail");
	}
	
					
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+"is clicked");
			
			reportStep("The element with name "+name+"is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the DOM");
			reportStep("The element with name "+name+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application ");
			reportStep("The element with name "+name+" is not visible in the application ", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not able to click");
			reportStep("The element with name "+name+" is not able to click", "fail");
		} 	catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The elemnt with name "+name+" is not stable");
			reportStep("The elemnt with name "+name+" is not stable", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with name "+name+" is not clicked due to unknown error");
			reportStep("The element with name "+name+" is not clicked due to unknown error", "fail");
		}
		
			
		}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
		
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with link "+name+ "is clicked");
			reportStep("The element with link "+name+ "is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in the DOM");
			reportStep("The element with link "+name+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application ");
			reportStep("The element with link "+name+" is not visible in the application ", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not able to click");
			reportStep("The element with link "+name+" is not able to click", "fail");
		} 	catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The elemnt with link "+name+" is not stable");
			reportStep("The elemnt with link "+name+" is not stable", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with link "+name+" is not clicked due to unknown error");
			reportStep("The element with link "+name+" is not clicked due to unknown error", "fail");
		}
				
			
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The element with link "+name+ "is clicked");
			reportStep("The element with link "+name+ "is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not found in the DOM");
			reportStep("The element with link "+name+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not visible in the application ");
			reportStep("The element with link "+name+" is not visible in the application ", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not able to click");
			reportStep("The element with link "+name+" is not able to click", "fail");
		} 	catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The elemnt with link "+name+" is not stable");
			reportStep("The elemnt with link "+name+" is not stable", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with link "+name+" is not clicked due to unknown error");
			reportStep("The elemnt with link "+name+" is not stable", "fail");
		}
		
		
		}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The element with XPath "+xpathVal+" is clicked");
			reportStep("The element with XPath "+xpathVal+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with XPath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathVal+" is not visible in the application ");
			reportStep("The element with XPath "+xpathVal+" is not visible in the application ", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath "+xpathVal+" is not able to click");
			reportStep("The element with XPath "+xpathVal+" is not able to click", "fail");
		} 	catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The elemnt with XPath "+xpathVal+" is not stable");
			reportStep("The elemnt with XPath "+xpathVal+" is not stable", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with XPath"+xpathVal+"is not clicked due to unknown error");
			reportStep("The element with XPath"+xpathVal+"is not clicked due to unknown error", "fail");
		}
		
		}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
		
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The element with XPath "+xpathVal+ "is clicked");
			reportStep("The element with XPath "+xpathVal+ "is clicked", "pass", false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath "+xpathVal+" is not found in the DOM");
			reportStep("The element with XPath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with XPath "+xpathVal+" is not visible in the application ");
			reportStep("The element with XPath "+xpathVal+" is not visible in the application ", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with XPath "+xpathVal+" is not able to click");
			reportStep("The element with XPath "+xpathVal+" is not able to click", "fail");
		} 	catch (StaleElementReferenceException e) {
			// TODO: handle exception
			
			//System.err.println("The elemnt with XPath "+xpathVal+" is not stable");
			reportStep("The elemnt with XPath "+xpathVal+" is not stable", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with XPath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with XPath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
		
		
		}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualText = null;
		try {
			 actualText=driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+ "is  holding the text "+actualText);
			reportStep("The element with id "+idVal+ "is  holding the text "+actualText, "pass");
						
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+idVal+" is not  holding the text "+actualText);
			reportStep("The element with id "+idVal+" is not  holding the text "+actualText, "fail");
				
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in the application ");
			reportStep("The element with id "+idVal+" is not visible in the application ", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");}
			catch (StaleElementReferenceException e) {
				// TODO: handle exception
				
				//System.err.println("The element with id "+idVal+" is not stable");
				reportStep("The element with id "+idVal+" is not stable", "fail");
			}
		catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+idVal+" is not found due to unknown error");
			reportStep("The element with id "+idVal+" is not found due to unknown error", "fail");
		}
			
		
		return actualText;
		}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualText = null;
		try {
			 actualText=driver.findElementByXPath(xpathVal).getText();
			
			//System.out.println("The element with id "+xpathVal+" is holding the text "+actualText);
			reportStep("The element with id "+xpathVal+" is holding the text "+actualText, "pass");
			
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+xpathVal+" is not holding the text "+actualText);
			reportStep("The element with id "+xpathVal+" is not holding the text "+actualText, "fail");
			
				
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpathVal+" is not visible in the application ");
			reportStep("The element with id "+xpathVal+" is not visible in the application ", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+xpathVal+" is not interactable in the application");
			reportStep("The element with id "+xpathVal+" is not interactable in the application", "fail");}
		catch (StaleElementReferenceException e) {
				// TODO: handle exception
				
			//	System.err.println("The element with id "+xpathVal+" is not stable");
				reportStep("The element with id "+xpathVal+" is not stable", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			
			//System.err.println("The element with id "+xpathVal+" is not found due to unknown error");
			reportStep("The element with id "+xpathVal+" is not found due to unknown error", "fail");
		}
				
		
		return actualText;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
	
		try {
			WebElement drop=driver.findElementById(id);
			Select sel=new Select(drop);
			sel.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selected with visible text "+value);
			reportStep("The element with id "+id+" is selected with visible text "+value, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with id "+id+" is not selected with visible text "+value);
		reportStep("The element with id "+id+" is not selected with visible text "+value, "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application ");
			reportStep("The element with id "+id+" is not visible in the application ", "fail");
		}
			catch (ElementClickInterceptedException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with id "+id+" is not able to click");
				reportStep("The element with id "+id+" is not able to click", "fail");
		
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				
				//System.err.println("The dropdown with id "+id+" is not able to select");
				reportStep("The dropdown with id "+id+" is not able to select", "fail");
			}
		
		catch (WebDriverException e) {
				// TODO: handle exception
				
				//System.err.println("The element with id "+id+" is not selected due to unknown error");
				reportStep("The element with id "+id+" is not selected due to unknown error", "fail");
		
		}
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
	
		
		try {
			WebElement drop=driver.findElementById(id);
			Select sel=new Select(drop);
			sel.selectByIndex(value);
			//System.out.println("The element with id "+id+" is selected as "+value);
			reportStep("The element with id "+id+" is selected as "+value, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with id "+id+" is not found in the DOM");
		reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application ");
			reportStep("The element with id "+id+" is not visible in the application ", "fail");
		}
			catch (ElementClickInterceptedException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with id "+id+" is not able to click");
				reportStep("The element with id "+id+" is not able to click", "fail");
		
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				
				//System.err.println("The dropdown with id "+id+" is disabled");
				reportStep("The dropdown with id "+id+" is disabled", "fail");
			}
		
		catch (WebDriverException e) {
				// TODO: handle exception
				
				//System.err.println("The element with id "+id+" is not selected due to unknown error");
				reportStep("The element with id "+id+" is not selected due to unknown error","fail");
		
		}	
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		
		try {
						
			Set<String> BeforeClick = driver.getWindowHandles();
						
			for(String eachId : BeforeClick) {
				
				driver.switchTo().window(eachId);
				break;
			}
		
			//System.out.println("Successfully switched to the parent window");
			reportStep("Successfully switched to the parent window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("No such window is available");
			reportStep("No such window is available", "fail");
		}catch(SessionNotCreatedException e) {
			//System.err.println("No such windowid is available");
			reportStep("No such windowid is available", "fail");
		}catch(WebDriverException e) {
			
			//System.err.println("Unable to switch to parentwindow due to unknown error");
			reportStep("Unable to switch to parentwindow due to unknown error", "fail");
		}
			
		}
	
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
		Set<String> BeforeClick = driver.getWindowHandles();
				
		for(String eachId : BeforeClick) {
			
			driver.switchTo().window(eachId);
		
		}
	
		//System.out.println("Successfully switched to the last window");
		reportStep("Successfully switched to the last window", "pass");
	} catch (NoSuchWindowException e) {
		// TODO Auto-generated catch block
		//System.err.println("No such window is available");
		reportStep("No such window is available", "fail");
	}
		catch(SessionNotCreatedException e) {
			//System.err.println("No such windowid is available");
			reportStep("No such windowid is available", "fail");
			}
			catch(WebDriverException e) {
		//System.err.println("Unable to switch to lastwindow due to unknown error");
		reportStep("Unable to switch to lastwindow due to unknown error", "fail");
	}	
		
			
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
		
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Alert accepted");
			reportStep("Alert accepted", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No such alert in the application");
			reportStep("No such alert in the application", "fail");
		}catch(WebDriverException e)
		{
			//System.err.println("Alert not found due to unknown error");
			reportStep("Alert not found due to unknown error", "fail");
		}
	
			
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Alert is dismissed");
			reportStep("Alert is dismissed", "pass");
		}  catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No such alert in the application");
			reportStep("No such alert in the application", "fail");
		}catch(WebDriverException e)
		{
			//System.err.println("Alert not found due to unknown error");
			reportStep("Alert not found due to unknown error", "fail");
		}
		
			
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String actualText=null;
		
		try {
			 actualText=driver.switchTo().alert().getText();
			//System.out.println("The text of the alert is "+actualText);
			reportStep("The text of the alert is "+actualText, "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("No alert present");
			reportStep("No alert present", "fail");
				
		} 	catch (WebDriverException e) {
				// TODO Auto-generated catch block
		//System.err.println("The text of the alert is not found due to unknown error");
		reportStep("The text of the alert is not found due to unknown error", "fail");
		
			}
				
		return actualText;
				
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number = 0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000l);
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./reports/screenshtos/"+number+".png");
			
			FileUtils.copyFile(tmp, dest);
			
			//System.out.println("The screenshot of the browser is taken");
			
			}
		
		catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The screenshot is not taken due to unknown error");
			reportStep("The screenshot is not taken due to unknown error", "fail", false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
		try {
			driver.close();
			//System.out.println("The active browser is closed");
			reportStep("The active browser is closed", "pass", false);
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "fail", false);
		}
				
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
		try {
			driver.quit();
			
			//System.out.println("All the browsers are closed");
			reportStep("All the browsers are closed", "pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Browsers are not closed due to unown error");
			reportStep("Browsers are not closed due to unown error", "fail", false);
		}
		
	}

	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectVisibleTextByXpath(String xpath, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement drop=driver.findElementByXPath(xpath);
			Select sel=new Select(drop);
			sel.selectByVisibleText(value);
			//System.out.println("The element with id "+xpath+" is selected with visible text "+value);
			reportStep("The element with id "+xpath+" is selected with visible text "+value, "pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		//System.err.println("The element with id "+xpath+" is not selected with visible text "+value);
		reportStep("The element with id "+xpath+" is not selected with visible text "+value, "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+xpath+" is not visible in the application ");
			reportStep("The element with id "+xpath+" is not visible in the application ", "fail");
		}
			catch (ElementClickInterceptedException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with id "+xpath+" is not able to click");
				reportStep("The element with id "+xpath+" is not able to click", "fail");
		
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				
				//System.err.println("The dropdown with id "+xpath+" is not able to select");
				reportStep("The dropdown with id "+xpath+" is not able to select", "fail");
			}
		
		catch (WebDriverException e) {
				// TODO: handle exception
				
				//System.err.println("The element with id "+xpath+" is not selected due to unknown error");
				reportStep("The element with id "+xpath+" is not selected due to unknown error", "fail");
		
		}
	}
	
		public void pageDown() {
			
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			
		}
		
}

		public void selectValueById(String id, int value) {
			// TODO Auto-generated method stub
			
			
			try {
				WebElement drop=driver.findElementById(id);
				Select sel=new Select(drop);
				sel.selectByIndex(value);
				//System.out.println("The element with id "+id+" is selected as "+value);
				reportStep("The element with id "+id+" is selected as "+value, "pass");
				
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not visible in the application ");
				reportStep("The element with id "+id+" is not visible in the application ", "fail");
			}
				catch (ElementClickInterceptedException e) {
					// TODO Auto-generated catch block
				//	System.err.println("The element with id "+id+" is not able to click");
					reportStep("The element with id "+id+" is not able to click", "fail");
			
				}catch (ElementNotSelectableException e) {
					// TODO: handle exception
					
					//System.err.println("The dropdown with id "+id+" is disabled");
					reportStep("The dropdown with id "+id+" is disabled", "fail");
				}
			
			catch (WebDriverException e) {
					// TODO: handle exception
					
					//System.err.println("The element with id "+id+" is not selected due to unknown error");
					reportStep("The element with id "+id+" is not selected due to unknown error", "fail");
			
			}
			
					
			
			
		}

		public void selectVisibileTextByName(String name, String value) {
			// TODO Auto-generated method stub
		
			
			try {
				WebElement drop=driver.findElementByName(name);
				Select sel=new Select(drop);
				sel.selectByVisibleText(value);
				//System.out.println("The element with id "+name+" is selected with visible text "+value);
				reportStep("The element with id "+name+" is selected with visible text "+value, "pass");
				
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
			//System.err.println("The element with id "+name+" is not selected with visible text "+value);
			reportStep("The element with id "+name+" is not selected with visible text "+value, "fail");
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+name+" is not visible in the application ");
				reportStep("The element with id "+name+" is not visible in the application ", "fail");
			}
				catch (ElementClickInterceptedException e) {
					// TODO Auto-generated catch block
				//	System.err.println("The element with id "+name+" is not able to click");
					reportStep("The element with id "+name+" is not able to click", "fail");
			
				}catch (ElementNotSelectableException e) {
					// TODO: handle exception
					
				//	System.err.println("The dropdown with id "+name+" is not able to select");
					reportStep("The dropdown with id "+name+" is not able to select", "fail");
				}
			
			catch (WebDriverException e) {
					// TODO: handle exception
					
				//	System.err.println("The element with id "+name+" is not selected due to unknown error");
					reportStep("The element with id "+name+" is not selected due to unknown error", "fail");
			
			}
					
		}

		
		public void switchToDefaultContent() {
			// TODO Auto-generated method stub
			
			try {
				
				driver.switchTo().defaultContent();
				//System.out.println("switched to main window");
				reportStep("switched to main window", "pass");
			}  catch(NoSuchWindowException e) {
				
				//System.err.println("Unable to find the window");
				reportStep("Unable to find the window", "fail");
			}catch(WebDriverException e)
			{
				//System.err.println("Not able to switch  due to unknown error");
				reportStep("Not able to switch  due to unknown error", "fail");
			}
			
				
		}
	
		

		public void switchToFrameByIndex(int index) {
			// TODO Auto-generated method stub
			
			try {
				driver.switchTo().frame(index);
				//System.out.println("Alert is switched to frame with value"+index);
				reportStep("Alert is switched to frame with value"+index, "pass",false);
			} catch (NoSuchFrameException e) {
				// TODO Auto-generated catch block
				//System.err.println("No such frame in the application");
				reportStep("No such frame in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("Alert not found due to unknown error");
				reportStep("Alert not found due to unknown error", "fail");
			}
		}
			
		public void frameByFrame() {
			// TODO Auto-generated method stub
		
			
			try {
				WebElement myframe=driver.findElementByXPath("//*[@id=\"iframeResult\"]");
				driver.switchTo().frame(myframe);
				//System.out.println("The element is switched to "+myframe);
				reportStep("The element is switched to "+myframe, "pass",false);
				
				} catch (NoSuchFrameException e) {
					// TODO Auto-generated catch block
					//System.err.println("No such frame in the application");
					reportStep("No such frame in the application", "fail");
				}catch(WebDriverException e)
				{
					//System.err.println("Alert not found due to unknown error");
					reportStep("Alert not found due to unknown error", "fail");
				}
				
					
		
			
		}

		public void verifyTextContainsByID(String id, String text) {
			// TODO Auto-generated method stub
			
			try {
				String actualText=driver.findElementById(id).getText();
				if(actualText.contains(text)) {
					//System.out.println("The element with id "+id+"  holding the text "+actualText+" is matched with expected text "+text);
					reportStep("The element with id "+id+"  holding the text "+actualText+" is matched with expected text "+text, "pass");
				}else
				{
					//System.out.println("The element with id "+id+" holding the text "+actualText+" is not matched with expected text "+text);
					reportStep("The element with id "+id+" holding the text "+actualText+" is not matched with expected text "+text, "fail");
				}
							
			} catch (NoSuchElementException e) {
				//System.err.println("The element with id "+id+" is not found in the DOM");
				reportStep("The element with id "+id+" is not found in the DOM", "fail");
					
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not visible in the application ");
				reportStep("The element with id "+id+" is not visible in the application ", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not interactable in the application ");
				reportStep("The element with id "+id+" is not interactable in the application ", "fail");
				
			}catch (StaleElementReferenceException e) {
					// TODO: handle exception
					//System.err.println("The element with id "+id+" is not stable in the application");
					reportStep("The element with id "+id+" is not stable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The locator with id "+id+" is not found due to unknown error in the application");
				reportStep("The locator with id "+id+" is not found due to unknown error in the application", "fail");
			}
			
			
		}

		public void refreshPages() {
			// TODO Auto-generated method stub
						
			try {
				driver.navigate().refresh();
				
				//System.out.println("The page is refreshed");
				reportStep("The page is refreshed", "pass");
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				//System.err.println("The page is not refreshed");
				reportStep("The page is not refreshed", "fail");
			}
			
			}

		public void enterAlertValuesNoSnap(String text) {
			// TODO Auto-generated method stub
			
			
			try {
				driver.switchTo().alert().sendKeys(text);
				//System.out.println("The element of the alert is entered with data "+text);
				reportStep("The element of the alert is entered with data "+text, "pass",false);
							
			} catch (NoAlertPresentException e) {
				// TODO Auto-generated catch block
				//System.err.println("No alert present");
				reportStep("No alert present", "fail");
			}catch (NoSuchElementException e) {
					// TODO Auto-generated catch block
					//System.err.println("The element of the alert is not found in the DOM");
					reportStep("The element of the alert is not found in the DOM", "fail");
				}catch (ElementNotVisibleException e) {
					// TODO: handle exception
					//System.err.println("The element of the alert is not visible in the application");
					reportStep("The element of the alert is not visible in the application", "fail");
				}catch (ElementNotInteractableException e) {
					// TODO: handle exception
					//System.err.println("The element  is not interactable in the application ");
					reportStep("The element  is not interactable in the application ", "fail");
				}catch (StaleElementReferenceException e) {
					// TODO: handle exception
					//System.err.println("The element  is not stable in the application");
					reportStep("The element  is not stable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				
				//System.err.println("Alert not found due to unknown error");
				reportStep("Alert not found due to unknown error", "fail");
			}
					
		}

		public void verifyTextNotContainsByID(String id, String text) {
			// TODO Auto-generated method stub
			
			
			try {
				String actualText=driver.findElementById(id).getText();
				if(!actualText.contains(text)) {
					//System.out.println("The element with id "+id+"  holding the text "+actualText+" is not matched with expected text "+text);
					reportStep("The element with id "+id+"  holding the text "+actualText+" is not matched with expected text "+text, "pass");
				}else
				{
					//System.out.println("The element with id "+id+" holding the text "+actualText+" is  matched with expected text "+text);
					reportStep("The element with id "+id+" holding the text "+actualText+" is  matched with expected text "+text, "fail");
				}
							
			} catch (NoSuchElementException e) {
				//System.err.println("The element with id "+id+" is not found in the DOM");
				reportStep("The element with id "+id+" is not found in the DOM", "fail");
					
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not visible in the application ");
				reportStep("The element with id "+id+" is not visible in the application ", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not interactable in the application ");
				reportStep("The element with id "+id+" is not interactable in the application ", "fail");
				
			}catch (StaleElementReferenceException e) {
					// TODO: handle exception
					//System.err.println("The element with id "+id+" is not stable in the application");
					reportStep("The element with id "+id+" is not stable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The locator with id "+id+" is not found due to unknown error in the application");
				reportStep("The locator with id "+id+" is not found due to unknown error in the application", "fail");
			}
			
			
		}

		public void compareTextByXpath(String xpath1, String xpath2) {
			// TODO Auto-generated method stub
			
			
			try {
				String actualText1=driver.findElementByXPath(xpath1).getText();
				String actualText2=driver.findElementByXPath(xpath2).getText();
				
				if(actualText2.equals(actualText1)) {
					//System.out.println("The element holding the text "+actualText2+" is matched with expected text "+actualText1);
					reportStep("The element holding the text "+actualText2+" is matched with expected text "+actualText1, "pass");
				}else
				{
					//System.out.println("The element holding the text "+actualText2+" is not matched with expected text "+actualText1);
					reportStep("The element holding the text "+actualText2+" is not matched with expected text "+actualText1, "fail");
				}
				
			}catch (NoSuchElementException e) {
				//System.err.println("The element is not found in the DOM");
				reportStep("The element is not found in the DOM", "fail");
					
			}catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element  is not visible in the application ");
				reportStep("The element  is not visible in the application ", "fail");
			}catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element  is not interactable in the application ");
				reportStep("The element  is not interactable in the application ", "fail");
			}catch (StaleElementReferenceException e) {
					// TODO: handle exception
				//System.err.println("The element is not stable in the application");
				reportStep("The element is not stable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element  is not found in the applocation due to unknown error");
				reportStep("The element  is not found in the application due to unknown error", "fail");
				}
			
				
			
			
		}

		public void enterAlertValues(String text) {
			// TODO Auto-generated method stub
			
		}
		}
		

		
