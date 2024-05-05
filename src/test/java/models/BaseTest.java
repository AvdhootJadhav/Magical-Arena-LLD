package models;

public class BaseTest {
    protected static void fail(String testName, String message){
        System.err.printf("%s Test failed : %s%n", testName, message);
        System.exit(1);
    }
}
