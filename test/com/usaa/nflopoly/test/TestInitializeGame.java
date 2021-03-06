package com.usaa.nflopoly.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.usaa.nflopoly.game.NFLopoly;

public class TestInitializeGame {
	

	@Test
	public void shouldNotAllowFewerThanTwoPlayers(){
		try{
			NFLopoly nfLopoly = new NFLopoly(1, 100);
			fail("Game should not have been initialized with < 2 players.");
		}
		catch(Exception e){
			assertEquals(e.getMessage(), "Illegal Number of Players. Must be between 2 and 6.");
		}
	}
	
	@Test
	public void shouldNotAllowGameToStartWithFewerThanTwoPlayers(){
		try{
			NFLopoly nfLopoly = new NFLopoly(7, 100);
			fail("Game should not have been initialized with > 7 players.");
		}
		catch(Exception e){
			assertEquals(e.getMessage(), "Illegal Number of Players. Must be between 2 and 6." );
		}
	}
	
	@Test 
	public void shouldNotAllowPlayerCashValueToStartBelowOneDollar(){
		try{
			NFLopoly nfLopoly = new NFLopoly(4, 0);
			fail("Game should not have been initialized with <= 0 dollars");
		}
		catch(Exception e){
			assertEquals(e.getMessage(), "Illegal Initial Amount.  Must be greater than 0");
		}
	}
	
	@Test 
	public void shouldAllowGameToStartWithPlayerCashGreaterThanOneDollar(){
		try{
			NFLopoly nfLopoly = new NFLopoly(4, 100);
		}
		catch(Exception e){
			fail("Exception should not have been thrown.  Initial player cash value is good.");
		}
	}
	
	@Test
	public void shouldAllowGameToStartWithPlayerNumberBetweenTwoAndSixPlayers(){
		try{
			NFLopoly nfLopoly = new NFLopoly(3, 100);
		}
		catch(Exception e){
			fail("Exception should not have been thrown. Initial Player amount is good");
		}
		
	}
	
	
}
