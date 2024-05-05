import models.PlayerTest;

public class MainTest {
    public static void main(String[] args) {
        ClassLoader classLoader = MainTest.class.getClassLoader();
        classLoader.setDefaultAssertionStatus(true);

        // testing Player Class
        PlayerTest playerTest = new PlayerTest();
        playerTest.testPlayerConstructor();
        playerTest.testPlayerToString();
        playerTest.testPlayerGetterAndSetters();
        playerTest.testPlayerConstructorForNegativeAttributes();
        playerTest.testPlayerGetterAndSettersForNegativeValues();

        System.out.println("All tests passed!!");
    }
}
