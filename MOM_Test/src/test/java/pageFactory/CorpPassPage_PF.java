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
		// Initialise Web Element of the Page 
		PageFactory.initElements(driver, this);
	}
	
	public void pageWait()
	{
		//Wait for Page Label to appear
		super.pageWait(lblPage);
	}
	
	public void clearNric() {
		txtNRIC.clear();
	}
	
	public void inputNric(String nric) {
		txtNRIC.sendKeys(nric);
	}

	public void clearName() {
		txtName.clear();
	}
	
	public void inputName(String name) {
		txtName.sendKeys(name);
	}
	
	public void clearUen() {
		txtUen.clear();
	}
	
	public void inputUen(String uen) {
		txtUen.sendKeys(uen);
	}
	
	public void selectRole(String role)
	{
		Select dropdown = new Select(lstboxRole);
		dropdown.selectByVisibleText(role);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
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
