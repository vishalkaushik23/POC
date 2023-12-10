package Amazon.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Amazon.pageobjects.First;

public class BaseTest {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Amazon\\resources\\GlobalData.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();		
		}
		else if (browsername.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		
	} 
	@BeforeSuite
	public void launchApplication() throws IOException {
		driver = initializeDriver();
		First landingpage = new First(driver);
		landingpage.GoTo();
		landingpage.SearchonAmazon("samsung galaxy s23");
	}
	@AfterSuite
	public void teardown() {
		//driver.close();
	}

}
