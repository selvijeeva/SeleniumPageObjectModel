package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	
	public MyLeadsPage clickLeads() {
		
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);

	}
	
	public MyHomePage verifyMyHomePage() {
		
		boolean displayed = driver.findElement(By.linkText("My Home")).isDisplayed();
		if(displayed) {
			System.out.println("My Home page is displayed");
		}
		else {
			System.out.println("My Home page is not dispalyed");
		}
		
		return this;
	}
	

}
