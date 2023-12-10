package Amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon.AbstractComponents.AbstractComponent;

public class AddToCart extends AbstractComponent{
	WebDriver driver;

	public AddToCart(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "add-to-cart-button")
	WebElement AddtoCart;
	
	@FindBy(xpath="//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']")
	WebElement confirmadd;
	
	public void AddtoCart() {
		AddtoCart.click();
	}
	public String ConfirmAdd() {
		return confirmadd.getText();
		
	}

	}

