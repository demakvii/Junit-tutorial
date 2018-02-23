package com.mak.tutorial.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import junit.framework.TestCase;

public class JavaTest1 extends TestCase {

	protected int value1,value2;
	
	protected void setUp(){
		value1 = 1;
		value2 = 2;
	}
	
	@Test
	public void testAdd(){
		double result = value1 + value2;
		assertThat(result, is(3.0));
		
	}
	
	
}
