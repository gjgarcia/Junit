package MainPackage;

import junit.framework.TestCase;


public class MyJunit extends TestCase {
	
	public void testSum() {
		
		assertEquals(50,MyClass.AddTwoNumbers(25, 25));
		
	}
	
	public void testBoolean() {
		
		assertEquals(true,MyClass.ReturnTrue());
		
	}
	
	
}