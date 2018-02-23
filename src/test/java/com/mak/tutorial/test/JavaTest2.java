package com.mak.tutorial.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mak.tutorial.MessageUtil;

public class JavaTest2 {

	protected String message = "Hello";
	protected MessageUtil messageUtil = new MessageUtil(message) ;
	
	protected void setUp(){
		message  = "Hello";
		messageUtil  =  new MessageUtil(message);
	}
	
	@Test
	public void testPrintMsg(){
		assertEquals(message,messageUtil.printMessage());
	}
	
	@Test
	public void testAppendWorldAtEnd(){
		assertEquals(message + " World", messageUtil.appendWorldAtEnd());
	}
}
