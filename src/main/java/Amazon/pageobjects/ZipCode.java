package Amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Amazon.AbstractComponents.AbstractComponent;

public class ZipCode extends AbstractComponent {
	WebDriver driver;

	public ZipCode(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "contextualIngressPtLabel_deliveryShortLine")
	WebElement DeliveryZip;

	@FindBy(id = "GLUXZipUpdateInput_0")
	WebElement ZipFirst;

	@FindBy(id = "GLUXZipUpdateInput_1")
	WebElement ZipLast;

	@FindBy(css = "input[aria-labelledby='GLUXZipUpdate-announce']")
	WebElement UpdateZip;
	
	@FindBy(id = "contextualIngressPt")
	WebElement ConfirmZip;

	public void zipUpdate(String first, String last) throws InterruptedException {
		DeliveryZip.click();
		ZipFirst.sendKeys(first);
		ZipLast.sendKeys(last);
		UpdateZip.click();
		Thread.sleep(2000);
		
	}
	public String zipcodeconfirmation() {
		return ConfirmZip.getText();
		
	}

}
