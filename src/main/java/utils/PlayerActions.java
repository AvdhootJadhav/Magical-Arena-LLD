package utils;

import models.Player;

public class PlayerActions {

    public static void performActionsAndUpdateHealth(Player firstPlayer, Player secondPlayer){
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);
        int attackDamage = calculateDamage(firstPlayer);
        int defensePower = calculateDefense(secondPlayer);

        System.out.println("Attack : "+attackDamage+" Defense : "+defensePower);
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

    private static int calculateDamage(Player player){
        int num = rollDie();
        System.out.println("Attack roll : "+num);
        return num*player.getAttack();
    }

    private static int calculateDefense(Player player){
        int num = rollDie();
        System.out.println("Defense Roll : "+num);
        return num*player.getStrength();
    }

    private static int rollDie() {
        return (int)((Math.random()*6)+1);
    }
}
