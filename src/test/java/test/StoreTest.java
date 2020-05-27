package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Store;
import utility.BaseClass;

public class StoreTest extends BaseClass {
	
	Store s;
@Test(priority=0)
	
  public void testStore() {
	  
	s=new Store(driver);
	  s.selectProduct();
  }
  
  @Test(priority=1)
  public void validateProductTest() {
	  String t=s.validateProductpage();
	  System.out.println(t);
	  Assert.assertEquals(t, "Spoon");
  }
  
  @Test(priority=2)
  public void testAddToCart() {
	  s.addToCart();
  }
  
  @Test(priority=3)
  public void validateAddToCartTest() {
	  String a=s.validateAddToCart();
	  System.out.println(a);
	  Assert.assertEquals(a, "Shopping Cart");
  }
  
  @Test(priority=4)
  public void update() {
	  s.productQuantityUpdate();
  }
  
  @Test(priority=5)
  public void checkoutTest() {
	  s.checkOut();
  }
  
  @Test(priority=6)
  public void validateConfirmTest() {
	  String t1=s.validateConfirm();
	  System.out.println(t1);
	  Assert.assertEquals(t1, "Your order has been placed!");
  }
  
  @Test(priority=7)
  public void homeTest() {
	  s.gotoHomePage();
  }
  
}
