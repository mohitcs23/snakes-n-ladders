package org.deserve.game;

import org.deserve.game.components.Board;
import org.deserve.game.components.Movable;
import org.deserve.player.Player;

public class SnakesNLadders {

  private Board board;

  public SnakesNLadders(int boardSize, Movable snakes, Movable ladders) {
    this.board = new Board(boardSize, snakes, ladders);
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

    int newPosition = board.getSnakes().getNewPosition(position);
    if (newPosition < position) {
      System.out.println(playerName + " has been bit by Snake located at " + position);
    }
    position = newPosition;
    newPosition = board.getLadders().getNewPosition(position);
    if (newPosition > position) {
      System.out.println(playerName + " has climbed the ladder located at " + position);
    }

    player.setPosition(newPosition);
    System.out.println(playerName + "'s new position : " + newPosition);
  }
}
