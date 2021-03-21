package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {
	
	WebDriver driver;
	Select selectBox; 
	By link_cart = By.xpath("/html/body/div[1]/div/div/div[1]/div[3]/a"); 
	
    public ProductsPage(WebDriver driver){
        this.driver=driver;
        selectBox = new Select(driver.findElement(By.className("product_sort_container")));
    }
	
	/*
	 * Name (A to A) 
	 * Name (Z to A) 
	 * Price (low to high) 
	 * Price (high to low)
	 */
	public void selectSorting(String sorting) {
		selectBox.selectByVisibleText(sorting);
	}
	
	public void accessProductPage(String productName) {
		By product_link = By.linkText(productName);
		driver.findElement(product_link).click();
	}
	
	public void addProductToTheCart(int index) {
		By button_addToCart = By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/div["+index+"]/div[3]/button");
		driver.findElement(button_addToCart).click();
	}
	
	public void accessCart() {
		driver.findElement(link_cart).click();	
	}

}
