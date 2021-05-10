package Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubmitYourProposal extends Web_Driver {
	 public void SelectActivity() throws InterruptedException{

		 Thread.sleep(2000L);
		 WebElement webElement = driver.findElement(By.xpath("//span[@id='react-select-project-activity--value']"));
		 webElement.click();
		 driver.findElement(By.xpath("//span[@id='react-select-project-activity--value']")).click();
		 WebElement currentItem = webElement.findElement(By.className("Select-input"));
		 System.out.println("Hello World 1" + currentItem.getText());
	 }
	
}
