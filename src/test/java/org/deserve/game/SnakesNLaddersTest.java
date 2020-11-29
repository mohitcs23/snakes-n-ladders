package org.deserve.game;

import org.deserve.player.Player;
import org.junit.Assert;
import org.junit.Test;

public class SnakesNLaddersTest {

  @Test
  public void testPlay_normalRun() {
    Player player1 = new Player("test player");
    SnakesNLadders snakesNLadders = new SnakesNLadders(100);
    snakesNLadders.play(player1, 5);

    Assert.assertEquals(5, player1.getPosition());
  }

  @Test
  public void testPlay_GameEnd() {
    Player player1 = new Player("test player");
    SnakesNLadders snakesNLadders = new SnakesNLadders(20);
    snakesNLadders.play(player1, 20);
    snakesNLadders.play(player1, 2);
    Assert.assertEquals(20, player1.getPosition());
  }
}
