package DemoPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {  
	
	private WebDriver driver;		

	 @Test				
 //   public void testEasy() {	
		    public void LoadingGoolePg() {	
	driver.get("http://www.google.com");  
	String title = driver.getTitle();				 
	Assert.assertTrue(title.contains("Google")); 		
       }	
    
	 @BeforeTest
       public void beforeTest() {	
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\IDACTMO002\\Desktop\\Setup\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();  
       }		

	 @AfterTest
       public void afterTest() {
	   driver.quit();			
       }		

}
