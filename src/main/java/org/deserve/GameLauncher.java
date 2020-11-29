package org.deserve;

import org.deserve.game.SnakesNLadders;
import org.deserve.game.components.Dice;
import org.deserve.player.Player;

/*
 * This is the starting point for the game.
 * We will create and plug all the components to the game here.
 *
 */
public class GameLauncher {

  public static void main(String[] args) {
    int[] diceFaces = {1, 2, 3, 4, 5, 6};
    Dice dice = new Dice(diceFaces);

    SnakesNLadders game = new SnakesNLadders(100);

    Player player1 = new Player("player 1");

    for (int i = 0; i < 10; i++) {
      game.play(player1, dice.rollDice());
    }
  }
}
