package pageFactory;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Classes.Web_Driver;

public class CheckEligibility_PF extends Web_Driver  {

	@FindBy(xpath="//div[@class='main']/div/div/h2")
	WebElement lblPage;

	@FindBy(xpath="//input[@id='react-eligibility-sg_registered_check-true']/parent::label/span")
	WebElement rdbSgRegisteredTrue;
	@FindBy(xpath="//input[@id='react-eligibility-sg_registered_check-false']/parent::label/span")
	WebElement rdbSgRegisteredFalse;
	@FindBy(xpath="//input[@id='react-eligibility-local_equity_check-true']/parent::label/span")
	WebElement rdbLocalEquityTrue;
	@FindBy(xpath="//input[@id='react-eligibility-local_equity_check-false']/parent::label/span")
	WebElement rdbLocalEquityFalse;
	@FindBy(xpath="//input[@id='react-eligibility-turnover_check-true']/parent::label/span")
	WebElement rdbTurnoverTrue;
	@FindBy(xpath="//input[@id='react-eligibility-turnover_check-false']/parent::label/span")
	WebElement rdbTurnoverFalse;
	@FindBy(xpath="//input[@id='react-eligibility-started_project_check-true']/parent::label/span")
	WebElement rdbStartedProjectTrue;
	@FindBy(xpath="//input[@id='react-eligibility-started_project_check-false']/parent::label/span")
	WebElement rdbStartedProjectFalse;
	@FindBy(xpath="//button[@id='next-btn']")
	WebElement btnNext;
	@FindBy(xpath="//button[@id='save-btn']")
	WebElement btnSave;

	public CheckEligibility_PF () throws IOException
	{		
		try
		{
			PageFactory.initElements(driver, this);
		}
		catch (Exception e)
		{
			TakeScreenShot(super.GetTestCase() + ".png");
			log.error("Test Case Number: " + super.GetTestCase());			
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
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
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			Assert.assertTrue(false);
			return false;
		}
	}

	public Boolean ClickYesForAllOptions() throws IOException
	{
		try
		{
			rdbSgRegisteredTrue.click();
			rdbLocalEquityTrue.click();
			rdbTurnoverTrue.click();
			rdbStartedProjectTrue.click();
			return true;
		}
		catch (Exception e)
		{
			TakeScreenShot(super.GetTestCase() + ".png");
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			Assert.assertTrue(false);
			return false;
		}
	}

	public Boolean ClickNoForAllOptions() throws IOException
	{
		try {
			rdbSgRegisteredFalse.click();
			rdbLocalEquityFalse.click();
			rdbTurnoverFalse.click();
			rdbStartedProjectFalse.click();
			return true;
		}
		catch (Exception e)
		{
			TakeScreenShot(super.GetTestCase() + ".png");
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			Assert.assertTrue(false);			
			return false;
		}
	}

	public Boolean Next_Click() throws IOException
	{
		try
		{
			btnNext.click();
			return true;
		}
		catch (Exception e)
		{
			TakeScreenShot(super.GetTestCase() + ".png");
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			Assert.assertTrue(false);			
			return false;
		}
	}


	public Boolean Save_Click() throws IOException
	{
		try
		{

			btnSave.click();
			return true;
		}
		catch (Exception e)
		{
			TakeScreenShot(super.GetTestCase() + ".png");
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			Assert.assertTrue(false);
			return false;
		}
	}
}