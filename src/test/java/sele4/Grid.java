package sele4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grid {
	
	public WebDriver driver;
	
public	DesiredCapabilities dc=new DesiredCapabilities();

	
	@BeforeMethod
	public void be() throws Throwable {
		driver=new RemoteWebDriver(new URL("http://192.168.29.79:4444"),dc);
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10);
	}
@Test
public void hi() throws Throwable {
	driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.6.0");
	Thread.sleep(2000);
}
}
