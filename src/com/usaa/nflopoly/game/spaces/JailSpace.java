package com.usaa.nflopoly.game.spaces;

import com.usaa.nflopoly.game.Owner;

public class JailSpace extends BaseSpace {

	public JailSpace(int indexValue, String name) {
		super(indexValue, null, name);
	}

	public void performAction(Owner owner) {
		if(owner.getInJailStatus() == true){
			System.out.println(owner.getName() + " is in Jail!");
		}
		else{
			System.out.println(owner.getName() + " is just visiting Jail. For now.");
		}
		
	}

}
