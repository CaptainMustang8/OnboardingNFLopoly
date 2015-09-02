package com.usaa.nflopoly.game;
import java.util.Random;

public class Die {
	public Die(){
		// default constructor
	}
	
	public int roll(){
		Random random = new Random();
		return random.nextInt(6) + 1;
	}
}
