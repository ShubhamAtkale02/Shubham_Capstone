package Com.Openmrs.Page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Openmrs.Base.Base;

public class FindPatientPage extends Base{

	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	WebElement wardP;
	@FindBy(xpath="//input[@class='btn confirm']")
	WebElement loginbtn;
	@FindBy(xpath="//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
	WebElement find;
	@FindBy(xpath="//input[@id='patient-search']")
	WebElement search;
	
	
	public FindPatientPage() throws IOException {
		
		 PageFactory.initElements(driver, this);
	}

	public  void find(String un,String pass) throws IOException {
		userName.sendKeys(un);
		password.sendKeys(pass);
		wardP.click();
		loginbtn.click();
		find.click();
		search.sendKeys("Robert Taylor");
		System.out.println("Robert IS Available");
		
		
		
		
	}
}
