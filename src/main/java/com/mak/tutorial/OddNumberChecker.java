package com.mak.tutorial;

public class OddNumberChecker {

	
	public OddNumberChecker(){
		
	}
	
	public boolean isValidOddNumber(int number){
		return !( number % 2 == 0 );
	}
}
