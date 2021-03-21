package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	WebDriver driver;
	By button_checkout = By.linkText("CHECKOUT"); 
    
	public CartPage(WebDriver driver){
        this.driver=driver;
    }
	
	public void clickCheckout() {
		driver.findElement(button_checkout).click();
	}
	
	public WebElement ItemInCart(String product) {
		 return driver.findElement(By.linkText(product));
	}
}
