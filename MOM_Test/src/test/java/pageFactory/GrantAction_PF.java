package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Classes.Web_Driver;

public class GrantAction_PF extends Web_Driver  {
	@FindBy(xpath="//button[@id='keyPage-form-button']")
	WebElement lblPage;

	@FindBy(xpath="//button[@id='keyPage-form-button']")
	WebElement btnProceed;

	public GrantAction_PF() {
		try
		{
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
	
	public  Boolean pageWait()
	{
		try
		{
			//Wait for Page Label to appear
			wait.until(ExpectedConditions.visibilityOf(btnProceed)).getText();
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

	public void Proceed_Clicked() throws InterruptedException
	{
		try {
			System.out.println("Hello World " + lblPage.getText());
			btnProceed.click();
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
