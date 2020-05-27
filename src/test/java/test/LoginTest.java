package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Login;
import pageObject.Registration;
import utility.BaseClass;

public class LoginTest extends BaseClass {
	
	Login l;
	
  @Test(priority=0)
  public void testLogin() {
	  
	  l=new Login(driver);
	  l.login();
	
  }
  
  @Test(priority=1)
  public void validateLoginTitle() {
	  
	  String login_title=l.validateLogin();
	  System.out.println(login_title);
	  Assert.assertEquals(login_title, "My Account");
  }
  
  @Test(priority=2)
  public void Home() {
	  l.gotoHome();
  }
  
  @Test(priority=3)
  public void validateHomeTest() {
	  String title=l.validateHome();
	  System.out.println(title);
	  Assert.assertEquals(title, "Grocerystore");
  }
}
