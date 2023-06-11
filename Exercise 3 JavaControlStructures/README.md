# Übung 3 - Exercise 3

## German

Aufgabenbeschreibung:
*Führen Sie kleine Tests bezüglich der Java-Kontrollstrukturen durch:*

1. **Was ist die Ausgabe der Schleife? Wie interpretiert der Compiler den Code?**
    
    ```java
    int i = 0;
    while (i < 10); {
        i++;
        System.out.println("Wert = " + i);
    }
    ```

1. **Durch welche Initialisierung von `d` würde die folgende Schleife zu einer Endlosschleife werden?**

    ```java
    double d = ...;
    while (d == d + 1)
        System.out.println("läuft");
    ```

1. **Durch welche Initialisierung von `d` würde die folgende Schleife zu einer Endlosschleife werden?**

    ```java
    double d = ...;
    while (d != d)
        System.out.println("läuft");
    ```

1. **Welche der folgenden Konstrukte kompilieren - welche nicht - und wie denkt der Compiler?**
   (Es wird angenommen, dass die erste und letzte Zeile jedes Mal vorhanden sind, aber nur die zweite, dritte oder vierte Zeile verwendet wird.)

    ```java
   int n, a = 5;
   // while (a < 10) {
   //     n = 1;
   //     a++;
   // }
   // do {
   //     n = 1;
   //     a++;
   // } while (a < 10);
   // for (int i = 0; i < 10; i++) {
   //     n = 10;
   // }
   int b = n;
   ```

## English

Task Description:
*Perform small tests regarding Java control structures:*

1. **What is the output of the loop? How does the compiler interpret the coding?**

    ```java
    int i = 0;
    while (i < 10); {
        i++;
        System.out.println("Wert = " + i);
    }
    ```

1. **By which initialization of `d` would the following loop become an infinite loop?**

    ```java
    double d = ...;
    while (d == d + 1)
        System.out.println("läuft");
    ```

1. **By which initialization of `d` would the following loop become an infinite loop?**

    ```java
    double d = ...;
    while (d != d)
        System.out.println("läuft");
    ```

1. **Which of the following constructs compile - which do not - and how does the compiler think?**
   (Assuming the first and last lines are present each time, but only the second, third, or fourth line is used.)

    ```java
   int n, a = 5;
   // while (a < 10) {
   //     n = 1;
   //     a++;
   // }
   // do {
   //     n = 1;
   //     a++;
   // } while (a < 10);
   // for (int i = 0; i < 10; i++) {
   //     n = 10;
   // }
   int b = n;
   ```

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
