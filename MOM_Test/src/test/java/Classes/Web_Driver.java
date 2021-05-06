package Classes;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefinitions.StepDefinition;

public class Web_Driver {
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Logger log = Logger.getLogger(StepDefinition.class);
	private static boolean root=false;
	@SuppressWarnings("deprecation")
	protected void initialiseDriver(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\seah\\eclipse\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		wait = new WebDriverWait(driver, 60);
		Logger log = getLogger(Logger.class);
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


}
