package Classes;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ReadConfig;



public class Web_Driver  {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Logger log = Logger.getLogger("Hello World");
	private static String testCaseNumber;
	
	private static boolean root=false;
	@SuppressWarnings("deprecation")
	protected void initialiseDriver(String url)
	{
		ReadConfig readConfig = new ReadConfig();
		System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		wait = new WebDriverWait(driver, 30);
		log = getLogger(Logger.class);

	}
	

	public static void SetTestCase(String testCase)
	{
		testCaseNumber = testCase;
	}
	
	public static String GetTestCase()
	{
		return testCaseNumber;
	}

	
	public static Logger getLogger (Class cls)
	{
		if (root) {
			return Logger.getLogger(cls);
		}
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return Logger.getLogger(cls);
	}

	public static void TakeScreenShot (String filename) throws IOException
	{
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen_" + filename + ".png"));
		
	}
}
