package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=account/register\"]")
	WebElement Register;
	@FindBy(name="firstname")
	WebElement firstname;
	@FindBy(name="lastname")
	WebElement lastname;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="telephone")
	WebElement telephone;
	@FindBy(name="fax")
	WebElement fax;
	
	@FindBy(name="company")
	WebElement company;
	@FindBy(name="address_1")
	WebElement address_1;
	@FindBy(name="address_2")
	WebElement address_2;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="postcode")
	WebElement postcode;
	@FindBy(name="country_id")
	WebElement country_id;
	@FindBy(name="zone_id")
	WebElement zone_id;
	
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirm")
	WebElement confirm;
	
	@FindBy(name="newsletter")
	WebElement newsletter;
	
	@FindBy(name="agree")
	WebElement agree;
	
	
	@FindBy(xpath="//input[@value=\"Continue\"]")
	WebElement continue_button;
	
	@FindBy(xpath="//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=account/login\"]")
	WebElement login;
	
	@FindBy(xpath="//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=account/logout\"]")
	
	WebElement logout;
	
	public void register() throws InterruptedException {
		Register.click();
		System.out.println("Registrtion page url: "+driver.getCurrentUrl());
		
		firstname.sendKeys("Anjana");
		lastname.sendKeys("S");
		email.sendKeys("anjanapv.ss@gmail.com");
		telephone.sendKeys("+91 9987528526");
		fax.sendKeys("232323");
		company.sendKeys("Obsqura");
		address_1.sendKeys("Trivandrum");
		address_2.sendKeys("Karyavattom");
		city.sendKeys("Trivandrum");
		postcode.sendKeys("698522");
		Select s=new Select(country_id);
		s.selectByValue("129");
		Thread.sleep(3000);
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOf(zone_id));
		Select s1=new Select(zone_id);
		s1.selectByIndex(3);
		Thread.sleep(3000);
		password.sendKeys("abcd");
		confirm.sendKeys("abcd");
		
		newsletter.click();
		agree.click();
		continue_button.click();
		
	}
	
	public String validateRegistration() {
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.titleContains("Your Account Has Been Created!"));
		String title=driver.getTitle();
		return title;
	}
	
	public void logout() {
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
	}
	
	
	public String validateLogOut() {
		String logout=driver.getTitle();
		return logout;
	}
	
	
	public void login() {
		login.click();
	}
	
	public String validateLogin() {
		String login=driver.getTitle();
		return login;
	}
	
	public Registration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
