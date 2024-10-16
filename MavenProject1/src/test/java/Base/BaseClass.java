package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public FileInputStream fis;

	@BeforeTest
	public void setup() throws IOException
	{
	try {
	  fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\MavenProject1\\Application.properties");
	   prop.load(fis);	
	    
	    if(prop.getProperty("Browser").equalsIgnoreCase("chrome"))
	    {
	    	WebDriverManager.chromedriver().setup();
	    	driver=new ChromeDriver();
	    	driver.get(prop.getProperty("ApplicationURL"));		
	    }
	    else if(prop.getProperty("Browser").equalsIgnoreCase("ie"))
        {
        	WebDriverManager.iedriver().setup();
        	driver=new InternetExplorerDriver();
        	driver.get(prop.getProperty("ApplicationURL"));
        } 
	    else if(prop.getProperty("Browser").equalsIgnoreCase("edge"))
        {
        	WebDriverManager.edgedriver().setup();
        	driver=new EdgeDriver();
        	driver.get(prop.getProperty("ApplicationURL"));
        } 
	    else if(prop.getProperty("Browser").equalsIgnoreCase("opera"))
        {
        	WebDriverManager.operadriver().setup();
        	driver=new OperaDriver();
        	driver.get(prop.getProperty("ApplicationURL"));
        } 
	    
	    
	    
	} 
	
	
	
	
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
	
	
	
}