package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{
	
	@Test
	public void runLogin(String uName, String pWord) throws InterruptedException {
		// first action - enterusername method in login page
		//create object for Loginpage
		System.out.println(driver);
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername(uName).enterPassword(pWord).clickLoginButton().verifyHomepage();
		
		//HomePage hp = new HomePage();
		//hp.clickCrmsfa().verifyMyHomePage();
		
		//MyHomePage mhp = new MyHomePage();
		//mhp.clickLeads().verifyMyLeadsPage();
		
		
		
		
	}

}
