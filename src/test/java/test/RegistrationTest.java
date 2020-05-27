package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Registration;
import utility.BaseClass;

public class RegistrationTest extends BaseClass {
	
Registration r;
	 
  @Test(priority=0)
  public void registrationTest() throws InterruptedException {
	  
	  r=new Registration(driver);
	  r.register();
  }
  
  @Test(priority=1)
  public void validateRegistrationTest() {
	  String b=r.validateRegistration();
	  System.out.println(b);
	  Assert.assertEquals(b, "Your Account Has Been Created!");
  }
  
  @Test(priority=2)
  public void logoutTest() {
	  r.logout();
  }
  
  @Test(priority=3)
  public void validateLogOutTest() {
	  String l=r.validateLogOut();
	  System.out.println(l);
	  Assert.assertEquals(l,"Account Logout");
  }
  @Test(priority=4)
  public void loginTest() {
		 r.login();
	  }
	  
	  
	  
	  @Test(priority=5)
	  public void validateLoginTest() {
		  String v=r.validateLogin();
		  System.out.println(v);
		  Assert.assertEquals(v,"Account Login");
	  }
  
  
  
  
}
