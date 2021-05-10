package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Classes.Web_Driver;
import net.bytebuddy.implementation.bind.annotation.Super;

public class MyGrant_PF  extends Web_Driver  {
	@FindBy(xpath="//div[@class='main page-container']/div/div/h2")
	WebElement lblPage;
	
	@FindBy(xpath="//a[@id='dashboard-menubox-app-apply-grant']")
		WebElement  btnGetNewGrant;
	
	public MyGrant_PF ()
	{
		// Initialise Web Element of the Page 
		PageFactory.initElements(driver, this);
	}
	
	public void clickGetNewGrant() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , btnGetNewGrant);
	}
	
	public Boolean pageWait()
	{
		//Wait for Page Label to appear
		return super.pageWait(lblPage);
	}
	
	
}
