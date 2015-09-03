package com.usaa.nflopoly.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.usaa.nflopoly.game.Board;
import com.usaa.nflopoly.game.Owner;

public class TestOwner {
	
	Board board;
	
//	@Test
//	public void playerInitialSpaceShouldBeSetToZero(){
//		Owner owner = new Owner(100, board);
//		assertEquals(owner.getCurrentSpace(), board.getSpace(5));
//	}
	
//	@Test
//	public void playerStartingCashValueShouldBeSetCorrectly() throws Exception{
//		Owner owner = new Owner(100, board);
//		assertEquals(owner.getCashAmount(), 100);
//	}
//	
//	@Test
//	public void shouldNotAllowPlayerCreationWithCashValueGreaterThanFiveThousandDollars(){
//		try {
//			Owner owner = new Owner(5001, board);
//			fail("Owner creation should NOT have been allowed with cash value > $5000");
//		}
//		catch(Exception e){
//			assertTrue(e.getMessage().equals("Starting Cash Amount for Owner must be between $0 and $5000"));
//		}
//	}
	
	@Before
	public void setup(){
		board = new Board();
	}
	
	@Test
	public void ownerShouldMoveForwardTheAmountSpecifiedByDiceRoll() throws Exception{
		Owner owner = new Owner(100, board);
		int diceRoll = board.rollDice();
		owner.moveForward(diceRoll);
		//TODO comeback and re test once the spaces are different
		assertEquals(owner.getCurrentSpace().getIndexValue(), diceRoll );
	}

}
