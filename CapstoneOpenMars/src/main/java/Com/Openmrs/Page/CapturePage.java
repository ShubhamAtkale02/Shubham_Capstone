package Com.Openmrs.Page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Openmrs.Base.Base;
import junit.framework.Assert;

public class CapturePage extends Base {
	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	WebElement wardP;
	@FindBy(xpath="//input[@class='btn confirm']")
	WebElement loginbtn;
	
	
	@FindBy(xpath="//i[@class='icon-vitals']")
	WebElement cap;
	@FindBy(xpath="//input[@class='form-control']")
	WebElement search;

	@FindBy(xpath="//*[@id=\"patient-search-results-table\"]/tbody/tr/td[2]")
	WebElement id;
	
	
	public CapturePage() throws IOException {
		 PageFactory.initElements(driver, this);		
	}

	
	public void capturePatient(String un2,String pass2) {
		userName.sendKeys(un2);
		password.sendKeys(pass2);
		wardP.click();
		loginbtn.click();
		cap.click();
		search.sendKeys("Robert Taylor");
		id.click();
		
		String e =driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div/span")).getText();
		System.out.println("This is the ID :"+e);
	
		
		
		
		
	}
//	public void patientID() {
//    System.out.println(e);
//	
//	}
//	
	
	
	
}
