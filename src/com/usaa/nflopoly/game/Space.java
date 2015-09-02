package com.usaa.nflopoly.game;

public class Space {
	private boolean isOwned;
	private Owner owner;
	private String name;
	
	public Space() {
		// default constructor
	}
	
	// getAction method ==> need to look at this
	
	
	public boolean getIsOwned(){
		return isOwned;
	}
	
	public void setIsOwned(boolean ownedStatus){
		isOwned = ownedStatus;
	}
	
	public Owner getOwner(){
		return owner;
	}
	
	public void setOwner(Owner newOwner){
		owner = newOwner;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name = newName;
	}

}
