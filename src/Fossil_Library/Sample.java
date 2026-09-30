package Fossil_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {

    WebDriver driver= new ChromeDriver();
    driver.navigate().to("https://www.fossil.in/");
    driver.manage().window().maximize();
    driver.navigate().refresh();
	driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[3]/nav/div/div/div/div[2]/div/ul/li[11]/button")).click();
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Scarlette Stainless Steel Watch");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	/*driver.findElement(By.xpath("//button[@class='tracking-consent-module__NVOBpW__affirmButton']")).click();
	driver.findElement(By.xpath("//img[@class='ProductCard-module__zQzbga__hoverImg']")).click();
	*/
	
	
	
	
	
	
	
	
	}

}
