package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage {

	WebDriver driver;
	By field_firstName = By.id("first-name");
    By field_lastName = By.id("last-name");
    By field_postalCode = By.id("postal-code");
    By button_continue = By.xpath("/html/body/div[1]/div/div/div[3]/div/form/div[2]/input");
    
    public CheckoutYourInformationPage(WebDriver webdriver){
        this.driver=webdriver;
    }
    
    public void inputFirstName(String firstName) {
    	driver.findElement(field_firstName).sendKeys(firstName);
    }
    
    public void inputLastName(String lastName) {
    	driver.findElement(field_lastName).sendKeys(lastName);
    }
    
    public void inputPostalCode(String postalCode) {
    	driver.findElement(field_postalCode).sendKeys(postalCode);
    }
    
    public void clickContinue() {
    	driver.findElement(button_continue).click();
    }
    
    public void DoCheckout(String first, String last, String postal) {
    	inputFirstName(first);
    	inputLastName(last);
    	inputPostalCode(postal);
    	clickContinue();
    }
}
