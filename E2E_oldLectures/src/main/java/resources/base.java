package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class base {
	public WebDriver driver;
	@Test
		public WebDriver initializeDriver() throws IOException {
		this.driver= driver;
			
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream ("C:\\sonu94\\javaFiles\\eclipseWorkPlace-2024\\E2E_oldLectures\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");
			
			if (browserName.equals("chrome"))
			{
				 driver= new ChromeDriver();
			}
			else
				if (browserName.equals("edge"))
				{
					 driver= new EdgeDriver();
				}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://rahulshettyacademy.com/");
			return driver;
		}

	}


