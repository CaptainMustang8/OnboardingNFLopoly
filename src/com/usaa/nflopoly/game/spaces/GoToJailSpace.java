package com.usaa.nflopoly.game.spaces;

import com.usaa.nflopoly.game.Owner;

public class GoToJailSpace extends BaseSpace {

	public GoToJailSpace(int indexValue, String name) {
		super(indexValue, null, name);
		// TODO Auto-generated constructor stub
	}

	public void performAction(Owner owner) {
		//Figure out how to send player to jail square
		owner.setInJailStatus(true);
		System.out.println(owner.getName() + " just got sent to Jail!");
	}

}
