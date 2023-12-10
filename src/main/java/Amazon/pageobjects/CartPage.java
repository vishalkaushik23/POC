package Amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon.AbstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent{
	WebDriver driver;

	public CartPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "nav-cart")
	WebElement CartPage;
	
	public void cartpage() {
		CartPage.click();
	}

	}

