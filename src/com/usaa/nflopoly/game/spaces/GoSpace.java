package com.usaa.nflopoly.game.spaces;

import com.usaa.nflopoly.game.Owner;

public class GoSpace extends BaseSpace {
	private int value;

	public GoSpace(int indexValue, String name, int moneyValue){
		super(indexValue, null, name);
		setValue(moneyValue);
	}

	public void performAction(Owner owner) {
		// TODO Auto-generated method stub
		owner.setCash(owner.getCash() + getValue());
		System.out.println(owner.getName() + " just passed Go!  They collect $" + getValue());
		
	}
	
	public void setValue(int cashValue){
		value = cashValue;
	}
	
	public int getValue(){
		return value;
	}
}
