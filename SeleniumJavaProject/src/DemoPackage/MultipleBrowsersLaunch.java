package DemoPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\JavaSeleniumDownloads\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		System.setProperty("webdriver.gecko.driver", "C:\\JavaSeleniumDownloads\\BrowserDrivers\\geckodriver.exe");
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com/");
		
//		System.setProperty("webdriver.edge.driver", "C:\\JavaSeleniumDownloads\\BrowserDrivers\\msedgedriver.exe");
//		EdgeDriver driver = new EdgeDriver();
//		driver.get("https://www.google.com/");
		
		
	}

}
