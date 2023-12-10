package Amazon.POC;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Amazon.TestComponents.BaseTest;
import Amazon.pageobjects.ObjectRepository;

public class ValidateWishList extends BaseTest {
	WebDriver driver;
	
	public ValidateWishList() throws IOException {
		this.driver = initializeDriver();
	}
	@Test
	public void validatingWishList() throws IOException, InterruptedException {
		super.launchApplication();
		ObjectRepository obj = new ObjectRepository(driver);
		Utility util = new Utility(driver);
		Thread.sleep(5000);
		util.click(obj.getSearchBar());
		util.enterData(obj.getSearchBar(), "wishlist");
		util.click(obj.getSubmitButton());
		util.click(obj.getWishListLink());
		//il.hover(obj.getAccountList());
	//til.click(obj.getWishList());
		String url = driver.getTitle();
		System.out.println(url);
		
	}


}
