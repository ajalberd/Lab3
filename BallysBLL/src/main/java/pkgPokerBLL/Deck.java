package pkgPokerBLL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

import pkgException.DeckException;
import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Deck {
	private UUID DeckID;
	private ArrayList<Card> DeckCards = new ArrayList<Card>();

	public UUID getDeckID() {
		return DeckID;
	}

	public void setDeckID(UUID deckID) {
		DeckID = deckID;
	}

	public ArrayList<Card> getDeckCards() {
		return DeckCards;
	}

	public void setDeckCards(ArrayList<Card> deckCards) {
		DeckCards = deckCards;
	}

	public Deck() {
		super();
		int iCardNbr = 0;
		for (eSuit suit : eSuit.values()) {
			for (eRank rank : eRank.values()) {
				if ((suit != eSuit.JOKER) && (rank != eRank.JOKER)) {
					DeckCards.add(new Card(rank, suit, ++iCardNbr));
				}
			}
		}
		Collections.shuffle(DeckCards);
	}

	public Deck(ArrayList<Card> numOfWildes) {
		this();
		for (Card c : numOfWildes) {
			for (Card x : DeckCards) {
				if (x == c) {
					x.setWilds(true);
				}
			}
		}
	}



	// public Card DrawCard() {
	//
	// return DeckCards.remove(0);
	// }
	// }

	public int DrawCard() throws DeckException {
		if (DeckCards.size() == 0)
			throw new DeckException("The deck is empty or out of cards!");
		else
			return DeckCards.size(); // have to return something in the array,
										// not sure if needed
	}
}
