package Com.Openmrs.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import Com.Openmrs.Utilities.Test;

public class Base {
 public static WebDriver driver;
 public static Properties prop;
 
 public Base() throws IOException{
		FileInputStream fis=new FileInputStream("./Configuration\\Data.properties");
		prop=new Properties();
		prop.load(fis);
	}
 
 
      @BeforeMethod
	   public void  launchBrowser() throws InterruptedException{
		   String browserName=prop.getProperty("browserName");
		   if(browserName.equals("chrome")) {
			   System.setProperty("webdriver.chrome.driver", "./Driver//chromedriver.exe");
			   driver=new ChromeDriver();
			   DesiredCapabilities dc=new DesiredCapabilities();
				dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			     
		   }else if(browserName.equals("edge")) {
			   
			   System.setProperty("Webdriver.edge.driver", "./Driver//msedgedriver.exe");
			   driver=new EdgeDriver();
		   }
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Test.IMPLICIT_WAIT, TimeUnit.SECONDS);  

		   driver.get(prop.getProperty("url"));
		
	}
     @AfterMethod
      public void tearDown() {
    	  
    	  driver.close();
      }
     
}
