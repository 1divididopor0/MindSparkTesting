package dd_core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import dd_util.ExcelReader;
import dd_util.TestConfig;
import dd_util.monitoringMail;

public class testCore {

	
	/* 1. Initializes Properties
	 * Loads Excel Sheets
	 * Creates DB connection
	 * Generates logs
	 * Initializes Webdriver
	 */
	
	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static ExcelReader excel = null;
	public static WebDriver driver = null;
	
	
	@BeforeSuite
	public static void init() throws IOException {
		
		if(driver == null) {
			
			//loading config property file
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\dd_properties\\config.properties");
			config.load(fis);
			
			//loading object property file
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\dd_properties\\object.properties");
			object.load(fis);
			
			//loading excel file
			excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\dd_properties\\testdata.xlsx");
		
			
			if(config.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
				
			}else if(config.getProperty("browser").equals("ie")){
					System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
					driver = new InternetExplorerDriver();
						
			}else if(config.getProperty("browser").equals("chrome")){
					System.setProperty("webdriver.ie.driver", "geckodriver.exe");
					driver = new ChromeDriver();			
			}
			
			
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			
				
		}
	}
	
	
	@AfterSuite
	public static void QuitDriver() throws AddressException, MessagingException {
		driver.quit();
		monitoringMail mail = new monitoringMail();
		mail.sendMail(TestConfig.server,TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
	}
	
}
