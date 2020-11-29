package org.deserve.game.components;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LaddersTest {

  private Ladders ladders;

  @Before
  public void init() {
    ladders = new Ladders();
  }

  @Test
  public void testAdd_Success() {
    boolean added = ladders.add(10, 70);
    Assert.assertTrue(added);
  }

  @Test
  public void testAdd_Failure() {
    boolean added = ladders.add(70, 10);
    Assert.assertFalse(added);
  }

  @Test
  public void testGetNewPosition_NoLadder() {
    int newPosition = ladders.getNewPosition(15);
    Assert.assertEquals(15, newPosition);
  }

  @Test
  public void testGetNewPosition_WithLadder() {
    ladders.add(10, 70);
    int newPosition = ladders.getNewPosition(10);
    Assert.assertEquals(70, newPosition);
  }
}
