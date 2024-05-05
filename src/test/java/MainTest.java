import models.PlayerTest;
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

        System.out.println("All tests passed!!");
    }
}
