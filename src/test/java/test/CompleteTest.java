package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.Login;
import pageObject.Registration;
import pageObject.Store;
import utility.BaseClass;

public class CompleteTest extends BaseClass {
	
	Registration r;
	Login l;
	Store s;
	
  @Test(priority=0)
	  public void registrationTest() throws InterruptedException {
		  r=new Registration(driver);
		  r.register();}
	  
	@Test(priority=1)
	  public void validateRegistrationTest() {
		  String b=r.validateRegistration();
		  System.out.println(b);
		  Assert.assertEquals(b, "Your Account Has Been Created!");}
	  
   @Test(priority=2)
	  public void logoutTest() { r.logout(); }
	  
	@Test(priority=3)
	  public void validateLogOutTest() {
		  String l=r.validateLogOut();
		  System.out.println(l);
		  Assert.assertEquals(l,"Account Logout"); }
	
	@Test(priority=4)
	  public void loginTest() { r.login(); }
		 
	@Test(priority=5)
		  public void validateLoginTest() {
			  String v=r.validateLogin();
			  System.out.println(v);
			  Assert.assertEquals(v,"Account Login");}
	  
    @Test(priority=6)
		  public void testLogin() {
			  l=new Login(driver);
			  l.login();}
		  
	@Test(priority=7)
		  public void validateLoginTitle() {
			  String login_title=l.validateLogin();
			  System.out.println(login_title);
			  Assert.assertEquals(login_title, "My Account"); }
		  
	 @Test(priority=8)
	  public void Home() {
		  l.gotoHome();
	  }
	  
	  @Test(priority=9)
	  public void validateHomeTest() {
		  String title=l.validateHome();
		  System.out.println(title);
		  Assert.assertEquals(title, "Grocerystore");
	  }
		  
	
	@Test(priority=9)
	  public void testStore() {
		 s=new Store(driver);
		  s.selectProduct(); }
	  
	@Test(priority=11)
	  public void validateProductTest() {
		  String t=s.validateProductpage();
		  System.out.println(t);
		  Assert.assertEquals(t, "Spoon"); }
	  
	@Test(priority=12)
	  public void testAddToCart() { s.addToCart(); }
	  
	@Test(priority=13)
	  public void validateAddToCartTest() {
		  String a=s.validateAddToCart();
		  System.out.println(a);
		  Assert.assertEquals(a, "Shopping Cart");}
	
   @Test(priority=14)
	  public void update() { s.productQuantityUpdate(); }
	  
   @Test(priority=15)
   public void checkoutTest() {
 	  s.checkOut();
   }
   
   @Test(priority=16)
   public void validateConfirmTest() {
 	  String t1=s.validateConfirm();
 	  System.out.println(t1);
 	  Assert.assertEquals(t1, "Your order has been placed!");
   }
   
   @Test(priority=17)
   public void homeTest() {
 	  s.gotoHomePage();
   }
	  
}
