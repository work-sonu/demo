package Academy_E2E_oldLectures;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingPage;
import resources.base;

public class validateNAVbar extends base {
	WebDriver driver;
	
	@Test
	public void titleverification() throws IOException {
		base base= new base();
		driver=base.initializeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/");
		
		landingPage lp= new landingPage(driver);
		
		
		
		
		Assert.assertTrue("displayed", lp.verifyNavBar().isDisplayed());
		
		
	
	}
	
}
