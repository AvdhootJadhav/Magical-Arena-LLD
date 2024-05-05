package services;

import models.BaseTest;
import models.Player;

public class ArenaTest extends BaseTest {

    public void testStartMatch(){
        try {
            Player firstPlayer = new Player(10, 5, 4);
            Player secondPlayer = new Player(15, 3, 2);
            Arena arena = new Arena();
            String winner = arena.startMatch(firstPlayer, secondPlayer);
            assert winner.equals("Player 1") || winner.equals("Player 2") : "Some error occurred in finding the winner";
        } catch (Exception | AssertionError e) {
            fail("StartMatch", e.getLocalizedMessage());
        }
    }
}
