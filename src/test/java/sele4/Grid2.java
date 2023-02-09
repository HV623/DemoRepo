package sele4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grid2 {
	WebDriver driver;
	DesiredCapabilities dc=new DesiredCapabilities();
		@BeforeMethod
		public void bef() throws Throwable {
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver(new URL("http://192.168.29.79:4444"),dc);
		}
		@Test(priority=1)
		public void te() {
			driver.get("https://www.facebook.com/");
		}
		
		@Test(priority=2)
		public void te1() {
			driver.get("https://www.facebook.com/");
			System.out.println("sdcsdcvsd");
		}
		
	}


