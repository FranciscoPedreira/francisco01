## Requirements

- Java 1.8 installed;
- JUnit 1.5 installed;

## Compilation

javac -cp {PATH TO JUNIT JAR} src/main/java/pt/pokemon/Game.java src/main/java/pt/pokemon/Main.java src/test/java/pt/pokemon/TestJUnit.java src/test/java/pt/pokemon/TestRunner.java

## Run

Run single game:
- java src/main/java/pt/pokemon/Main.java [arguments]

Example: java src/main/java/pt/pokemon/Main.java "NESO"

## Run Tests

- java src/main/java/pt/pokemon/TestRunner.java