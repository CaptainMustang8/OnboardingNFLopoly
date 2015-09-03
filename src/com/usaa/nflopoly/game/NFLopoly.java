package com.usaa.nflopoly.game;

import java.util.ArrayList;

public class NFLopoly {
	
	private static int numberOfPlayers;
	private int startingCashAmount;
	private Board board = new Board();
	private ArrayList<Owner> owners = new ArrayList<>();
	
	public NFLopoly(int numPlayers, int initialAmount) throws Exception{
		if(numPlayers < 2 || numPlayers > 6){
			throw new Exception("Illegal Number of Players. Must be between 2 and 6.");
		}
		if(initialAmount <= 0){
			throw new Exception("Illegal Initial Amount.  Must be greater than 0");
		}
		
		numberOfPlayers = numPlayers;
		startingCashAmount = initialAmount;
		
	}
	
	public void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		NFLopoly nfLopoly = new NFLopoly(3, 500);
		createOwners();
		nfLopoly.runGame();
	}


	private void createOwners() throws Exception { // "Owners" are the players
		for(int i = 0; i < numberOfPlayers; i++){
			Owner owner = new Owner(startingCashAmount, board);
			owners.add(owner);
		}
	}
	
	private void runGame() {
//		for(;;){
//			
//		}
//		
	}

}
