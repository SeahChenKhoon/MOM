package pageFactory;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Classes.Web_Driver;
import net.bytebuddy.implementation.bind.annotation.Super;

public class MyGrant_PF  extends Web_Driver  {
	@FindBy(xpath="//div[@class='dashboard-container']/div/h2")
	WebElement lblPage;

	@FindBy(xpath="//a[@id='dashboard-menubox-app-apply-grant']")
	WebElement  btnGetNewGrant;

	public MyGrant_PF () throws IOException
	{
		try
		{
			// Initialise Web Element of the Page 
			PageFactory.initElements(driver, this);
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

	public void clickGetNewGrant() throws IOException {
		try
		{
			((JavascriptExecutor)driver).executeScript("arguments[0].click();" , btnGetNewGrant);
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
			TakeScreenShot(super.GetTestCase() + ".png");
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			Assert.assertTrue(false);
			return false;
		}
	}
}
