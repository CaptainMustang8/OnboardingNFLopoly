package com.usaa.nflopoly.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usaa.nflopoly.game.NFLopoly;

public class TestInitializeGame {
	

	@Test
	public void testTooFewPlayers(){
		try{
			NFLopoly nfLopoly = new NFLopoly(1, 100);
			fail("Game should not have been initialized with < 2 players.");
		}
		catch(Exception e){
			assertEquals(e.getMessage(), "Illegal Number of Players. Must be between 2 and 6.");
		}
	}
	
	@Test
	public void testTooManyPlayers(){
		try{
			NFLopoly nfLopoly = new NFLopoly(7, 100);
			fail("Game should not have been initialized with > 7 players.");
		}
		catch(Exception e){
			assertEquals(e.getMessage(), "Illegal Number of Players. Must be between 2 and 6." );
		}
	}
	
	@Test 
	public void testBadInitialAmount(){
		try{
			NFLopoly nfLopoly = new NFLopoly(4, 0);
			fail("Game should not have been initialized with <= 0 dollars");
		}
		catch(Exception e){
			assertEquals(e.getMessage(), "Illegal Initial Amount.  Must be greater than 0");
		}
	}
	
	@Test 
	public void testGoodInitialAmount(){
		try{
			NFLopoly nfLopoly = new NFLopoly(4, 100);
		}
		catch(Exception e){
			fail("Exception should not have been thrown.  Initial Amount is good.");
		}
	}
	
	@Test
	public void testGoodPlayerAmount(){
		try{
			NFLopoly nfLopoly = new NFLopoly(3, 100);
		}
		catch(Exception e){
			fail("Exception should not have been thrown. Initial Player amount is good");
		}
		
	}
	
	
}
