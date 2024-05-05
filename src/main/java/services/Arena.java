package services;

import models.Player;

public class Arena {

    public String startMatch(Player firstPlayer, Player secondPlayer){
        boolean isFirst = false;
        Player attackPlayer, defensePlayer;
        if (firstPlayer.getHealth() > secondPlayer.getHealth()){
            attackPlayer = secondPlayer;
            defensePlayer = firstPlayer;
        } else {
            attackPlayer = firstPlayer;
            defensePlayer = secondPlayer;
            isFirst = true;
        }
        int round = 1;
        while (attackPlayer.getHealth() > 0 && defensePlayer.getHealth() > 0){
            if (round % 2 != 0){
                PlayerActions.performActionsAndUpdateHealth(attackPlayer, defensePlayer);
            } else {
                PlayerActions.performActionsAndUpdateHealth(defensePlayer, attackPlayer);
            }
            round++;
        }
        return attackPlayer.getHealth() > defensePlayer.getHealth() && isFirst ? "Player 1" : "Player 2";
    }
}
