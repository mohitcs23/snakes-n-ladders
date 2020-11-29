package org.deserve.game.components;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SnakesTest {

  private Snakes snakes;

  @Before
  public void init() {
    snakes = new Snakes();
  }

  @Test
  public void testAdd_Success() {
    boolean added = snakes.add(14, 7);
    Assert.assertTrue(added);
  }

  @Test
  public void testAdd_Failure() {
    boolean added = snakes.add(7, 14);
    Assert.assertFalse(added);
  }

  @Test
  public void testGetNewPosition_NoSnake() {
    int newPosition = snakes.getNewPosition(15);
    Assert.assertEquals(15, newPosition);
  }

  @Test
  public void testGetNewPosition_WithSnake() {
    snakes.add(14, 7);
    int newPosition = snakes.getNewPosition(14);
    Assert.assertEquals(7, newPosition);
  }
}
