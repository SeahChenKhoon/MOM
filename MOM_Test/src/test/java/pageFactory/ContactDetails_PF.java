package pageFactory;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Classes.Web_Driver;

public class ContactDetails_PF extends Web_Driver  {
	@FindBy(xpath="//label[@id='react-contact_info-name-label']")
	WebElement lblPage;

	@FindBy(xpath="//input[@id='react-contact_info-name']")
	WebElement txtName;

	@FindBy(xpath="//input[@id='react-contact_info-designation']")
	WebElement txtDesignation;

	@FindBy(xpath="//input[@id='react-contact_info-phone']")
	WebElement txtPhone;

	@FindBy(xpath="//input[@id='react-contact_info-primary_email']")
	WebElement txtEmail;

	@FindBy(xpath="//input[@id='react-contact_info-correspondence_address-copied']")
	WebElement chkMailingAddressSameRegisteredAddress;

	@FindBy(xpath="//input[@id='react-contact_info-copied']")
	WebElement chkLetterOfferAddresseeSameContactPerson;

	@FindBy(xpath="//input[@id='react-contact_info-correspondence_address-postal']")
	WebElement txtPostalCode;

	@FindBy(xpath="//input[@id='react-contact_info-correspondence_address-block']")
	WebElement txtBlkNumber;

	@FindBy(xpath="//input[@id='react-contact_info-correspondence_address-street']")
	WebElement txtStreetName;

	@FindBy(xpath="//input[@id='react-contact_info-correspondence_address-level']")
	WebElement txtLevel;

	@FindBy(xpath="//input[@id='react-contact_info-correspondence_address-unit']")
	WebElement txtUnit;

	@FindBy(xpath="//input[@id='react-contact_info-correspondence_address-building_name']")
	WebElement txtBuildingName;

	@FindBy(xpath="//input[@id='react-contact_info-name']")
	WebElement txtAddresseeName;

	@FindBy(xpath="//input[@id='react-contact_info-designation']")
	WebElement txtAddresseeDesignation;

	@FindBy(xpath="//input[@id='react-contact_info-primary_email']")
	WebElement txtAddresseeEmail;

	@FindBy(xpath="//button[@id='save-btn']")
	WebElement btnSave;

	@FindBy(xpath="//button[@id='next-btn']")
	WebElement btnNext;

	@FindBy(xpath="//button[@id='back-btn']")
	WebElement btnPrev;

	public ContactDetails_PF() {
		PageFactory.initElements(driver, this);
	}

	public void Save_Click()	{
		btnSave.click();
	}

	public void Next_Click() {
		btnNext.click();
	}

	public void Prev_Click() {
		btnPrev.click();
	}
	
	public void InputDetails(String name, String jobTitle, String phone, String email) throws IOException {
		try
		{
			//Input Name, Jobtitle, and email into the form
			txtName.sendKeys(name);
			txtDesignation.sendKeys(jobTitle);
			txtPhone.sendKeys(phone);
			txtEmail.sendKeys(email);
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

	public void SameMailingAddress_Click() throws IOException {
		try
		{		
			if (!chkMailingAddressSameRegisteredAddress.isSelected())

			{
				chkMailingAddressSameRegisteredAddress.click();
			}
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

	public void InputAddresseeInfo(String name, String jobTitle, String email) throws IOException {
		try {
			txtAddresseeName.sendKeys(name);
			txtAddresseeDesignation.sendKeys(jobTitle);
			txtAddresseeEmail.sendKeys(email);
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

	public void VerifyPostalCode(String blkNumber, String streetName) throws IOException {
		try
		{
			String pageBlkNumber= txtBlkNumber.getAttribute("value");
			String pageStreetName = txtStreetName.getAttribute("value");
			if (!blkNumber.toUpperCase().equals(pageBlkNumber) || !streetName.toUpperCase().equals(pageStreetName))
			{
				TakeScreenShot("InvalidPostalCode_" +  GetTestCase());
				log.error("Test Case Number: " + GetTestCase());
				log.error("Test Case Number: " + GetTestCase());
				log.error("Expected blk number " + blkNumber + " \nPage blk number " + pageBlkNumber);
				log.error("Expected street name " + streetName + " \nPage Street Name " + pageStreetName);
			}
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

	public void InputUnitLevelDetails(String level, String unitNumber, String buildingName) throws InterruptedException, IOException {
		try
		{
			txtLevel.sendKeys(level);
			txtUnit.sendKeys(unitNumber);
			txtBuildingName.sendKeys(buildingName);
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


	public void InputPostalCode(String postalCode) throws InterruptedException, IOException {
		try
		{
			txtPostalCode.sendKeys(postalCode);
			Thread.sleep(2000L);
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

	public void SameContactPerson_Click() throws IOException {
		try
		{
			if (!chkLetterOfferAddresseeSameContactPerson.isSelected())
			{
				chkLetterOfferAddresseeSameContactPerson.click();
			}
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
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
			Assert.assertTrue(false);		
			return false;
		}
	}


}
