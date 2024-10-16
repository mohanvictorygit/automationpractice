package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class Loginpage extends BaseClass{
	WebElement element=null;
	
		 static By UserNameBy=By.id("user-name");
		 static By PasswordBy=By.xpath("//input[@id='password']");
		 static By LoginBy=By.xpath("//input[contains(@value,'LOGIN')]");
		
	
		 
	public static String UserName(String username)
	{
		driver.findElement(UserNameBy).sendKeys(username);
		return username;	
	}
	
	
	public static String Password(String password)
	{
		driver.findElement(PasswordBy).sendKeys(password);
		return password;
	}
	
	public static void Login()
	{
		driver.findElement(LoginBy).click();
		
	}
	
	
	
	
	
	

}
