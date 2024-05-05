import models.PlayerTest;
import services.ArenaTest;
import services.PlayerActionsTest;

public class MainTest {
    public static void main(String[] args) {
        ClassLoader classLoader = MainTest.class.getClassLoader();
        classLoader.setDefaultAssertionStatus(true);

        // testing Player
        PlayerTest playerTest = new PlayerTest();
        playerTest.testPlayerConstructor();
        playerTest.testPlayerToString();
        playerTest.testPlayerGetterAndSetters();
        playerTest.testPlayerConstructorForNegativeAttributes();
        playerTest.testPlayerGetterAndSettersForNegativeValues();

        // testing PlayerActions
        PlayerActionsTest playerActionsTest = new PlayerActionsTest();
        playerActionsTest.testPerformActionsAndUpdateHealth();

        //testing Arena
        ArenaTest arenaTest = new ArenaTest();
        arenaTest.testStartMatch();

        System.out.println("All tests passed!!");
    }
}
