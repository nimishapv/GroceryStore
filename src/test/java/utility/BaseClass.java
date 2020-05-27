package utility;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

	public class BaseClass {

		public WebDriver driver;
			
			 @BeforeClass
			  public void beforeClass() {
				  
				  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
				  driver=new ChromeDriver();
				  driver.get("http://opesmount.in/grocerystore1/");
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  }

			  @AfterClass
			  public void afterClass() {
				 // driver.close();
			  }

		
		
	}



