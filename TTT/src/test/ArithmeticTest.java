package test;

import static org.junit.Assert.*;
import org.junit.Before;
import junit.framework.TestCase;
import sample.Arithmetic;
import org.junit.*;

public class ArithmeticTest{
	
	Arithmetic ae;
	
	@Before
	public void setUp() throws Exception{
		ae= new Arithmetic();
	}
	
	@After
	public void tearDown() throws Exception{
		System.gc();
	}
	
	@Test
	public void testAdd(){
		assertEquals(7, ae.add(4, 3));
	}
	
	@Test
	public void testMultiply(){
		assertEquals(30, ae.multiply(6, 5));
	}
	
	
	@Test
	public void testDecide() {
		assertTrue(ae.decide(662,44));
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDecide1() {
		int i= 9/0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticTest at;
		at= new ArithmeticTest();
		at.testDecide1();
	}

}
