package org.deserve.game.components;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DiceTest {

  @Test
  public void test_rollDice() {

    int[] diceFaces = {1, 2, 3, 4, 5, 6};
    Set<Integer> possibleResults = new HashSet<Integer>();
    for (int face : diceFaces) {
      possibleResults.add(face);
    }
    Dice dice = new Dice(diceFaces);

    Assert.assertTrue(possibleResults.contains(dice.rollDice()));
  }
}
