package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CorpPassLogin extends Web_Driver {

	public void login(String nric, String name, String UEN, String role)
	{
		// set input variables to respective objects 
		driver.findElement(By.xpath("//input[@name='CPUID']")).clear();
		driver.findElement(By.xpath("//input[@name='CPUID']")).sendKeys(nric);
		driver.findElement(By.xpath("//input[@name='CPUID_FullName']")).clear();
		driver.findElement(By.xpath("//input[@name='CPUID_FullName']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='CPEntID']")).clear();
		driver.findElement(By.xpath("//input[@name='CPEntID']")).sendKeys(UEN);
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@name='CPRole']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(role);
		driver.findElement(By.xpath("//form[@action='/saml/acs']/button")).click();
	}
	
	public void pageWait()
	{
		//Wait for Page to be ready
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='base-container']")));
	}
	
	public void ValidateNRIC() {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid NRIC Not Checked");
	}

	public void ValidateName() {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid Name Not Checked");

	}

	public void ValidateEnv() {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid UEN Not Checked");
	}

	public void ValidateRole() {
		log.error("Test Case Number: " + GetTestCase());
		log.error("Invalid Role Not Checked");
	}
}
