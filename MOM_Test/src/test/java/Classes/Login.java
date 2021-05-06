package Classes;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinitions.LoggerHelp;

public class Login extends Web_Driver {
	public Login(String url)
	{
		initialiseDriver(url);
	}

	public Login()
	{
		return;
	}

	public void login_clicked (String TestCase)
	{
	    //Click on Login Button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='js-app']/div/div[2]/div/div/div[3]/div[3]/a/div/div")));
		log.debug("Test Case: " + TestCase);
		if(!driver.findElements(By.xpath("//div[@id='js-app']/div/div[2]/div/div/div[3]/div[3]/a/div/div")).isEmpty())
			driver.findElement(By.xpath("//div[@id='js-app']/div/div[2]/div/div/div[3]/div[3]/a/div/div")).click();
		else 
			log.error("Log in Button Element not Found!"); 
	}

	public void  CloseBroswer()
	{
		driver.close();
	}
}
