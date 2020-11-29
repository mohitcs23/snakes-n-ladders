package org.deserve.game;

import org.deserve.game.components.Board;
import org.deserve.player.Player;

public class SnakesNLadders {

  private Board board;

  public SnakesNLadders(int boardSize) {
    this.board = new Board(boardSize);
  }

  public void play(Player player, int diceResult) {

    String playerName = player.getPlayerName();

    int position = player.getPosition();
    if (position == board.getBoardSize()) {
      System.out.println(playerName + " has finished the game.");
      return;
    }
    System.out.println(playerName + " rolled the dice and got : " + diceResult);
    position = position + diceResult;

    player.setPosition(position);
    System.out.println(playerName + "'s new position : " + position);
  }
}
