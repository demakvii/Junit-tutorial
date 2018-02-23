package com.mak.tutorial;

public class MyClass {

	public int multiply( int x, int y ) {
		if( x > 99 ){
			throw new IllegalArgumentException("X should be less then 100");
		}
		return x * y;
	}
	
	public int getX(int x){
		return x;
	}
	
	public int getY(int y){
		return y;
	}
	
	public boolean isGreater(int x,int y){
		return (x > y);
	}
}
