package basePack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;




public class BaseUtilities {
	public static WebDriver driver1;
	public Actions act;
	public BaseUtilities(WebDriver driver) {
	driver1 = driver;
	}
	
	

	public void browserSetUp(String browserName, String path) {
		
		if(browserName.equalsIgnoreCase("webdriver.chrome.driver"))
		{
			System.setProperty("webdriver.chrome.driver", path);
		driver1.manage().window().maximize();
		}
		else
			System.out.println("invalid browser Name");
		
	}
	
	public void urlLaunch(String url) {
		driver1.get(url);
		}
	
	public void dragAndDrop(WebElement source, WebElement target) {
		act = new Actions(driver1);
		act.dragAndDrop(source, target).perform();
		
	}
	public void actionsClick(WebElement target) {
		act = new Actions(driver1);
		act.click().perform();
		
	}
	public void moveTo(WebElement target) {
		act = new Actions(driver1);
		act.moveToElement(target).perform();
		
	}
	public String typeText(WebElement element,String value) {
		element.sendKeys(value);
		return value;
	}
	public void dragAndMove(WebElement source, WebElement target ) {
		act = new Actions(driver1);
		act.dragAndDrop(source,target).perform();
		
		
	}
	
	
	
	
	
	
}
