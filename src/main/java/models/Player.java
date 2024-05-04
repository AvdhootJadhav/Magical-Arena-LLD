package models;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(){}

    public Player(int health, int strength, int attack) throws Exception {
        if (health < 0 || strength < 0 || attack < 0){
            throw new Exception("Attributes cannot be negative");
        }
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", attack=" + attack +
                '}';
    }
}
