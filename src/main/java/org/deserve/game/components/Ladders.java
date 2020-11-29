package org.deserve.game.components;

import java.util.HashMap;

public class Ladders implements Movable {
  HashMap<Integer, Integer> ladders = new HashMap();

  public boolean add(int bottom, int top) {
    boolean ladderAdded = false;
    if (bottom < top) {
      ladders.put(bottom, top);
      ladderAdded = true;
    }
    return ladderAdded;
  }

  public int getNewPosition(int bottom) {
    return ladders.get(bottom) != null ? ladders.get(bottom) : bottom;
  }
}
