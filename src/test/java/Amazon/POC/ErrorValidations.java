package Amazon.POC;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon.TestComponents.BaseTest;
import Amazon.pageobjects.AddToCart;
import Amazon.pageobjects.CheckoutPage;
import Amazon.pageobjects.ConfirmationPage;
import Amazon.pageobjects.First;
import Amazon.pageobjects.ProductCatalogue;
import Amazon.pageobjects.ZipCode;

public class ErrorValidations extends BaseTest {

	
	@Test
	public void submitorder () throws IOException, InterruptedException{
		 
		ProductCatalogue productcatalogue = new ProductCatalogue(driver);
		productcatalogue.ProductSelection();
		driver.navigate().toString().equalsIgnoreCase("Create a Wish List");

		ZipCode zipcode = new ZipCode(driver);
		zipcode.zipUpdate("N4W", "2N6");

		AddToCart addtocart = new AddToCart(driver);
		addtocart.AddtoCart();

		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.checkout();

		ConfirmationPage confirmationpage = new ConfirmationPage(driver);
		String sign = confirmationpage.getSignInText();
		Assert.assertTrue(sign.equalsIgnoreCase("Sign in"));

	}

}
