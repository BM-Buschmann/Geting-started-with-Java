# Übung 1 - Exercise 1

## German

Aufgabebeschreibung:
*Methode zum Finden von Primzahlen:*

Implementieren Sie die folgenden Methoden zum Finden von Primzahlen:

1. `countPrimes(int max)`: Diese Methode zählt die Anzahl der Primzahlen im Bereich von 1 bis `max`. Sie verwendet intern die Methode `isPrime` und gibt die Anzahl der Primzahlen zurück.

2. `isPrime(int n)`: Diese Methode bestimmt, ob eine Zahl `n` eine Primzahl ist. Sie gibt `true` zurück, wenn `n` eine Primzahl ist, andernfalls `false`. Sie überprüft, ob die Zahl `n` durch Zahlen zwischen 2 und `n/2` ohne Rest teilbar ist.

Testen Sie die Methode `countPrimes`, indem Sie sie aus der `main`-Methode mit verschiedenen Werten aufrufen und das Ergebnis (Anzahl der Primzahlen) auf der Konsole ausgeben.

### Methodensignaturen

```java
public static int countPrimes(int max)
public static boolean isPrime(int n)
```

## English

Task Description:
*Method for Finding Prime Numbers:*

Implement the following methods for finding prime numbers:

1. `countPrimes(int max)`: This method counts the number of prime numbers in the range between 1 and `max`. It internally uses the `isPrime` method and returns the count of prime numbers.

2. `isPrime(int n)`: This method determines whether a number `n` is a prime number. It returns `true` if `n` is a prime number and `false` otherwise. It checks if the number `n` can be evenly divided by numbers between 2 and `n/2`.

Test the `countPrimes` method by calling it from the `main` method with different values and print the result (number of prime numbers) on the console.

### Method Signatures

```java
public static int countPrimes(int max)
public static boolean isPrime(int n)
```

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
