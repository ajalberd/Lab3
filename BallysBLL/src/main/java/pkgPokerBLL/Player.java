package pkgPokerBLL;

import java.util.UUID;

public class Player {

	private UUID PlayerID;
	private String PlayerName;
	
	public Player(String playerName) {
		super();
		PlayerID = UUID.randomUUID();
		PlayerName = playerName;
	}

//ADDED: Getters and setters for Player	
	
	public UUID getPlayerID() {
		return PlayerID;
	}

	public void setPlayerID(UUID playerID) {
		PlayerID = playerID;
	}

	public String getPlayerName() {
		return PlayerName;
	}

	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}

}
