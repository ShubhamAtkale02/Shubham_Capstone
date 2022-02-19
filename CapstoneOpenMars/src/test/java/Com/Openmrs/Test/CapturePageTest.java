package Com.Openmrs.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.Openmrs.Base.Base;
import Com.Openmrs.Page.CapturePage;

public class CapturePageTest extends Base{

	public CapturePageTest() throws IOException {
		super();
		
	}

	@Test(priority=4)
	public void verifyPatientIdGettingSuccessful() throws IOException {
		CapturePage cp=new CapturePage();
		cp.capturePatient(prop.getProperty("username"), prop.getProperty("password"));
		
	}
}
