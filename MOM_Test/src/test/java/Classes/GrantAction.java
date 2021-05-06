package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GrantAction extends Web_Driver {
	public void pageWait() throws InterruptedException
	{
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='keyPage-form-button']")));		
		}
		catch(Exception e)
		{
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}
	
	public void Proceed_Clicked() throws InterruptedException
	{
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//button[@id='keyPage-form-button']")).click();
	}
}
