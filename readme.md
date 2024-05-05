## Magical Arena

### Setup
1) Java Version 17
2) Maven Build tool

### Steps to run the code:
1) Download the source code and open in any IDE of your choice.
2) If you want to change player attributes please make necessary changes in `Main.java`
3) If you are using IntelliJ IDEA then just right-click on the `Main.java` and hit Run.
4) To run the code with the help of CLI follow below steps:

   - Method 1: Using Maven
     - `mvn clean package`
     - `java -classpath target/classes Main`
   - Method 2: Using java
     - `javac Main.java`
     - `java Main`

5) The unit tests are present in `test/java` directory.
6) To run unit test follow below steps:

   - `mvn clean package`
   - `java -classpath target/test-classes:target/classes MainTest`