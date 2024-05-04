package models;

import utils.PlayerActions;

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
                int updatedHealth = PlayerActions.getUpdatedHealth(attackPlayer, defensePlayer);
                if (updatedHealth > 0 || updatedHealth == 0){
                    defensePlayer.setHealth(updatedHealth);
                }
            } else {
                int updatedHealth = PlayerActions.getUpdatedHealth(defensePlayer, attackPlayer);
                if (updatedHealth >= 0){
                    attackPlayer.setHealth(updatedHealth);
                }
            }
            round++;
        }
        return attackPlayer.getHealth() > defensePlayer.getHealth() && isFirst ? "Player 1" : "Player 2";
    }
}
