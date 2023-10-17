package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	
	
	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String uName, String pWord, String cName, String fName, String sName) throws InterruptedException {
		System.out.println(driver);
		
		new LoginPage(driver)
		.enterUsername(uName)	//from excel
		.enterPassword(pWord)	//from excel
		.clickLoginButton()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cName)	//from excel
		.enterForename(fName)	//from excel
		.enterSurname(sName)		//from excel
		.clickCreateLead()
		.verifyFirstName();
		
	}

	
}
