package org.deserve.game.components;

import java.util.HashMap;

public class Snakes implements Movable {
  HashMap<Integer, Integer> snakes = new HashMap();

  public boolean add(int head, int tail) {
    boolean snakeAdded = false;
    if (head > tail) {
      snakes.put(head, tail);
      snakeAdded = true;
    }
    return snakeAdded;
  }

  public int getNewPosition(int head) {
    return snakes.get(head) != null ? snakes.get(head) : head;
  }
}
