package Fossil_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Fossil_Utils.Apputils;

public class Search_Functionality extends Apputils {

   
	//POM (Page Object Model Pattern)
	@FindBy (xpath ="/html/body/div[2]/div[2]/header/div[3]/nav/div/div/div/div[2]/div/ul/li[11]/button")
    WebElement searchbutton;
    
    @FindBy (xpath ="//input[@type='search']")
    WebElement sendingdata;

	@FindBy (xpath ="//button[@type='submit']")
	WebElement submit;
	
	@FindBy (xpath = "//button[@class='tracking-consent-module__NVOBpW__affirmButton']")
	WebElement submit2;
	
	@FindBy (xpath ="//span[@class='pro-price text-black fw-bold']")
	WebElement isdisplayedbothpricesame;
	
	@FindBy (xpath = "/html/body/div[3]/div/div/div[1]/div[5]/section/div[1]/div[1]/div/div/div[2]/div[3]/div/div/span[2]")
	WebElement price;
	
	@FindBy (xpath="//img[@class='ProductCard-module__zQzbga__hoverImg']")
	WebElement productimg;
	
	@FindBy (xpath ="//span[@class='pro-price text-black fw-bold']")
	WebElement Mrpprice;
	
	
	public void Search_Functionality_With_ValidProductname () 
{
	
	    searchbutton.click();
	    sendingdata.sendKeys("Scarlette Stainless Steel Watch");
	    submit.click();
        submit2.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      String pricebefore= price.getText();
      System.out.println("Pricebefore" +pricebefore);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      productimg.click();
    String priceafter =  Mrpprice.getText();
    System.out.println("Priceafter" + priceafter);
    System.out.println(pricebefore.equalsIgnoreCase(priceafter));
    System.out.println("Test case is passed"); 


}
	  

	
	
	
	
	public boolean isdisplayedbothpricesame() {

if  (isdisplayedbothpricesame.isDisplayed()) 
	   {
		   
	 return true;
		 
	 }else {
		 return false;
	 }
	
	   
	   }



public void Search_Functionality_With_InValidProductname () 
{
	

    driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[3]/nav/div/div/div/div[2]/div/ul/li[11]/button")).click();
    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("jjcbjhbvbxcbhjjjjd");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//button[@class='tracking-consent-module__NVOBpW__affirmButton']")).click();

}

 public boolean isDisplayedValidationMessage2() {
  

    
    if(driver.findElement(By.xpath("//p[@class='results-for-text']")).isDisplayed()) 
  {
	  return true;
		 
	 }else {
		 return false;
	 }
	
  
  
  
  }
 
public void Search_Functionality_Without_ProvidinAnyData () 

{
	
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[3]/nav/div/div/div/div[2]/div/ul/li[11]/button")).click();


    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//button[@class='tracking-consent-module__NVOBpW__affirmButton']")).click();

}

   public boolean isDisplayedValidationMessage3() 
   {
   
    if(driver.findElement(By.xpath("//p[@class='results-for-text']")).isDisplayed()) 
    {
  	  return true;
  		 
  	 }else {
  		 return false;
  	 }
  	




}

public void Search_Functionality_With_ProductnameAndPrice () 
{
	
	
	 driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[3]/nav/div/div/div/div[2]/div/ul/li[11]/button")).click();
	 driver.findElement(By.xpath("//input[@type='search']")).sendKeys("scarlette 11,995");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//button[@class='tracking-consent-module__NVOBpW__affirmButton']")).click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

}

public boolean isDisplayedValidationMessage4() {
	

	  if  (driver.findElement(By.xpath("//span[@class='reval-results-count']")).isDisplayed()) 
	   {
		   
	 return true;
		 
	 }else {
		 return false;
	 }
	
	   
	   }


public void Search_Functionality_ProductPartialName () 
{
	
	
	 driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[3]/nav/div/div/div/div[2]/div/ul/li[11]/button")).click();
	 driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Scarlette Three-Hand");
	 driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	   driver.findElement(By.xpath("//button[@class='tracking-consent-module__NVOBpW__affirmButton']")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}

public boolean isDisplayedValidationMessage5() {
	  if  (driver.findElement(By.xpath("//span[@class='reval-results-count']")).isDisplayed()) 
	   {
		   
	 return true;
		 
	 }else {
		 return false;
	 }




}


















}












































