package Academy_E2E_oldLectures;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingPage;
import resources.base;

public class validateTitle extends base {
	WebDriver driver;
	
	/*public  validateTitle(WebDriver driver) {
		this.driver=driver;	
	}
	*/
	
	@Test
	public void titleverification() throws IOException {
		base base= new base();
		driver=base.initializeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/");
		
		landingPage lp= new landingPage(driver);
		lp.verifyTitle();
		
		
		Assert.assertEquals(lp.verifyTitle().getText(),"An Academy to Learn Earn & Shine  in your QA Career" );
		System.out.println("passed");
		Assert.assertTrue(false);
		
	}
	
}
