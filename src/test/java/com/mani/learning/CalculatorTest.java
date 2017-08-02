package com.mani.learning;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	Calculator<Integer> calc = new Calculator<Integer>(2,5);
	@Test
	public void testAdd(){
		
		Assert.assertTrue(calc.operation((u,v)->Integer.sum(u, v))==7);
	}
	
	@Test
	public void testMultiply(){
		
		Assert.assertTrue(calc.operation((u,v)->u*v)==10);
	}
	
	
	@Test
	public void testDivision(){
		
		Assert.assertTrue(calc.operation((u,v)->u/v)==0);
	}
}
