package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	WebDriver driver;
	By Email = By.id("email");
	By password = By.id("password");
	By loginButton = By.xpath("//input[@name='commit']");
	
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		
	}

	public WebElement getEmail() {
		
		return driver.findElement(Email);
		
	}
public WebElement getPassword() {
		
		return driver.findElement(password);
		
	}
public WebElement clickLogin() {
	
	return driver.findElement(loginButton);
	
}
}
