package com.usaa.nflopoly.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.usaa.nflopoly.game.Die;

public class TestDie {
	private Die die;
	
	/*
	 * Need to do one BDD style.
	 */
	
	
	
	
	@Before
	public void setUp(){
		die = new Die();
	}
	
	
	@Test
	public void testRoll() {
		die.roll();
		int faceValue = die.getValue();
		Boolean inRange = 0 < faceValue && faceValue < 7;
		assertTrue(inRange);
		
	}
	
	@After
	public void tearDown(){
		
	}
	
	/*
	 * Application Exception
	 * Exception specific to a particular class
	 * 
	 * For example, if I threw in another method, I could make a TooFewDieFacesException
	 * 
	 * throw new TooFewDieFacesException("An attempt to create a Die with " + numberOfFaces + " faces failed because
	 * yada yada yada"
	 * 
	 * Have to create an exception class
	 */
	
}
