# Übung 4 - Exercise 4

## German

Aufgabenstellung:
*Machen Sie kleine Tests mit den primitiven Java-Datentypen*

1. Welchen Fehler und warum liefert folgendes Coding? Wie lässt sich der Fehler beheben?

    1. Kopiere den Code

        ```java
        char c1 = 'N';
        short s1 = 'N';
        short s11 = c1;
        ```

    1. Kopiere den Code

        ```java
        int n2 = 100;
        short s2 = 100;
        char c2 = 100;
        c2 = (char) n2;
        c2 = (char) s2;
        ```

1. Welche Ausgabe liefert jeweils folgendes Coding - und warum?

    1. Kopiere den Code

        ```java
        double d1 = 0.2;
        float f1 = 0.2f;
        System.out.println(d1 == f1);
        ```

    1. Kopiere den Code

        ```java
        double d2 = 1E30;
        double d3 = 1.1;
        System.out.println("Wert m " + (d2 + d3));
        ```

    1. Kopiere den Code

        ```java
        float f2 = 1.0f / 3;
        System.out.println("Wert " + f2);
        float f22 = (float) (1.0 / 3);
        System.out.println("Wert " + f22);
        ```

    1. Kopiere den Code

        ```java
        double d4 = (1.0f / 3);
        System.out.println("Wert " + d4);
        double d44 = 1.0 / 3;
        System.out.println("Wert " + d44);
        ```

1. Es wird folgende Iteration verwendet:

    ```java
    float dy = 1E-10f;
    float yn = 1f;
    int i = 0;
    
    while (yn < 10.0) {
        yn = yn + dy;
        i++;
        System.out.println("Iteration: " + i + " yn = " + yn);
    }
    ```

    // Zu erwarten ist ein Anwachsen von yn.
    Wie beurteilen Sie die numerische Korrektheit des Programmfragments? Änderung?

1. Welchen Wert hat die Variable b - warum?  

    ```java
    boolean b = true && false == true && false;
    ```

1. Wie könnte man durch ein elementares Programm ermitteln, an welcher Stelle  
der UC-Tabelle das Zeichen '@' steht?

1. Der maximal darstellbare int-Wert lässt sich abgreifen durch `Integer.MAX_VALUE`.  
Wie sieht eine Coding-Strecke aus, die damit sicherstellt, dass für `int a`, `b > 0` die  
Berechnung `a + b` nur durchgeführt wird, wenn kein Überlauf stattfindet.

1. In welchem Zweig landet man durch folgendes Coding:  

    ```java
    boolean b = false;
    if (b == false) {
        /* … 1 … */
    } else {
        /* … */
    }
    ```

    Könnte einem der analoge Fall auch mit `b` vom Typ `int` (`if (x == 1) …`) passieren?

1. Warum liefern die folgenden Operationen das selbe Resultat?  

    ```java
    byte a = 4;
    byte b = 16;
    
    System.out.println("Wert = " + (a + b));
    System.out.println("Wert = " + (a | b));
    System.out.println("Wert = " + (a ^ b));
    System.out.println("Wert = " + (a & b));
    ```

## English

Task Description:
*Switch Statement + Loop*

1. What Errors does this code produce and how would you fix

    1. Copy the following code.

        ```java
        char c1 = 'N';
        short s1 = 'N';
        short s11 = c1;
        ```

    1. Copy the following code.

        ```java
        int n2 = 100;
        short s2 = 100;
        char c2 = 100;
        c2 = (char) n2;
        c2 = (char) s2;
        ```

1. What output does the following code produce, and why?

    1. Copy the following code.

        ```java
        double d1 = 0.2;
        float f1 = 0.2f;
        System.out.println(d1 == f1);
        ```

    1. Copy the following code.

        ```java
        double d2 = 1E30;
        double d3 = 1.1;
        System.out.println("Value m " + (d2 + d3));
        ```

    1. Copy the following code.

        ```java
        float f2 = 1.0f / 3;
        System.out.println("Value " + f2);
        float f22 = (float) (1.0 / 3);
        System.out.println("Value " + f22);
        ```

    1. Copy the following code.

        ```java
        double d4 = (1.0f / 3);
        System.out.println("Value " + d4);
        double d44 = 1.0 / 3;
        System.out.println("Value " + d44);
        ```

1. The following iteration is used:

    ```java
    float dy = 1E-10f;
    float yn = 1f;
    int i = 0;
    
    while (yn < 10.0) {
        yn = yn + dy;
        i++;
        System.out.println("Iteration: " + i + " yn = " + yn);
    }
    ```

    // Expect yn to increase. How do you assess the numerical correctness of the program fragment? Any changes needed?

1. What value does the variable `b` have, and why?

    ```java
    boolean b = true && false == true && false;
    ```

1. How could you determine, through a simple program, at which position in the ASCII table the character '@' is located?

1. The maximum representable `int` value can be obtained using `Integer.MAX_VALUE`. How would you write a code segment that ensures, for `int a`, `b > 0`, that the calculation `a + b` is only performed if no overflow occurs?

1. Which branch will be executed in the following code:

    ```java
    boolean b = false;
    if (b == false) {
        /* ... 1 ... */
    } else {
        /* ... */
    }
    ```

    Could a similar case happen with `b` of type `int` (`if (x == 1) ...`)?

1. Why do the following operations yield the same result?

    ```java
    byte a = 4;
    byte b = 16;
    
    System.out.println("Value = " + (a + b));
    System.out.println("Value = " + (a | b));
    System.out.println("Value = " + (a ^ b));
    System.out.println("Value = " + (a & b));
    ```

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
