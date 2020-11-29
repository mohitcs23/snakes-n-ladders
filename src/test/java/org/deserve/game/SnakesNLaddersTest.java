package org.deserve.game;

import org.deserve.game.components.Ladders;
import org.deserve.game.components.Movable;
import org.deserve.game.components.Snakes;
import org.deserve.player.Player;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SnakesNLaddersTest {
  private Movable snakes;
  private Movable ladders;
  private Player player;

  @Before
  public void init() {
    player = new Player("test player");
    snakes = new Snakes();
    snakes.add(14, 7);
    ladders = new Ladders();
    ladders.add(10, 15);
  }

  @Test
  public void testPlay_normalRun() {
    SnakesNLadders snakesNLadders = new SnakesNLadders(100, snakes, ladders);
    snakesNLadders.play(player, 5);
    Assert.assertEquals(5, player.getPosition());
  }

  @Test
  public void testPlay_GameEnd() {
    SnakesNLadders snakesNLadders = new SnakesNLadders(20, snakes, ladders);
    snakesNLadders.play(player, 20);
    snakesNLadders.play(player, 2);
    Assert.assertEquals(20, player.getPosition());
  }

  @Test
  public void testPlay_SnakeBite() {
    SnakesNLadders snakesNLadders = new SnakesNLadders(100, snakes, ladders);
    snakesNLadders.play(player, 12);
    snakesNLadders.play(player, 2);
    Assert.assertEquals(7, player.getPosition());
  }

  @Test
  public void testPlay_LadderClimb() {
    SnakesNLadders snakesNLadders = new SnakesNLadders(100, snakes, ladders);
    snakesNLadders.play(player, 7);
    snakesNLadders.play(player, 3);
    Assert.assertEquals(15, player.getPosition());
  }
}
