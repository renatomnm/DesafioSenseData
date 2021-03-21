package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {

	WebDriver driver;
	WebElement label_thanks;
	
    public FinishPage(WebDriver driver){
        this.driver=driver;
        label_thanks = driver.findElement(By.className("complete-header"));
    }
    	
    public String getLabelText() {
    	return label_thanks.getText();
    }
    
	public String pageTitle(){
		return driver.getTitle();
	}
}
