package services;

import models.BaseTest;
import models.Player;

public class PlayerActionsTest extends BaseTest {
    public void testPerformActionsAndUpdateHealth(){
        try {
            Player firstPlayer = new Player(9, 5, 1);
            Player secondPlayer = new Player(10, 4, 5);
            int currentHealth = secondPlayer.getHealth();
            PlayerActions.performActionsAndUpdateHealth(firstPlayer, secondPlayer);
            assert secondPlayer.getHealth() < currentHealth || secondPlayer.getHealth() == 0 || secondPlayer.getHealth() == currentHealth : "Operation went wrong";
        } catch (AssertionError | Exception e) {
            fail("PerformActionsAndUpdateHealth", e.getLocalizedMessage());
        }
    }
}
