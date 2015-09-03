package com.usaa.nflopoly.game;

import java.util.ArrayList;

import com.usaa.nflopoly.game.spaces.BaseSpace;
import com.usaa.nflopoly.game.spaces.TeamSpace;

public class Owner {
	private int totalWorth;
	private int cash;
	private boolean inJail;
	private ArrayList<TeamSpace> teams;
	private BaseSpace currentSpace;
	private int currentSpaceIndex;
	private Board board;
	
	public Owner(int startingCashAmount, Board board) throws Exception{
		if(startingCashAmount >= 5000 || startingCashAmount < 0){
			throw new Exception("Starting Cash Amount for Owner must be between $0 and $5000");
		}
		this.board = board;
		setCashAmount(startingCashAmount);
		setCurrentSpace(board.getSpace(0));
		setCurrentSpaceIndex(0);
	}
	
	public void moveForward(int dieAmount){
		//TODO fix to actually get a Space object?
		int futureSpaceIndex = getCurrentSpace().getIndexValue() + dieAmount;
		
		//making sure we loop back around the start of the "board" (array)
		if(futureSpaceIndex > 39){
			futureSpaceIndex = futureSpaceIndex - board.getBoardSize();
		}
		setCurrentSpace(board.getSpace(futureSpaceIndex));
		setCurrentSpaceIndex(futureSpaceIndex);
	}

	public int getTotalWorth(){
		return totalWorth;
	}

	public void setTotalWorth(int worth){
		totalWorth = worth;
	}
	
	public int getCashAmount(){
		return cash;
	}
	
	public void setCashAmount(int cashAmount){
		cash = cashAmount;
	}
	
	public boolean getInJailStatus(){
		return inJail;
	}
	
	public void setInJailStatus(boolean jailStatus){
		inJail = jailStatus;
	}
	
	public ArrayList<TeamSpace> getTeams(){
		return teams;
	}
	
	public void setTeams(ArrayList<TeamSpace> ownerTeams){
		teams = ownerTeams;
	}
	
	public void addTeam(TeamSpace team){
		teams.add(team);
	}
	
	public BaseSpace getCurrentSpace(){
		return currentSpace;
	}
	
	public void setCurrentSpace(BaseSpace space){
		currentSpace = space;
	}
	
	public int getCurrentSpaceIndex(){
		return currentSpaceIndex;
	}
	
	public void setCurrentSpaceIndex(int spaceIndex){
		currentSpaceIndex = spaceIndex;
	}

	public void performTurn(int dieAmount) {
		moveForward(dieAmount);
		getCurrentSpace().performAction(this);
	}


	
}
