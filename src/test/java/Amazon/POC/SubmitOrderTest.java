package Amazon.POC;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Amazon.TestComponents.BaseTest;
import Amazon.pageobjects.AddToCart;
import Amazon.pageobjects.CheckoutPage;
import Amazon.pageobjects.ConfirmationPage;
import Amazon.pageobjects.ProductCatalogue;
import Amazon.pageobjects.ZipCode;

public class SubmitOrderTest extends BaseTest {

	@Test
	public void addToCartWithoutLogin() throws IOException, InterruptedException {

		ProductCatalogue productcatalogue = new ProductCatalogue(driver);
		productcatalogue.ProductSelection();

		ZipCode zipcode = new ZipCode(driver);
		zipcode.zipUpdate("N4W", "2N6");
		String confirmzip = zipcode.zipcodeconfirmation();
		Assert.assertTrue(confirmzip.equalsIgnoreCase("Deliver to  N4W 2N‌"));

		AddToCart addtocart = new AddToCart(driver);
		addtocart.AddtoCart();
		String added = addtocart.ConfirmAdd();
		Assert.assertTrue(added.equalsIgnoreCase("Added to Cart"));
		//Assert.assertEquals(added, "Added to Cart");

		CheckoutPage checkout = new CheckoutPage(driver);
		checkout.checkout();

		ConfirmationPage confirmationpage = new ConfirmationPage(driver);
		String sign = confirmationpage.getSignInText();
		Assert.assertTrue(sign.equalsIgnoreCase("Sign in"));

	}


}
