import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prabuddha Bajrachary\\Desktop\\Automation Training\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();	
	
			driver.get("http://gmail.com");

			// screenshot

			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(srcFile, new File("c:\\screenshot\\gmail.jpg"));

			try {
				driver.findElement(By.xpath("//*[@id='identifieId']"));
			}catch(Throwable t){
				FileUtils.copyFile(srcFile, new File("c:\\screenshot\\erroescreen.jpg"));
			}
			
			
}
}
