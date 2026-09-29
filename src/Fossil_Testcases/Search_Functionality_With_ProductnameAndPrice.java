package Fossil_Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Fossil_Library.Search_Functionality;
import Fossil_Utils.Apputils;

public class Search_Functionality_With_ProductnameAndPrice extends Apputils {
@Test (priority=2)
public void Search_Functionality_With_ProductnameAndPrice() 
{
	Search_Functionality sf = new Search_Functionality();
   sf.Search_Functionality_With_ProductnameAndPrice();
boolean results3 =sf.isDisplayedValidationMessage4();
Assert.assertTrue(results3);



}












}
