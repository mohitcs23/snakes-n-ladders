package org.deserve.game.components;

import java.util.Random;

public class Dice {
  private int[] diceFaces;

  public Dice(int[] diceFaces) {
    this.diceFaces = diceFaces;
  }

  public int rollDice() {
    int rnd = new Random().nextInt(diceFaces.length);
    return diceFaces[rnd];
  }
}
