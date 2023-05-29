# Übung 10 - Exercise 10

## German

Aufgabenstellung:
*Berechnung des größten gemeinsamen Teilers*

1. Rekursive und Iterative Ansätze
Es sollen zwei Java-Methoden implementiert werden, um den größten gemeinsamen Teiler (ggT) zweier Zahlen zu ermitteln: eine iterative Methode namens ggTIterativ(a, b) und eine rekursive Methode namens ggTRekursiv(a, b).

1. Iterative Methode: ggTIterativ(a, b)
    - Rückgabetyp: int
    - Parameter: a (int), b (int)
    - Diese Methode verwendet eine iterative Variante des Euklidischen Algorithmus, um den ggT von a und b zu berechnen.
    - Sie gibt den ggT als Ergebnis zurück.
    - Der Pseudo Code als referenz:

        ```java
        euclid_iterative(a, b)
                Wenn a ungleich 0
                    dann gib b zurück
                Sonst
                    Solange b ungleich 0 
                        Wenn a größer b 
                            dann ist a gleich a - b
                        Sonst 
                            dann ist b gleich b - a
                    gib a zurück
        ```

1. Rekursive Methode: ggTRekursiv(a, b)
   - Rückgabetyp: int
   - Parameter: a (int), b (int)
   - Diese Methode verwendet eine rekursive Variante des Euklidischen Algorithmus, um den ggT von a und b zu berechnen.
   - Sie gibt den ggT als Ergebnis zurück.
   - Der Pseudo Code als referenz:

        ```java
        euclid_recursive(a, b)
                Wenn b gleich 0,
                    gib a zurück
                Wenn a gleich 0,
                    gib b zurück
                Wenn a größer als b ist,
                    gib die Methode euclid_recursive(a - b, b) zurück
                Sonst
                    gib die Methode euclid_recursive(a, b - a) zurück
        ```

1. Testen der Methoden
    - Um sicherzustellen, dass die Methoden korrekt funktionieren, sollten sie getestet werden. Es können verschiedene Testfälle mit unterschiedlichen Eingabewerten erstellt werden, um sicherzustellen, dass die Ergebnisse korrekt sind.

## English

Task Description:
*Calculation of the Greatest Common Divisor (GCD)*

1. Recursive and Iterative Approaches
    Two Java methods are to be implemented to determine the greatest common divisor (GCD) of two numbers: an iterative method called iterativeGCD(a, b) and a recursive method called recursiveGCD(a, b).
    1. Iterative Method: iterativeGCD(a, b)
        - Return type: int
        - Parameters: a (int), b (int)
        - This method uses an iterative variant of the Euclidean algorithm to calculate the GCD of a and b.
        - It returns the GCD as the result.
        - The pseudo code as reference:

            ```java
                iterativeGCD(a, b)
                    If a unequal to 0
                        return b 
                    Else
                        While b unequal 0 
                            If a lager than b 
                                a is equal to a - b
                            Sonst 
                                b is equal to b - a
                    return a 
            ```

    1. Recursive Method: recursiveGCD(a, b)
        - Return type: int
        - Parameters: a (int), b (int)
        - This method uses a recursive variant of the Euclidean algorithm to calculate the GCD of a and b.
        - It returns the GCD as the result.
        - The pseudo code as reference:

            ```java
            recursiveGCD(a, b)
                If b is equal to 0,
                    Return a
                If a is equal to 0,
                    Return b
                If a is greater than b,
                    Return the result of recursiveGCD(a - b, b)
                Else,
                    Return the result of recursiveGCD(a, b - a)
            ```

1. Testing the Methods
    - To ensure that the methods work correctly, they should be tested. Various test cases can be created with different input values to verify that the results are correct.

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
