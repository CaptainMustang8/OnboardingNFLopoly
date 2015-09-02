package com.usaa.nflopoly.game;

public class NFLopoly {
	private int numberOfPlayers;
	private int startingCashAmount;
	
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
		nfLopoly.startGame();
	}

	private void startGame() {
		//FUN STUFF HERE
	}

}
