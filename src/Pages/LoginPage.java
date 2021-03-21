package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By field_user = By.id("user-name"); 
	By field_password = By.id("password"); 
	By button_login = By.id("login-button"); 
	
    public LoginPage(WebDriver webdriver){
    	this.driver = webdriver;
    }
      
	public void inputUser(String user) {
		driver.findElement(field_user).sendKeys(user);
	}
	
	public void inputPassword(String password) { 
		driver.findElement(field_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(button_login).click();
	}
	
	public void doLogin(String user,String password) {
		inputUser(user);
		inputPassword(password);
		clickLogin();
	}
		
}
