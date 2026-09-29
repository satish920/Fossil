package Fossil_Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Fossil_Library.Search_Functionality;
import Fossil_Utils.Apputils;


public class Search_Functionality_With_InvalidProductname extends Apputils {
@Test (priority=1)
public void Search_Functionality_With_InvalidProductname() 
{
	
	Search_Functionality SF = new Search_Functionality();
	SF.Search_Functionality_With_InValidProductname();
boolean results1 =SF.isDisplayedValidationMessage2();
  Assert.assertTrue(results1);
  



}



}
