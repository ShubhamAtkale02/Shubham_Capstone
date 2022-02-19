package Com.Openmrs.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Openmrs.Base.Base;
import Com.Openmrs.Page.FindPatientPage;
import Com.Openmrs.Page.LoginPage;

public class LoginTest extends Base{

	
	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=1)
	public void verifyUserLoginSuccessful() throws IOException {
		
		LoginPage lp=new LoginPage();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		lp.isDisplay();
	}
	@Test(priority=2)
	public void verifyUserLoginUnsuccessful() throws IOException, InterruptedException {
		LoginPage lp=new LoginPage();
		lp.login2(prop.getProperty("username"), prop.getProperty("password"));
	//	lp.text();
		
	}

		
	
	
}
