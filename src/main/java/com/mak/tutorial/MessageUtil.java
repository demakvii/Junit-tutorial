package com.mak.tutorial;

public class MessageUtil {

	private String message;
	
	public MessageUtil(String message) {
		this.message =  message;
	}
	
	public String printMessage(){
		return this.message;
	}
	
	public String appendWorldAtEnd(){
		return this.message.concat(" World");
	}
}
