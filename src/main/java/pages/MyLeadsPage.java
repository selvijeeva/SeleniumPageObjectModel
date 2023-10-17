package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass{
	
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	

	public MyLeadsPage verifyMyLeadsPage() {
		
		
		boolean displayed = driver.findElement(By.linkText("My Leads")).isDisplayed();
		if(displayed) {
			System.out.println("My Leads page is displayed");
		}
		else {
			System.out.println("My Leads page is not dispalyed");
		}
		
		return this;
	}

	public CreateLeadPage clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
		
	}
}
