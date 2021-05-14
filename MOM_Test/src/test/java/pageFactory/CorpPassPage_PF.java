package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import Classes.Web_Driver;

public class CorpPassPage_PF extends Web_Driver  {
	@FindBy(xpath="//div[@class='base-container']/h1")
	WebElement lblPage;

	@FindBy(name="CPUID")
	WebElement txtNRIC;

	@FindBy(name="CPUID_FullName")
	WebElement txtName;

	@FindBy(name="CPEntID")
	WebElement txtUen;

	@FindBy(name="CPRole")
	WebElement lstboxRole;

	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;

	public CorpPassPage_PF() {
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
	
	public void clearNric() {
		try {
			txtNRIC.clear();
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void inputNric(String nric) {
		try {
			txtNRIC.sendKeys(nric);
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void clearName() {
		try {
			txtName.clear();
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void inputName(String name) {
		try {
			txtName.sendKeys(name);
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void clearUen() {
		try {
			txtUen.clear();
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void inputUen(String uen) {
		try{
			txtUen.sendKeys(uen);
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void selectRole(String role)
	{
		try {
			Select dropdown = new Select(lstboxRole);
			dropdown.selectByVisibleText(role);
		}
		catch (Exception e)
		{
			log.error("Test Case Number: " + super.GetTestCase());
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void clickLogin()
	{
		try {
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

	public void ValidateNRIC() {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid NRIC Not Implemented");
	}

	public void ValidateName() {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid Name Not Implemented");

	}

	public void ValidateEnv() {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid UEN Not Implemented");
	}

	public void ValidateRole() {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid Role Not Implemented");
	}
}
