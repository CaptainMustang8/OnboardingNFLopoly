package com.usaa.nflopoly.game.spaces;

import com.usaa.nflopoly.game.Owner;

public class TeamSpace extends PropertySpace {

	public TeamSpace(int indexValue, Boolean isOwned, String name, int teamValue) {
		super(indexValue, isOwned, name, teamValue);
	}

	public void performAction(Owner owner) {
		
		//If there is an owner, and it is not YOU, pay rent to actual owner. 
		System.out.println(owner.getCash());
		if(getOwner() == null){
			owner.buyTeam(getValue());
			System.out.println(owner.getName() + " just bought " + getName() + " for $" + getValue());
		}
		else if(!getOwner().equals(null) && !getOwner().equals(owner)){
			
			//rent value is value of space divided by 4 
			owner.payRent((getValue()/4), getOwner());
			
			System.out.println(owner.getName() + " just landed on  " + getName() +
								" and paid " + getOwner().getName() +  " $" + getValue()/4);
		}
		//if there isn't an owner, buy the property  

	}
	
	
	
	

}
