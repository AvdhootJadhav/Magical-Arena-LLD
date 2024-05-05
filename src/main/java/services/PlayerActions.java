package services;

import models.Player;

public class PlayerActions {

    public static void performActionsAndUpdateHealth(Player firstPlayer, Player secondPlayer){
        int attackPlayerRoll = rollDie();
        int attackDamage = calculateDamage(firstPlayer, attackPlayerRoll);
        int defendPlayerRoll = rollDie();
        int defensePower = calculateDefense(secondPlayer, defendPlayerRoll);

        try {
            if (attackDamage > defensePower){
                int updatedHealth = secondPlayer.getHealth() - (attackDamage - defensePower);
                if (updatedHealth > 0){
                    secondPlayer.setHealth(updatedHealth);
                } else if (updatedHealth < 0){
                    secondPlayer.setHealth(0);
                }
            }
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    private static int calculateDamage(Player player, int num){
        return num*player.getAttack();
    }

    private static int calculateDefense(Player player, int num){
        return num*player.getStrength();
    }

    private static int rollDie() {
        return (int)((Math.random()*6)+1);
    }
}
