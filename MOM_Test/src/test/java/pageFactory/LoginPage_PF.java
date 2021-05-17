package pageFactory;

import java.io.IOException;

import org.junit.Assert;
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

	public LoginPage_PF(String url, String caseID) throws IOException
	{
		try {
			// Initialise Driver 
			initialiseDriver(url);
			writeCaseID(caseID);
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
			Assert.assertTrue(false);
		}		
	}

	public LoginPage_PF()
	{
		return;
	}

	public void clickLogin() throws IOException
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
			Assert.assertTrue(false);
		}	
	}

	public void writeCaseID(String caseID) throws IOException
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
			Assert.assertTrue(false);
		}	
	}

	public  Boolean pageWait() throws IOException
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
			Assert.assertTrue(false);
			return false;
		}
	}

	public void closeBrowser() throws IOException
	{
		try {
			driver.close();
		}
		catch (Exception e)
		{
			TakeScreenShot(super.GetTestCase() + ".png");
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			Assert.assertTrue(false);
		}	
	}
}
