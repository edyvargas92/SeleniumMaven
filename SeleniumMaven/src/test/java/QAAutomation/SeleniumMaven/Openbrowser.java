package QAAutomation.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Openbrowser {

	public static void main(String[] args) {
		WebDriver driver;
	   // String defaultTextSearchBox;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\luise\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.navit.com/en/home");
		driver.quit();
	}

}
