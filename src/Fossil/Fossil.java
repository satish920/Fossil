package Fossil;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fossil {
@Test
public static void main(String[] args) {
		

		//Navigtion ->> Launching the browser
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.fossil.in/");
	    driver.manage().window().maximize();
	    driver.navigate().refresh();
	    
	    //Product Flow 
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[3]/nav/div/div/div/div[2]/div/ul/li[11]/button")).click();
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Scarlette Stainless Steel Watch");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//button[@class='tracking-consent-module__NVOBpW__affirmButton']")).click();
	    driver.findElement(By.xpath("//img[@class='ProductCard-module__zQzbga__hoverImg']")).click();	
	   //Synchronization
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
	    driver.findElement(By.xpath("//button[@class='btn-add-bag']")).click();
	    driver.navigate().refresh();
	   
	    //Cart Verification and Items Updating & check summary
	    driver.findElement(By.xpath("//a[@class='btn-add-bag text-decoration-none d-flex align-items-center justify-content-center']")).click();    
	    driver.findElement(By.xpath("//img[@alt='Plus']")).click();
	    driver.findElement(By.xpath("//img[@alt='Minus']")).click();
	    
	    
	  

	
	
	
	}

}
