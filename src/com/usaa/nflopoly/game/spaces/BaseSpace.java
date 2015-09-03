package com.usaa.nflopoly.game.spaces;

import com.usaa.nflopoly.game.Owner;

public abstract class BaseSpace {
	
	private boolean isOwned = false;
	private int indexValue = -1;
	private Owner owner = null;
	private String name = null;
	
	public BaseSpace(int indexValue, Boolean isOwned, String name){
		setIndexValue(indexValue);
		setIsOwned(isOwned);
		setName(name);
	}
	
	public int getIndexValue(){
		return indexValue;
	}
	
	public void setIndexValue(int indexValue){
		this.indexValue = indexValue;
	}
	
	public void setIsOwned(boolean isOwned){
		this.isOwned = isOwned;
	}
	
	public boolean getIsOwned(){
		return isOwned;
	}
	
	public Owner getOwner(){
		if(owner == null){
			return null;
		}
		return owner;
	}
	
	public void setOwner(Owner owner){
		System.out.println("in base space");
		this.owner = owner;
	}
	
	public String getName(){
		return name;
	};
	
	public void setName(String newName){
		this.name = newName;
	}
	public abstract void performAction(Owner owner);
	
}
