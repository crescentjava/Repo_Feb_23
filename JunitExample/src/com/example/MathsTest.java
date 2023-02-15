package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathsTest {
	
	Maths m;

	@Before
	public void setUp() throws Exception {
		m=new Maths();
	}

	
	
	
	  @Test public void testForSum() { assertEquals(10, m.add(5, 5)); }
	 
	
	
	  @Test public void testForSquare() { assertEquals(25, m.square(5)); }
	 
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void whenTheNumberIsNegativeSystemShouldThrowException()
	{
		m.square(-5);
	}

}
