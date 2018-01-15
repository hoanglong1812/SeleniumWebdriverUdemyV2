package basicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "H:/Hoang Long/E-learning/SeleniumWebdriver/geckodriver-v0.19.1-win64/geckodriver.exe");
		
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
	}
}
