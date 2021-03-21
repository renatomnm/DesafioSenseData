package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
	WebDriver driver;
	By button_finish = By.linkText("FINISH"); 
	
    public CheckoutOverviewPage(WebDriver webdriver){
        this.driver=webdriver;
    }
    
    public void clickFinish() {
    	driver.findElement(button_finish).click();
    }

	public WebElement verifyProductInOverview(String productName) {
		return driver.findElement(By.linkText(productName));
	}

}
