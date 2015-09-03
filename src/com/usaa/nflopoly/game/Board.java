package com.usaa.nflopoly.game;

import com.usaa.nflopoly.game.spaces.Space;

public class Board {
	
	private static final int BOARD_SIZE = 40;
	private Space[] SPACES= new Space[BOARD_SIZE];
	private static final Die DIE1 = new Die();
	private static final Die DIE2 = new Die();
	
	public Board(){
		makeSpaces();
	}

	private void makeSpaces() {
		for(int i = 0; i < BOARD_SIZE; i++){
			Space s = new Space(i);
			SPACES[i] = s;
		}
	}
	
	private void diceRoll(){
		DIE1.roll();
		DIE2.roll();
	}
	
	public int rollDice(){
		diceRoll();
		checkDoubles();
		return getDiceValues();
	}

	private void checkDoubles() {
		// TODO Auto-generated method stub
		
	}

	private int getDiceValues() {
		// TODO Auto-generated method stub
		return DIE1.getValue() + DIE2.getValue();
	}

	public void performSpaceAction(Space space, Owner owner) {
		space.performAction(owner);
	}

	public Space getSpace(int i) {
		// TODO Auto-generated method stub
		return SPACES[i];
	}

}
