package com.usaa.nflopoly.game.spaces;

import com.usaa.nflopoly.game.Owner;

public class TeamSpace extends PropertySpace {

	public TeamSpace(int indexValue, Boolean isOwned, String name) {
		super(indexValue, isOwned, name);
	}

	public void performAction(Owner owner) {
		
		//If there is an owner, and it is not YOU, pay rent to actual owner. 
		if(!super.getOwner().equals(null) && !super.getOwner().equals(owner)){
			owner.payRent(getValue(), getOwner());
			System.out.println(owner.getName() + " just landed on  " + getName() +
								" and paid " + getOwner().getName() +  " $" + getValue());
		}
		//if there isn't an owner, buy the property  
		else if(getOwner().equals(null)){
			owner.buyTeam(getValue());
			System.out.println(owner.getName() + " just bought " + getName() + " for $" + getValue());
		}
	}
	
	
	
	

}
