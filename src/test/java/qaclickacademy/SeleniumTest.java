package qaclickacademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest {

	WebDriver driver;

	@Test

	public void BrowserAutomation() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Talaneru\\Mavenjava\\data.properties");

		prop.load(fis);
		
		//String browserName=prop.getProperty("browser");
		
		String browserName=System.getProperty("browser");	

	if (browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver", "E:\\software\\chrome_driver\\chromedriver.exe");
			
			ChromeOptions options=new ChromeOptions();
			if(browserName.contains("headless")) {
			options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			
			
		} else if (browserName.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\software\\gecko_driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.get(prop.getProperty("url"));

		System.out.println("BrowserAutomation");
	}  
  

	@Test
	public void elementsUI() {
		System.out.println("elementsUI");

	}

	@Test
	public void webUI() {
		System.out.println("webUI");

	}

	@Test
	public void mobileUI() {
		System.out.println("mobUI");

	}
@Test 
public void helo(){
System.out.println("helo");

}
@Test 
public void helobalu(){
System.out.println("helobalu");

}