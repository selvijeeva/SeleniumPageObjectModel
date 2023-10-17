package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class HomePage extends BaseClass{
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	

	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
		
	}
	
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
		
	}

	public HomePage verifyHomepage() {
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Homepage is not dispalyed");
		}
		
		return this;
		
	}
}
