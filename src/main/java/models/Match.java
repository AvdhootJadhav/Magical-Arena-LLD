package models;

public class Match {

    public String startFight(Player firstPlayer, Player secondPlayer){
        Boolean isFirst = false;
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
        int dieNumber;
        int damage;
        int defend;
        Die die = new Die();
        while (attackPlayer.getHealth() > 0 && defensePlayer.getHealth() > 0){
            dieNumber = die.roll();
            System.out.println("First Roll : "+dieNumber);
            if (round % 2 != 0){
                damage = attackPlayer.getAttack()*dieNumber;
                dieNumber = die.roll();
                System.out.println("Second Roll : "+dieNumber);
                defend = defensePlayer.getStrength()*dieNumber;
                if (damage > defend) {
                    if ((defensePlayer.getHealth() - (damage - defend)) < 0){
                        defensePlayer.setHealth(0);
                    }
                    else defensePlayer.setHealth(defensePlayer.getHealth() - (damage - defend));
                }
            } else {
                damage = defensePlayer.getAttack()*dieNumber;
                dieNumber = die.roll();
                System.out.println("Second Roll : "+dieNumber);
                defend = attackPlayer.getStrength()*dieNumber;
                if (damage > defend) {
                    if ((attackPlayer.getHealth() - (damage - defend)) < 0){
                        attackPlayer.setHealth(0);
                    }
                    else attackPlayer.setHealth(attackPlayer.getHealth() - (damage - defend));
                }
            }
            round++;
            System.out.println("Player stats : "+attackPlayer);
            System.out.println("Player stats : "+defensePlayer);
        }
        return attackPlayer.getHealth() > defensePlayer.getHealth() && isFirst ? "Player 1" : "Player 2";
    }
}
