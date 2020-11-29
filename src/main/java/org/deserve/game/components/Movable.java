package org.deserve.game.components;

public interface Movable {
  boolean add(int start, int end);

  int getNewPosition(int start);
}
