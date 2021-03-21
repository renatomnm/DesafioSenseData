package Run;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CartPage;
import Pages.CheckoutOverviewPage;
import Pages.CheckoutYourInformationPage;
import Pages.FinishPage;
import Pages.LoginPage;
import Pages.ProductsPage;

public class RunTest {
	
	WebDriver driver;
	String driverPath = "C:\\chromedriver_win32\\chromedriver.exe";
	
	@Before
    public void setup() {
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
    }
	
	@Test
	public void run(){
		//Login Page
		LoginPage loginpage = new LoginPage(driver);
		loginpage.doLogin("standard_user","secret_sauce");
				
		//Products Page
    	ProductsPage productspage = new ProductsPage(driver);
    	productspage.selectSorting("Price (low to high)");
    	productspage.addProductToTheCart(1);
    	productspage.addProductToTheCart(4);
    	productspage.accessCart();
    	
    	//Cart Page
    	CartPage cartpage = new CartPage(driver);
    	assertNotNull(cartpage.ItemInCart("Sauce Labs Onesie"));
    	assertNotNull(cartpage.ItemInCart("Test.allTheThings() T-Shirt (Red)"));
    	cartpage.clickCheckout();

    	//Checkout Your Information Page
    	CheckoutYourInformationPage yourinfopage = new CheckoutYourInformationPage(driver);
    	yourinfopage.DoCheckout("Renato","Minami","012345-098");
    	
    	//Checkout Overview
    	CheckoutOverviewPage overviewpage = new CheckoutOverviewPage(driver);
    	assertNotNull(overviewpage.verifyProductInOverview("Sauce Labs Onesie"));
    	assertNotNull(overviewpage.verifyProductInOverview("Test.allTheThings() T-Shirt (Red)"));
    	overviewpage.clickFinish();
    	
    	//Finish Page
    	FinishPage finishpage = new FinishPage(driver);
    	assertEquals("THANK YOU FOR YOUR ORDER",finishpage.getLabelText());
    	assertEquals("https://www.saucedemo.com/checkout-complete.html",driver.getCurrentUrl());
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
