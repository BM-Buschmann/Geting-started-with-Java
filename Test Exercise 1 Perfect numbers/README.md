# Übung 1 - Exercise 1

## German

Aufgabenstellung:
*Programm zur Berechnung von Vollkommenen Zahlen:*

Vollkommene Zahlen:

    Eine natürliche Zahl *n* heisst vollkommen, wenn die Summe aller ihrer Teiler (1 und *n* eingeschlossen) gleich 2 *n* ist.

Beispiel:

    Die 6 ist vollkommen, denn 1 + 2 + 3 + 6 = 2 * 6

Man bestimme durch ein Programm alle vollkommenen Zahlen <= 500.
Dazu sollen alle Zahlen zwischen 1 und 500 untersucht werden:

1. Für jede Zahl müssen ihre Teiler bestimmt und aufaddiert werden.
1. Es ist zu prüfen, ob dabei gerade das Doppelte der untersuchten Zahl herauskommt.
    - Man kann nicht a priori davon ausgehen, dass vollkommene Zahlen gerade sind, d.h. man muss wirklich alle Zahlen prüfen, auch die ungeraden.

**Tipp:**
    Sicherlich muss man mit Schleifen und dem Modulo-Operator arbeiten.

## English

Task Description:
*Program to Calculate Perfect Numbers:*

Perfect Numbers:

    A natural number *n* is called perfect if the sum of all its divisors (including 1 and *n*) is equal to 2 *n*.

Example:

    The number 6 is perfect because 1 + 2 + 3 + 6 = 2 * 6.

Write a program to determine all perfect numbers <= 500.
To do this, all numbers between 1 and 500 should be examined:

1. For each number, its divisors need to be determined and added together.
2. It should be checked if the sum is exactly twice the number being examined.
    - It cannot be assumed a priori that perfect numbers are even, so all numbers, including odd ones, must be checked.

Hint:
    It is necessary to use loops and the modulo operator.

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
