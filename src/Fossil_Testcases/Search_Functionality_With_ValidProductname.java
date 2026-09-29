package Fossil_Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Fossil_Library.Search_Functionality;
import Fossil_Utils.Apputils;

public class Search_Functionality_With_ValidProductname extends Apputils {

@Test (priority=0)
public void Search_Functionality_With_ValidProductname() 
{
	
	Search_Functionality SF = PageFactory.initElements(driver, Search_Functionality.class);
	      SF.Search_Functionality_With_ValidProductname();
	boolean status   =  SF.isDisplayedValidationMessage1();
  Assert.assertTrue(status);






}





}
