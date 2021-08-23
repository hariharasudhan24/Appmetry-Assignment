package repoPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage   {
	public static WebDriver driver;
	
	@FindBy(how=How.ID, using="email")
	public static WebElement phoneNo;
	
	@FindBy(how=How.ID, using="pass")
	public static WebElement passWord;
	
	
	@FindBy(how=How.XPATH, using="//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	public static WebElement clickButton;
	
	@FindBy(how=How.XPATH, using="//span[text()= 'Hariharasudhan']")
	public static WebElement userProfile;
	
	@FindBy(how=How.XPATH, using="//div[@class='spb7xbtv bkmhp75w emlxlaya s45kfl79 cwj9ozl2 kr520xx4 j9ispegn pmk7jnqg n7fi1qx3 rq0escxv i09qtzwb']")
	public static WebElement imageCircle;
	
	@FindBy(how=How.XPATH, using="//div[@class='rq0escxv l9j0dhe7 du4w35lb j83agx80 cbu4d94t g5gj957u d2edcug0 hpfvmrgz rj1gh0hx buofh1pr ph5uu5jm b3onmgus e5nlhep0 ecm0bbzt']/input[@accept='image/*,image/heif,image/heic']")
	public static WebElement addPhoto;//input[@accept='image/*,image/heif,image/heic']
	
	
	@FindBy(how=How.XPATH, using="//div[@aria-label='Upload Photo']")
	public static WebElement uploadPhoto;
	
	
	@FindBy(how=How.XPATH, using="//div[@class ='a7woen2v' and @style='transform: translate3d(0px, 0px, 0px) scale(0.25);']/img")
	public static WebElement image;
	
	@FindBy(how=How.XPATH, using="//span[text()='Update Profile Picture']")
	public static WebElement text;
		
		
	
	
	

}
