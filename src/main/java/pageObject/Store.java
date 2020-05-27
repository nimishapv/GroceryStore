package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Store {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=common/home\"]")
	WebElement home;
	@FindBy(xpath="//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=product/product&product_id=56\"][1]")
    WebElement product;
	@FindBy(id="button-cart")
	WebElement addToCart_button;
	@FindBy(xpath="//div[@class=\"alert alert-success\"]//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=checkout/cart\"]")
	WebElement cart;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")
	WebElement quantity;
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement update;
	@FindBy(xpath="//div[@class=\"pull-right\"]//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=checkout/checkout\"]")
	WebElement checkout;
	@FindBy(id="button-payment-address")
	WebElement paymentAddress;
	@FindBy(id="button-shipping-address")
	WebElement shippingAddress;
	@FindBy(name="comment")
	WebElement comment;
	@FindBy(id="button-shipping-method")
	WebElement shippingMethod;
	@FindBy(name="agree")
	WebElement agree;
	@FindBy(id="button-payment-method")
	WebElement paymentMethod;
	@FindBy(id="button-confirm")
	WebElement confirm;
	@FindBy(xpath="//div[@class=\"pull-right\"]//a[@href=\"http://opesmount.in/grocerystore1/index.php?route=common/home\"]")
	WebElement goHome;
	
	
	public void selectProduct() {
		
		WebDriverWait w=new WebDriverWait(driver,60);
		w.until(ExpectedConditions.visibilityOf(product));
		
		product.click();
		}
	
	public String validateProductpage() {
		String prd_title=driver.getTitle();
		return prd_title;
	}
	
	public void addToCart() {
		
		WebDriverWait w=new WebDriverWait(driver,60);
		w.until(ExpectedConditions.visibilityOf(addToCart_button));
		addToCart_button.click();
		w.until(ExpectedConditions.visibilityOf(cart));
		cart.click();
	}
	
	public String validateAddToCart() {
		String b=driver.getTitle();
		return b;
	}
	
	public void productQuantityUpdate() {
		quantity.clear();
		quantity.sendKeys("2");
		update.click();
	}
	
	public void checkOut() {
		
		WebDriverWait w=new WebDriverWait(driver,60);
		w.until(ExpectedConditions.visibilityOf(checkout));
		checkout.click();
		System.out.println(driver.getCurrentUrl());
		w.until(ExpectedConditions.visibilityOf(paymentAddress));
		paymentAddress.click();
		w.until(ExpectedConditions.visibilityOf(shippingAddress));
		shippingAddress.click();
		w.until(ExpectedConditions.visibilityOf(comment));
		comment.sendKeys("placing order");
		w.until(ExpectedConditions.visibilityOf(shippingMethod));
		shippingMethod.click();
		w.until(ExpectedConditions.visibilityOf(agree));
		agree.click();
		w.until(ExpectedConditions.visibilityOf(paymentMethod));
		paymentMethod.click();
		w.until(ExpectedConditions.visibilityOf(confirm));
		confirm.click();
		
	}
	
	public String validateConfirm() {
		String title=driver.getTitle();
		return title;
	}
	
	public void gotoHomePage() {
		goHome.click();
	}
	
	public Store(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
