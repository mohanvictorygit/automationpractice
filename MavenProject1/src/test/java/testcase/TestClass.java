package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseClass;
import pageObject.Loginpage;


public class TestClass extends BaseClass{
	//WebDriver driver;
	@Test
	public void Login() 
	{
		//System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Chromedriver/chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized"); // Start maximized
		//options.addArguments("--disable-infobars"); // Disable infobars
	    //driver=new ChromeDriver();
		//driver.get("https://www.saucedemo.com/v1/");
		System.out.println("Entered the Login method");
		driver.manage().window().maximize();
		Loginpage.UserName("standard_user");
		Loginpage.Password("secret_sauce");
		Loginpage.Login();
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("//input[contains(@value,'LOGIN')]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='item_5_img_link']/img")).click();
		driver.findElement(By.xpath("//*[contains(text(),'ADD TO CART')]")).click();
		String ProductName=driver.findElement(By.xpath("//div[@class='inventory_details_name']")).getText();
	    System.out.println(ProductName);
	    driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
	    driver.findElement(By.xpath("//*[contains(text(),'CHECKOUT')]")).click();
	    driver.findElement(By.id("first-name")).sendKeys("Niruba");
	    driver.findElement(By.id("last-name")).sendKeys("Saanvi");
	    driver.findElement(By.id("postal-code")).sendKeys("611108");
	    driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
	    driver.findElement(By.xpath("//*[contains(text(),'FINISH')]")).click();
	    String FinalElement=driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
	    if(FinalElement.equalsIgnoreCase("THANK YOU FOR YOUR ORDER"))
	    {
	    	System.out.println("Order is completed");
	    }
	    else
	    {
	    	System.out.println("Some issues in the Order");
	    }
		

	
	}


    
}

