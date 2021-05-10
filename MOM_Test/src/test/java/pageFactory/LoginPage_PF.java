package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Classes.Web_Driver;

public class LoginPage_PF extends Web_Driver {
	@FindBy(id="login-button")
		WebElement btnLogin;
	
	@FindBy(id="bgp-label")
		WebElement lblPage;
	
	public LoginPage_PF(String url)
	{
		// Initialise Driver 
		initialiseDriver(url);
		// Initialise Web Element of the Page 
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage_PF()
	{
		return;
	}
	
	public void clickLogin()
	{
		//Click on Login Button
		btnLogin.click();
	}
	
	public void writeCaseID(String caseID)
	{
		//Write Test Case
		SetTestCase(caseID);
	}
	
	public void waitPage()
	{
		//Wait for Page Label to appear
		super.pageWait(lblPage);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
}
