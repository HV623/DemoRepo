package sele4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImportantSele4JavaScriptEx {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://selectorshub.com/xpath-practice-page/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scroll(0,900)");
	Thread.sleep(2000);
	

	
	js.executeScript("document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\").value='fefef'");
	System.out.println("dsdvsvs");
	
	WebElement fra=driver.findElement(By.xpath("//iframe[@id='pact']"));
	driver.switchTo().frame(fra);
	System.out.println("jhbsdv");
	Thread.sleep(2000);
	js.executeScript("document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"div[id='app2']\").shadowRoot.querySelector(\"input[id='pizza']\").value='ddsds'");
	System.out.println("Sucess");
	driver.switchTo().defaultContent();
	
	
	
	driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
	Thread.sleep(9000);
	System.out.println("v");
	js.executeScript("window.scroll(0,1500");
	System.out.println("dcsdvsdvsdvdsvvd");
	Thread.sleep(2000);
	WebElement aaa=driver.findElement(By.xpath("//div[@id='userPass']"));
	Actions act= new Actions(driver);
	Thread.sleep(2000);
	System.out.println("say hello");
	act.sendKeys(Keys.TAB).build().perform();		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
