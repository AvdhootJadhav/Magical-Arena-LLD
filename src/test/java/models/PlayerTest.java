package models;

public class PlayerTest extends BaseTest {
    public void testPlayerConstructor(){
        try {
            Player player = new Player(100, 5, 10);
            assert player.getHealth() == 100 : "Health is not equal";
            assert player.getStrength() == 5 : "Strength is not equal";
            assert player.getAttack() == 10 : "Attack is not equal";
        } catch (Exception | AssertionError e) {
            fail("PlayerConstructor",e.getLocalizedMessage());
        }
    }

    public void testPlayerConstructorForNegativeAttributes(){
        try {
            Player player = new Player(-100, 5, 10);
            fail("PlayerConstructorForNegativeAttributes", "Value of attributes in constructor is positive");
        } catch (Exception e) {
            try{
                assert e.getLocalizedMessage().equals("Attributes cannot be negative") : "Exception message is not same";
            } catch (AssertionError a){
                fail("PlayerConstructorForNegativeAttributes", a.getLocalizedMessage());
            }
        }
    }

    public void testPlayerGetterAndSetters(){
        Player player = new Player();
        try {
            player.setHealth(100);
            player.setAttack(5);
            player.setStrength(10);
            assert player.getAttack() == 5 : "Attack is not equal";
            assert player.getStrength() == 10 : "Strength is not equal";
            assert player.getHealth() == 100 : "Health is not equal";
        } catch (Exception | AssertionError e) {
            fail("PlayerGetterAndSetters",e.getLocalizedMessage());
        }
    }

    public void testPlayerGetterAndSettersForNegativeValues(){
        Player player = new Player();
        try{
            player.setHealth(-1);
            fail("PlayerGetterAndSettersForNegativeValues", "Value of 'health' attribute is positive");
        } catch (Exception e){
            try {
                assert e.getLocalizedMessage().equals("'health' attribute cannot be negative") : "Exception message is not same";
            } catch (AssertionError a){
                fail("PlayerGetterAndSettersForNegativeValues", a.getLocalizedMessage());
            }
        }

        try{
            player.setAttack(-1);
            fail("PlayerGetterAndSettersForNegativeValues", "Value of 'attack' attribute is positive");
        } catch (Exception e){
            try {
                assert e.getLocalizedMessage().equals("'attack' attribute cannot be negative") : "Exception message is not same";
            } catch (AssertionError a){
                fail("PlayerGetterAndSettersForNegativeValues", a.getLocalizedMessage());
            }
        }

        try{
            player.setStrength(-1);
            fail("PlayerGetterAndSettersForNegativeValues", "Value of 'strength' attribute is positive");
        } catch (Exception e){
            try {
                assert e.getLocalizedMessage().equals("'strength' attribute cannot be negative") : "Exception message is not same";
            } catch (AssertionError a){
                fail("PlayerGetterAndSettersForNegativeValues", a.getLocalizedMessage());
            }
        }
    }

    public void testPlayerToString(){
        Player player = new Player();
        try {
            player.setHealth(10);
            player.setAttack(5);
            player.setStrength(1);
            assert player.toString().equals("Player{health=10, strength=1, attack=5}") : "The String value do not match";
        } catch (Exception | AssertionError e) {
            fail("PlayerToString",e.getLocalizedMessage());
        }
    }
}
