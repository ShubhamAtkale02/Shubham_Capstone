package Com.Openmrs.Page;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Openmrs.Base.Base;





public class LoginPage extends Base {
	
	
	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	WebElement wardP;
	@FindBy(xpath="//input[@class='btn confirm']")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[text()='You must choose a location!']")
	WebElement text;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
	WebElement logout;

	public LoginPage()throws IOException{
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un,String pass) {
		userName.sendKeys(un);
		password.sendKeys(pass);
		wardP.click();
		loginbtn.click();
	}
	public void isDisplay() {
		String Expected="Home";
		String Actual=driver.getTitle();
		Assert.assertEquals(Actual, Expected);
		System.out.println("Login Is Successful");

	}
	public void login2(String un1,String pass1) throws InterruptedException {
		userName.sendKeys(un1);
		password.sendKeys(pass1);
		loginbtn.click();
		Thread.sleep(5000);
		String expected="You must choose a location!";
		String actual=driver.findElement(By.xpath("//span[@class='location-error']")).getText();
		Assert.assertEquals(actual, expected);
		System.out.println("When Not Selected Location This Is Shown : "+actual);
	}
	
	
	
	
	
	
	
	
	
	

}
