package org.deserve;

import org.deserve.game.SnakesNLadders;
import org.deserve.game.components.Dice;
import org.deserve.game.components.Ladders;
import org.deserve.game.components.Movable;
import org.deserve.game.components.Snakes;
import org.deserve.player.Player;

/*
 * This is the starting point for the game.
 * We will create and plug all the components to the game here.
 */
public class GameLauncher {

  public static void main(String[] args) {
    int[] diceFaces = {1, 2, 3, 4, 5, 6};
    Dice dice = new Dice(diceFaces);

    Movable ladders = createLadders();
    Movable snakes = createSnakes();

    SnakesNLadders game = new SnakesNLadders(100, snakes, ladders);

    Player player1 = new Player("player 1");

    for (int i = 0; i < 10; i++) {
      game.play(player1, dice.rollDice());
    }

    diceFaces = new int[] {2, 4, 6};
    Dice crookedDice = new Dice(diceFaces);

    Player player2 = new Player("player 2");

    for (int i = 0; i < 10; i++) {
      game.play(player2, crookedDice.rollDice());
    }
  }

  private static Movable createLadders() {
    Movable ladders = new Ladders();
    ladders.add(3, 10);
    ladders.add(15, 30);
    ladders.add(21, 51);
    ladders.add(45, 67);
    ladders.add(60, 98);
    ladders.add(70, 90);
    return ladders;
  }

  private static Movable createSnakes() {
    Movable snakes = new Snakes();
    snakes.add(14, 7);
    snakes.add(37, 2);
    snakes.add(42, 29);
    snakes.add(69, 51);
    snakes.add(83, 71);
    snakes.add(99, 23);
    return snakes;
  }
}
