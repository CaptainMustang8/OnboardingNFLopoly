package com.usaa.nflopoly.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.usaa.nflopoly.game.Board;
import com.usaa.nflopoly.game.Owner;
import com.usaa.nflopoly.game.spaces.TeamSpace;

public class TestTeamSpace {
	
	Board board;
	Owner owner1;
	Owner owner2;
	
	@Before
	public void setup() throws Exception{
		board = new Board();
		owner1 = new Owner(500, board, "player1");
		owner2 = new Owner(500, board, "player2");
	}
	
	
	@Test
	public void playerShouldPayRentWhenSpaceIsOwnedByDifferentPlayer(){
		TeamSpace testSpace = new TeamSpace(1, true, "Cowboys", 200);
		testSpace.setOwner(owner2);
		owner1.setCurrentSpace(testSpace);
		testSpace.performAction(owner1);
		
		assertEquals(owner1.getCash(), 450);
		assertEquals(owner2.getCash(), 550);

	}
	
	@Test
	public void playerCashValueShouldLowerByTeamValueWhenPurchasing(){
//		TeamSpace testSpace = new TeamSpace(1, false, "Cowboys", 200);
//		owner1.setCurrentSpace(testSpace);
//		testSpace.performAction(owner1);
//		
//		assertEquals(owner1.getCash(), 301);
		
		TeamSpace testSpace = new TeamSpace(1, true, "Cowboys", 200);

		owner1.setCurrentSpace(testSpace);
		testSpace.performAction(owner1);
		assertEquals(owner1.getCash(), 300);


	}

}
