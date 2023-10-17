package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	
	public CreateLeadPage verifyCreateLeadPage() {
		
		boolean displayed = driver.findElement(By.linkText("Create Lead")).isDisplayed();
		if(displayed) {
			System.out.println("Create Leads page is displayed");
		}
		else {
			System.out.println("Create Leads page is not dispalyed");
		}
		
		return this;

	}
	
	public CreateLeadPage enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
		

	}
	
	public CreateLeadPage enterForename(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
		

	}
	
	public CreateLeadPage enterSurname(String sName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(sName);
		return this;
		
	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);		

	}
	

}
