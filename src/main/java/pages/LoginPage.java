package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	
	//constructor is going to receive chrome driver
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		
	}
	
	
	
	//naming convention for methods - action+Element name
	public LoginPage enterUsername(String uName) throws InterruptedException{
		
		System.out.println(driver);
		
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
		//this keyword represents the object of same page
	}
	
	public LoginPage enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;

	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		HomePage hp = new HomePage(driver);
		return hp;
				

	}
	
	

}
