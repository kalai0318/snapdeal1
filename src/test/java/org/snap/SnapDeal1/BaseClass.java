package org.snap.SnapDeal1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
static WebDriver driver;
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\sai project\\SnapDeal1\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void winMax() {
		driver.manage().window().maximize();

	}
	
	public static void loadUrl(String url) {
		driver.get(url);
    }
	
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);

	}
	public static void btnclick(WebElement e) {
		e.click();
		

	}
	public static void goback() {
		
		String childwind = driver.getWindowHandle();
		System.out.println(childwind);
	Set<String> allwind = driver.getWindowHandles();
	System.out.println(allwind);
	for(String x: allwind)
	{
		if(!childwind.equals(x)) {
			driver.switchTo().window(x);
		}
		
	}

	}
	
	
	public static void mover(WebElement m) {
		Actions a = new  Actions(driver);
		a.moveToElement(m).perform();
		

	}

}
