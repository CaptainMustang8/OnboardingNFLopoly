package com.usaa.nflopoly.game;

import java.util.ArrayList;

public class Owner {
	private int totalWorth;
	private int cash;
	private boolean inJail;
	private ArrayList<TeamSpace> teams;
	private int currentSpace;
	
	public Owner(){
		// default constructor
	}
	
	public void moveForward(int dieAmount){
		currentSpace += dieAmount;
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
	
	public int getCurrentSpace(){
		return currentSpace;
	}
	
	public void setCurrentSpace(int space){
		currentSpace = space;
	}
}
