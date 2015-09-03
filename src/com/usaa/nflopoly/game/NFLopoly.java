package com.usaa.nflopoly.game;

import java.util.ArrayList;

public class NFLopoly {
	
	private static int numberOfPlayers;
	private static int startingCashAmount;
	private static Board board = new Board();
	private static ArrayList<Owner> owners = new ArrayList<>();
	
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
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		NFLopoly nfLopoly = new NFLopoly(3, 500);
		createOwners();
		nfLopoly.runGame();
	}


	private static void createOwners() throws Exception { // "Owners" are the players
		for(int i = 0; i < numberOfPlayers; i++){
			Owner owner = new Owner(startingCashAmount, board, "Player" + i);
			owners.add(owner);
		}
	}
	
	private void runGame() {
		
		int dieAmount;
		
		for(;;){
			for(int i = 0; i < owners.size(); i++){
				dieAmount = board.rollDice();
				
				//option1
				owners.get(i).performTurn(dieAmount);
				System.out.println("Owner: " + i + " is at space " + owners.get(i).getCurrentSpaceIndex());
				
			}
		}
		
	}

}
