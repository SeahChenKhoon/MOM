package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.sun.tools.sjavac.Log;

import Classes.Web_Driver;

public class LoginPage_PF extends Web_Driver {
	@FindBy(id="login-button")
	WebElement btnLogin;

	@FindBy(id="bgp-label")
	WebElement lblPage;

	public LoginPage_PF(String url)
	{
		try {
			// Initialise Driver 
			initialiseDriver(url);
			// Initialise Web Element of the Page 
			log.error("-------------------------------------- Start Of Test Case Number " + super.GetTestCase() + " --------------------------------------------");
			PageFactory.initElements(driver, this);
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}		
	}

	public LoginPage_PF()
	{
		return;
	}

	public void clickLogin()
	{
		try {
			//Click on Login Button
			btnLogin.click();
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}	
	}

	public void writeCaseID(String caseID)
	{
		try {
			//Write Test Case
			SetTestCase(caseID);
			log.info(caseID);
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}	
	}

	public  Boolean pageWait()
	{
		try
		{
			//Wait for Page Label to appear
			wait.until(ExpectedConditions.visibilityOf(lblPage)).getText();
			return true;
		}
		
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			return false;
		}
	}

	public void closeBrowser()
	{
		try {
			driver.close();
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}	
	}
}
