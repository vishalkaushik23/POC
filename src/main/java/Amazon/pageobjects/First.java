package Amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon.AbstractComponents.AbstractComponent;

public class First extends AbstractComponent {
	WebDriver driver;

	public First(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement Search;

	@FindBy(id = "nav-search-submit-button")
	WebElement Submit;
	
	@FindBy (css= "div[class='a-section a-spacing-small a-spacing-top-small']")
	WebElement resultdisplay;
	
	public void SearchonAmazon(String search) {
		Search.sendKeys(search);
		Submit.click();
	}
	public void GoTo() {
		driver.get("https:///amazon.ca/");
	}
	public String totalproducts() {
		return resultdisplay.getText();
		
	}
}
