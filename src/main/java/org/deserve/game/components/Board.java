package org.deserve.game.components;

public class Board {
  private int boardSize;
  private Movable snakes;
  private Movable ladders;

  public Board(int boardSize, Movable snakes, Movable ladders) {
    this.boardSize = boardSize;
    this.snakes = snakes;
    this.ladders = ladders;
  }

  public int getBoardSize() {
    return boardSize;
  }

  public Movable getSnakes() {
    return snakes;
  }

  public Movable getLadders() {
    return ladders;
  }
}
