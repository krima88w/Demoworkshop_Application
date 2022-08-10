package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_NGProject 
{
 @Test (priority = -1)
 
 
 public void m1()
 {
	 Reporter.log("hi",true);
 }
 
 @Test (invocationCount = 2, priority = 2)
 public void m2()
 {
	 Reporter.log("how are you",true);
 }
 
 
 @Test (priority = 1, enabled = false)
 public void m3()
 {
	 Reporter.log("where are you",false);
 }
 
	
	
	
	
}
