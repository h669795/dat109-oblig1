package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Oblig1.Board;
import Oblig1.Dice;
import Oblig1.Piece;
import Oblig1.Player;

class metodeTester {

	private Player spiller;
	private Board brett;
	private Dice die;
	private Piece piece;
	
	@BeforeEach
	void init() {
		brett = new Board();
		piece = new Piece(brett);
		spiller = new Player("Nikolai", piece);
		die = new Dice();
	}
	
	
	
	
	
	@Test
	void testVunnet() throws InterruptedException {
		spiller.playTurn(100);
		assertTrue(spiller.vunnet());
	}
	
	@Test
	void testVanligeSquares() throws InterruptedException {
		spiller.playTurn(3);
		assertEquals(piece.index(),3);
		spiller.playTurn(4);
		assertEquals(piece.index(),7);
		
	}
	@Test
	void testStigerOgSlange() throws InterruptedException {
		spiller.playTurn(1);
		assertEquals(piece.index(),38);
		spiller.playTurn(10);
		assertEquals(piece.index(),26);
	}
	@Test
	void testFengsel() throws InterruptedException {
		spiller.playTurn(6);
		spiller.playTurn(6);
		spiller.playTurn(6);
		assertTrue(spiller.erIFengsel());
		spiller.playTurn(6);
		assertFalse(spiller.erIFengsel());
		
		
	}

}
