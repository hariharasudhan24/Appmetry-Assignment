package profilePack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePack.BaseUtilities;
import repoPack.LoginPage;
public class ProfilePhotoSetup extends BaseUtilities {
	
	public static WebDriver driver;

	public ProfilePhotoSetup(WebDriver driver) {
		super(driver);
	
		
	}

	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		ProfilePhotoSetup profileObj = new ProfilePhotoSetup(driver);
		PageFactory.initElements(driver, LoginPage.class );
		
		profileObj.browserSetUp("webdriver.chrome.driver", "C:\\Users\\HP\\git\\Appmetry-Assignment\\OnlineInterview\\chromedriver.exe");
		profileObj.urlLaunch("https://www.facebook.com/");
		profileObj.typeText(LoginPage.phoneNo, "7299518433" );
		profileObj.typeText(LoginPage.passWord, "Sudhan@24" );
		profileObj.moveTo(LoginPage.clickButton);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		profileObj.actionsClick(LoginPage.clickButton);
		profileObj.moveTo(LoginPage.userProfile);
		profileObj.actionsClick(LoginPage.userProfile);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		profileObj.moveTo(LoginPage.imageCircle);
		profileObj.actionsClick(LoginPage.imageCircle);
		
		profileObj.typeText(LoginPage.addPhoto, "C:\\Users\\HP\\git\\Appmetry-Assignment\\OnlineInterview\\src\\test\\resources\\minion-wallpaper.jpg");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		profileObj.dragAndMove(LoginPage.image, LoginPage.text);		
		
	}

}
