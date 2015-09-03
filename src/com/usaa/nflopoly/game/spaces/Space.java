package com.usaa.nflopoly.game.spaces;

import com.usaa.nflopoly.game.Owner;

public class Space {
	private boolean isOwned;
	private int indexValue;
	private Owner owner;
	private String name;
	
	public Space(int indexValue) {
		this.indexValue = indexValue;
	}	
	
	public int getIndexValue() {
		return indexValue;
	}

	public void setIndexValue(int indexValue) {
		this.indexValue = indexValue;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

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

	public void performAction(Owner o) {
		// TODO Auto-generated method stub
		
	}

}
