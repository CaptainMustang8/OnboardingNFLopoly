package com.usaa.nflopoly.game;
import java.util.Random;

public class Die {
	
	private int VALUE = 1; //intial value of 1 
	
	public Die(){
	}
	
	public void roll(){
		Random random = new Random();
		VALUE =  random.nextInt(6) + 1;
	}

	public int getValue() {
		return VALUE;
	}
}
