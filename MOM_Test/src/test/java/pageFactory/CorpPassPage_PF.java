package pageFactory;

import java.io.IOException;

import org.junit.Assert;
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

	public CorpPassPage_PF() throws IOException {
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
	
	public void clearNric() throws IOException {
		try {
			txtNRIC.clear();
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

	public void inputNric(String nric) throws IOException {
		try {
			txtNRIC.sendKeys(nric);
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

	public void clearName() throws IOException {
		try {
			txtName.clear();
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
			Assert.assertTrue(false);
		}
	}

	public void clearUen() throws IOException {
		try {
			txtUen.clear();
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

	public void inputUen(String uen) throws IOException {
		try{
			txtUen.sendKeys(uen);
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

	public void selectRole(String role) throws IOException
	{
		try {
			Select dropdown = new Select(lstboxRole);
			dropdown.selectByVisibleText(role);
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

	public void clickLogin() throws IOException
	{
		try {
			btnLogin.click();
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

	public void ValidateNRIC() throws InterruptedException, IOException {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid NRIC Not Implemented");
		Thread.sleep(1000L);
		TakeScreenShot(super.GetTestCase() + "_Validate_NRIC.png");
	}

	public void ValidateName() throws IOException, InterruptedException {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid Name Not Implemented");
		Thread.sleep(1000L);
		TakeScreenShot(super.GetTestCase() + "_Validate_Name.png");

	}

	public void ValidateEnv() throws IOException, InterruptedException {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid UEN Not Implemented");
		Thread.sleep(1000L);
		TakeScreenShot(super.GetTestCase() + "_Validate_Env.png");
	}

	public void ValidateRole() throws IOException, InterruptedException {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid Role Not Implemented");
		Thread.sleep(1000L);
		TakeScreenShot(super.GetTestCase() + "_Validate_Role.png");
	}
}
