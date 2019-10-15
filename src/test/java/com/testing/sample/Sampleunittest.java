package com.testing.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Sampleunittest {
	
	@Test
	public void testAdd() {
		System.out.println("add");
		Integer a=15;
		Integer b=15;
		Integer expresult = 30;
		Integer result = SampleUtil.add(a, b);
		assertEquals(expresult,result);
		
		assertEquals(null, SampleUtil.add(null,15));
		assertEquals(null, SampleUtil.add(null, null));
	}
  
	
	@Test
	public void testadd1() {
		
		assertEquals(null, SampleUtil.add(15, null));
	}
}
 