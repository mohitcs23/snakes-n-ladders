package org.deserve.player;

public class Player {

  private static final int INITIAL_POSITION = 0;
  private String playerName;
  private int position;

  public Player(String playerName) {
    this.playerName = playerName;
    this.position = INITIAL_POSITION;
  }

  public String getPlayerName() {
    return playerName;
  }

  public int getPosition() {
    return position;
  }

  public void setPosition(int position) {
    this.position = position;
  }
}
