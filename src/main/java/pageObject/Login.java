package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	WebDriver driver;
	@FindBy(xpath="//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=account/login\"][1]")
	WebElement login;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@value=\"Login\"]")
	WebElement loginButton;
	@FindBy(xpath="//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=common/home\"]")
	WebElement home;
	@FindBy(xpath="//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=product/product&product_id=56\"][1]")
    WebElement product;
	
	
	public void login() {
		login.click();
		email.sendKeys("sanup@gmail.com");
		password.sendKeys("abcd");
		loginButton.click();
	}
	
	public String validateLogin() {
		String title=driver.getTitle();
		return title;
	}
	
	public void gotoHome() {
		home.click();
	}
	
	
	public String validateHome() {
		
		String title=driver.getTitle();
		return title;
	}
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
