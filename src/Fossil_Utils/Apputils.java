package Fossil_Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils {


	 public static WebDriver driver ;
     
	  public static String url = "https://www.fossil.in/";
    
    		     @BeforeTest
    			public static void launchapp()
         {
     
       	     driver=  new ChromeDriver();
         
                    driver.navigate().to(url);
                   driver.manage().window().maximize();
                   driver.navigate().refresh();
         }
         
    	   @AfterTest
         public static void closeapp()

         {
       	    driver.close();
         }
















}
