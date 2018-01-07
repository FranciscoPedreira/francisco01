## Requirements

- Java 1.8 installed - How-To guide: https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html
- JUnit 1.5 installed - How-To guide: https://www.tutorialspoint.com/junit/junit_environment_setup.htm

## Compilation

javac -cp .:(.; on Windows){PATH TO JUNIT JAR} src/main/java/pt/pokemon/Game.java src/main/java/pt/pokemon/Main.java src/test/java/pt/pokemon/TestJUnit.java src/test/java/pt/pokemon/TestRunner.java

## Run

Run single game:
- java main.java.pt.pokemon.Main.java [arguments]

Example: java src.main.java.pt.pokemon.Main "NESO"

## Run Tests

- java -cp .:(.; on Windows){PATH TO JUNIT JAR} main.java.pt.pokemon.TestRunner