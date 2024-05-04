package utils;

import models.Player;

public class PlayerActions {

    public static int getUpdatedHealth(Player firstPlayer, Player secondPlayer){
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);
        int attackDamage = calculateDamage(firstPlayer);
        int defensePower = calculateDefense(secondPlayer);

        System.out.println("Attack : "+attackDamage+" Defense : "+defensePower);

        if (attackDamage > defensePower){
            int updatedHealth = secondPlayer.getHealth() - (attackDamage - defensePower);
            if (updatedHealth > 0){
                return updatedHealth;
            } else if (updatedHealth < 0){
                return 0;
            }
        }
        return -1;
    }

    private static int calculateDamage(Player player){
        return rollDie()*player.getAttack();
    }

    private static int calculateDefense(Player player){
        return rollDie()*player.getStrength();
    }

    private static int rollDie() {
        return (int)((Math.random()*6)+1);
    }
}
