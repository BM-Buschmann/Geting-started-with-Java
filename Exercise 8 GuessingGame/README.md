# Übung 7 - Exercise 7

## German

Aufgabebeschreibung:
*Implementieren Sie ein Ratespiel:*

Programmieren Sie ein Zahlenratespiel. Durch die Anweisung `int geheim = (int) ( 100 * Math.random( ) + 1 );` wird eine Zufallszahl zwischen 1 und 100 generiert. Der Benutzer des Programms soll versuchen, diese Zahl zu erraten. Programmieren Sie dazu eine Schleife, in der in jedem Schleifendurchlauf:

- darüber informiert wird, um den wievielten Rateversuch es sich handelt,
- ein neuer Rateversuch eingegeben werden kann - mittels `IO.promptAndReadInt(…)`,
- und darüber informiert wird, ob die geratene Zahl zu groß, zu klein oder korrekt ist.

Die Schleife soll so lange durchlaufen werden, bis die Zahl erraten ist.

## English

Task Description:
*Implement a Number Guessing Game:*

Implement a number guessing game where the program generates a random number between 1 and 100 using the statement: `int secretNumber = (int) (100 * Math.random() + 1);`. The user of the program should try to guess this number. 

To implement this, create a loop that does the following in each iteration:

- Informs the user about the current guess attempt number.
- Allows the user to enter a new guess using `IO.promptAndReadInt(...)`.
- Informs the user whether the guessed number is too high, too low, or correct.

The loop should continue running until the correct number is guessed.

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
