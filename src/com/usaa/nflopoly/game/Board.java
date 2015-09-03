package com.usaa.nflopoly.game;

import com.usaa.nflopoly.game.spaces.BaseSpace;

public class Board {
	
	private static final int BOARD_SIZE = 40;
	private BaseSpace[] SPACES = new BaseSpace[BOARD_SIZE];
	private static final Die DIE1 = new Die();
	private static final Die DIE2 = new Die();
	
	public Board(){
		makeSpaces();
	}

	private void makeSpaces() {
		for(int i = 0; i < BOARD_SIZE; i++){
			BaseSpace s = new BaseSpace(i);
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
		return DIE1.getValue() + DIE2.getValue();
	}

	public BaseSpace getSpace(int i) {
		return SPACES[i];
	}

	public int getBoardSize() {
		return BOARD_SIZE;
	}



}
