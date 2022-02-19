package Com.Openmrs.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Openmrs.Base.Base;
import Com.Openmrs.Page.CapturePage;
import Com.Openmrs.Page.FindPatientPage;

public class FindPatientTest extends Base {

	public FindPatientTest() throws IOException {
		super();
		
	}

	@Test(priority=3)
	public void verifyPateintIsAvaliable() throws IOException {
		FindPatientPage fp=new FindPatientPage();
		fp.find(prop.getProperty("username"), prop.getProperty("password"));
		
}
	
}