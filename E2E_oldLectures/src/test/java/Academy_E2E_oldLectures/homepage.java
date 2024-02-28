package Academy_E2E_oldLectures;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class homepage extends base {
	@Test(dataProvider="getdata")
	
	public void basePageNavigation(String username, String Password) throws IOException {  
		
		driver=initializeDriver();
		driver.get("https://rahulshettyacademy.com/");
		
		landingPage lp = new landingPage(driver);
		lp.getLogin().click();
		loginPage loginPage = new loginPage(driver);
		loginPage.getEmail().sendKeys(username);
		loginPage.getPassword().sendKeys(Password);
		loginPage.clickLogin().click();
				
	}
	
@DataProvider
public  Object[][] getdata()
{
	
	Object [][] data = new Object [2][2];
	
	data [0][0]= "lala@gmai.com";
	data [0][1]= "78910";
	//2st data
	data [1][0]= "2nd_lala@gmai.com";
	data [1][1]= "2nd_78910"; 
	
	return data;
	}	
	
}
