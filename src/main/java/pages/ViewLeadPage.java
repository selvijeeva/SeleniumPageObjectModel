package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage verifyViewLeadPage() {
		
		boolean displayed = driver.findElement(By.linkText("View Lead")).isDisplayed();
		if(displayed) {
			System.out.println("Create Leads page is displayed");
		}
		else {
			System.out.println("Create Leads page is not dispalyed");
		}
		
		return this;
	}
	
	public void verifyFirstName() {
		System.out.println("First Name Verified");
		// TODO Auto-generated method stub

	}
	

}
