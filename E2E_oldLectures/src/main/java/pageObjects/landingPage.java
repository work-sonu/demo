package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	WebDriver driver;
	By SingIn = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("//div[@class='container-fluid']//h2//span[1]");
	By nabBar= By.xpath("//div[@class='nav-outer clearfix555']");
	public landingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getLogin() {
		
		return driver.findElement(SingIn);
		
	}
public WebElement verifyTitle() {
		
		return driver.findElement(title);
		
	}
public WebElement verifyNavBar() {
	
	return driver.findElement(title);
	
}
}
