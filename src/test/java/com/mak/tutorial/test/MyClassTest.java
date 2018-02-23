package com.mak.tutorial.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Test;

import com.mak.tutorial.MyClass;

public class MyClassTest {

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("10 X 5 must be 50", 50, tester.multiply(10, 5));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionThrown() {
		MyClass tester = new MyClass();
		assertEquals("10 X 5 must be 50", 50, tester.multiply(110, 5));
		
	}
	
	@Test
	public void test1(){
		MyClass myClass = mock(MyClass.class);
		assertThat(myClass.isGreater(12, 13), is(false));
	}
}
