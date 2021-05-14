package Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewGrant extends Web_Driver  {
/*	public void SelectSector(String sector)
	{
		// He Clicks on the Sector
		driver.findElement(By.xpath("//input[@id='" + sector + "']")).click();
	}

	public void SelectSector(String sector,String subSector)
	{
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


	public void SelectGrant(String grantName)
	{
		// He Clicks on the GrantName
		driver.findElement(By.xpath("//input[@id='" + grantName + "']")).click();
	}

	public void SelectDevelopmentArea(String grantUse)
	{
		List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='col-sm-12']"));
		for (WebElement webElement: webElements)
		{
			if (webElement.getText().contains(grantUse))
			{
				webElement.click();
				break;
			}
		}
	}

	public void SelectFunctionalArea(String purposeOfGrant)
	{
		List<WebElement> webElements = driver.findElements(By.xpath("//div[@class='col-sm-12']"));
		try {
			for (WebElement webElement: webElements)
			{
				if (webElement.getText().contains(purposeOfGrant))
				{
					// He clicks on the Purpose Of Grant
					webElement.click();
					// He clicks on Apply Button
					//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='bgp-btn bgp-btn-regular apply-submit']")));
					driver.findElement(By.xpath("//button[@class='bgp-btn bgp-btn-regular apply-submit']")).click();
					break;
				}
			}
		}
		catch(Exception e)
		{
			log.error("This is the Exception error: " + e.getMessage());
			log.error("This is the Exception cause: " + e.getCause());
			log.error(e.getStackTrace());
		}
	}

	public void pageWait()
	{
		//Wait for Page to be ready
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bgp-applyquestion-taxonomy col-sm-12']")));	
	}*/
}
