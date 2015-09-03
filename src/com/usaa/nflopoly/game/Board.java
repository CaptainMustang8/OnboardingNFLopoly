package com.usaa.nflopoly.game;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.usaa.nflopoly.game.spaces.BaseSpace;
import com.usaa.nflopoly.util.JsonParser;

public class Board {
	
	private static final int BOARD_SIZE = 40;
	private BaseSpace[] SPACES = new BaseSpace[BOARD_SIZE];
	private static final Die DIE1 = new Die();
	private static final Die DIE2 = new Die();
	
	public Board(){
		makeSpaces();
	}
	


	private void makeSpaces() {
		try {
			JsonParser jsonParser = new JsonParser();
			JSONObject jsonOBject = jsonParser.parseFile("spaces.json");

			JSONArray jarr;

			jarr = new JSONArray(jsonOBject.getJSONArray("Spaces").toString());

			for(int i = 0; i < jarr.length(); i++) {
				System.out.println(jarr.getJSONObject(i).toString());
			}


			for(int i = 0; i < BOARD_SIZE; i++){

				//SPACES[i] = s;
			}
		}
		catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
