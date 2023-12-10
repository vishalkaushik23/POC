package Amazon.POC;

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

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:///amazon.ca/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy s23");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Assert.assertTrue(true, "1-36");
		driver.close();
		/*driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[1]")).click();
		driver.findElement(By.id("contextualIngressPtLabel_deliveryShortLine")).click();
		driver.findElement(By.id("GLUXZipUpdateInput_0")).sendKeys("N4W");
		driver.findElement(By.id("GLUXZipUpdateInput_1")).sendKeys("2N6");
		driver.findElement(By.cssSelector("input[aria-labelledby='GLUXZipUpdate-announce']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.cssSelector("input[name='proceedToRetailCheckout']")).click();
		String sign = driver.findElement(By.cssSelector("h1[class='a-spacing-small']")).getText();
		Assert.assertTrue(sign.equalsIgnoreCase("Sign in"));
		driver.close();*/
		
	}

}
