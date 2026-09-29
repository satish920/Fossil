package Fossil_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Fossil_Library.Search_Functionality;

public class Search_Functionality_ProductPartialName {
@Test (priority=3)
public void Search_Functionality_ProductPartialName() 
{

	Search_Functionality SF  = new Search_Functionality();
   SF.Search_Functionality_ProductPartialName();
  boolean results4 = SF.isDisplayedValidationMessage5();
  Assert.assertTrue(results4);














}



}
