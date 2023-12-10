package Amazon.POC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Utility {
	WebDriver driver;

	public Utility(WebDriver driver) {
		this.driver = driver;
	}
	public void click(By element) {
		driver.findElement(element).click();
		
	}
	public void enterData(By element, String str) {
		driver.findElement(element).sendKeys(str);
		
	}
	public void hover(By element) {
		WebElement item = driver.findElement(element);
		Actions builder = new Actions(driver);
        Action mouseOverItem = builder
                .moveToElement(item)
                .build();
        
        mouseOverItem.perform();
		
	}
	

}
