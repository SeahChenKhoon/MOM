package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MyGrant  extends Web_Driver  {

	public void ClickGetNewGrant()
	{
	    // He clicks on "Get New Grant"
		By xpath = By.xpath("//a[@id='dashboard-menubox-app-apply-grant']");
		WebElement element = driver.findElement(xpath);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();" , element);
		}
	
	public void pageWait()
	{
		//Wait for Page to be ready
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='dashboard-menubox-app-apply-grant']")));		
	}
}
