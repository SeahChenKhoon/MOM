package pageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Classes.Web_Driver;

public class NewGrant_PF extends Web_Driver {
	@FindBy(xpath="//div[@class='bgp-applyquestion-taxonomy col-sm-12']")
	WebElement lblPage;

	@FindBys(@FindBy(xpath="//div[@class='col-sm-12']"))
	List<WebElement> btnGrantInfo;

	@FindBy(xpath="//button[@class='bgp-btn bgp-btn-regular apply-submit']")
	WebElement btnNext;

	public NewGrant_PF() {
		try
		{
			// Initialise Web Element of the Page 
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
	public void SelectSector(String sector)
	{
		try {
			// He Clicks on the Sector
			driver.findElement(By.xpath("//input[@id='" + sector + "']")).click();
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void SelectSector(String sector,String subSector)
	{
		try {
			// He Clicks on the Sector
			driver.findElement(By.xpath("//input[@id='" + sector + "']")).click();
			if (!subSector.equals(""))
			{
				List<WebElement> webElements = driver.findElements(By.xpath("//input[@id='" + sector + "']/parent::label//parent::div/div/ul/li"));
				for (WebElement webElement: webElements)
				{
					webElement.findElement(By.xpath("//input[@id='" + subSector + "']")).click();
					break;
				}
			}
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void SelectGrant(String grantName)
	{
		try {

			// He Clicks on the GrantName
			driver.findElement(By.xpath("//input[@id='" + grantName + "']")).click();
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void SelectDevelopmentArea(String grantUse)
	{
		try {
			for (WebElement webElement: btnGrantInfo)
			{
				if (webElement.getText().contains(grantUse))
				{
					webElement.click();
					break;
				}
			}
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}
	public void SelectFunctionalArea(String purposeOfGrant)
	{
		try {	
			for (WebElement webElement: btnGrantInfo)
			{
				if (webElement.getText().contains(purposeOfGrant))
				{
					webElement.click();
					btnNext.click();
					break;
				}
			}		
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
