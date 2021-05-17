package pageFactory;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Classes.Web_Driver;

public class SubmitProposal_PF  extends Web_Driver  {
	@FindBy(xpath="//div[@class='main']/div/h1")
	WebElement lblPage;
	
	
	@FindBy(xpath="//input[@id='react-project-title']")
	WebElement txtProjectTitle;

	@FindBy(xpath="//input[@id='react-project-start_date']")
	WebElement txtProjectStartDate;

	@FindBy(xpath="//input[@id='react-project-end_date']")
	WebElement txtProjectEndDate;

	
	public SubmitProposal_PF () {
		PageFactory.initElements(driver, this);
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
	
}
