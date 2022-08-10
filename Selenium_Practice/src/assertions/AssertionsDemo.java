package assertions;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo 
{

	
	@Test
	public void demoForAssertions() 
	{
		
	String Expectedvalue = "hello";
	String Actualvalue = "hell";
	System.out.println("hello");
	
	//assertEquals(Expectedvalue, Actualvalue);	
	assertEquals(Actualvalue, Expectedvalue, "Done1");
	
	SoftAssert  soft = new SoftAssert();
		soft.assertEquals(Expectedvalue, Actualvalue);
		//soft.assertAll();
		
	}
	
	

}
