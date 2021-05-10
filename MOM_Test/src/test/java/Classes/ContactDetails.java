package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ContactDetails extends Web_Driver{
	public void pageWait()
	{
		//Wait for Page to be ready
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='react-contact_info-designation']")));	
	}

	public void InputDetails(String name, String jobTitle, String phone, String email) {
		//Input Name, Jobtitle, and email into the form
		driver.findElement(By.xpath("//input[@id='react-contact_info-name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='react-contact_info-designation']")).sendKeys(jobTitle);
		driver.findElement(By.xpath("//input[@id='react-contact_info-phone']")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@id='react-contact_info-primary_email']")).sendKeys(email);
	}

	public void SameMailingAddress_Click() {
		if (!driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-copied']")).isSelected())
		{
			driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-copied']")).click();
		}
	}

	public void SameContactPerson_Click() {
		if (!driver.findElement(By.xpath("//input[@id='react-contact_info-copied']")).isSelected())
		{
			driver.findElement(By.xpath("//input[@id='react-contact_info-copied']")).click();
		}
	}


	public void InputPostalCode(String postalCode) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-postal']")).sendKeys(postalCode);
		Thread.sleep(2000L);
	}

	public void VerifyPostalCode(String blkNumber, String streetName) {
		String pageBlkNumber= driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-block']")).getAttribute("value");
		String pageStreetName = driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-street']")).getAttribute("value");
		if (!blkNumber.toUpperCase().equals(pageBlkNumber) || !streetName.toUpperCase().equals(pageStreetName))
		{
			log.error("Test Case Number: " + GetTestCase());
			log.error("Expected blk number " + blkNumber + " \nPage blk number " + pageBlkNumber);
			log.error("Expected street name " + streetName + " \nPage Street Name " + pageStreetName);
		}
	}

	public void InputUnitLevelDetails(String block, String unitNumber, String buildingName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-level']")).sendKeys(block);
		driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-unit']")).sendKeys(unitNumber);
		driver.findElement(By.xpath("//input[@id='react-contact_info-correspondence_address-building_name']")).sendKeys(buildingName);
	}

	public void InputAddresseeInfo(String name, String jobTitle, String email) {
		driver.findElement(By.xpath("//input[@id='react-contact_info-offeree_name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='react-contact_info-offeree_designation']")).sendKeys(jobTitle);
		driver.findElement(By.xpath("//input[@id='react-contact_info-offeree_email']")).sendKeys(email);
	}

	public void Save_Click()	{
		driver.findElement(By.xpath("//button[@id='save-btn']")).click();
	}

	public void Next_Click() {
		driver.findElement(By.xpath("//button[@id='next-btn']")).click();
	}
}
