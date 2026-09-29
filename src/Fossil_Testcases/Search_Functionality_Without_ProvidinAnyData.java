package Fossil_Testcases;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import Fossil_Library.Search_Functionality;
import Fossil_Utils.Apputils;

public class Search_Functionality_Without_ProvidinAnyData extends Apputils {
@Test (priority=4)
public void Search_Functionality_Without_ProvidinAnyData () 
{
	
	Search_Functionality SF = new Search_Functionality();
	SF.Search_Functionality_Without_ProvidinAnyData();
	boolean results2 = SF.isDisplayedValidationMessage3();
	Assert.assertFalse(results2);






}







}
