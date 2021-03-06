package pkgPokerBLL;

import java.util.Comparator;
import pkgPokerEnum.eRank;
import pkgPokerEnum.eSuit;

public class Card implements Comparable {
	private eRank eRank;
	private eSuit eSuit;
	private int iCardNbr;
	private boolean Wilds;

	public Card() {
	}

	public Card(eRank eRank, eSuit eSuit, int iCardNbr) {
		this.eRank = eRank;
		this.eSuit = eSuit;
		this.iCardNbr = iCardNbr;
		if (eSuit == eSuit.JOKER) {
			this.Wilds = true;
		} else {
			this.Wilds = false;
		}
	}

	public Card(eSuit eSuit, eRank eRank, int iCardNbr) {
		this.eRank = eRank;
		this.eSuit = eSuit;
		this.iCardNbr = iCardNbr;
	}

	public eRank geteRank() {
		return eRank;
	}

	public eSuit geteSuit() {
		return eSuit;
	}

	public int getiCardNbr() {
		return iCardNbr;
	}

	public void seteRank(eRank eRank) {
		this.eRank = eRank;
	}

	public void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}

	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());
	}

	public boolean isWilds() {
		return Wilds;
	}

	public void setWilds(boolean wilds) {
		Wilds = wilds;
	}

	public static Comparator<Card> CardRank = new Comparator<Card>() {
		public int compare(Card c1, Card c2) {
			int Cno1 = c1.geteRank().getiRankNbr();
			int Cno2 = c2.geteRank().getiRankNbr();
			/* For descending order */
			return Cno2 - Cno1;
		}
	};
}
