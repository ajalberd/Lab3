package pkgPokerBLL;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pkgException.DeckException;
import pkgException.exHand;

public class TestExceptions {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestexHand() throws exHand{
		Hand hand = new Hand();
		hand.AddCardToHand(new Card());
		hand.EvaluateHand();
	}
	@Test
	public void TestexDeck() throws DeckException{ //I want to draw more cards than 52
		Deck deck = new Deck();
		for (int c=1;c<52;c++)
		{
			deck.DrawCard();
		}
		
	}

}
