package com.usaa.nflopoly.game.spaces;

import com.usaa.nflopoly.game.Owner;

public class PropertySpace extends BaseSpace {
	
	private int value;
	
	public PropertySpace(int indexValue, Boolean isOwned, String name){
		super(indexValue, isOwned, name);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void performAction(Owner owner) {
		return;
		
	}


}
