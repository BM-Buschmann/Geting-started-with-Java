# Übung 12 - Exercise 12

## German

Aufgabenstellung:
*Implementierung eines Nullsummen-Gewinnspiels*

1. Einführung:
    - Schreiben Sie ein Nullsummen-Gewinnspiel, bei dem die Spieler A und B gegeneinander antreten. Jeder Spieler hat das gleiche Anfangskapital. Es wird anfangs eine Wahrscheinlichkeit p festgelegt, mit der Spieler A gewinnt. Das Spiel läuft solange, bis ein Spieler ruiniert ist. Am Ende wird ausgegeben, wer gewonnen hat und wie groß das Verhältnis der Gewinnzüge von A zur Gewinnzüge von B ist.

1. Klassenstruktur:
    1. Es sollen zwei Klassen angelegt werden:
        - Die nichtausführbare Klasse "**Spieler**"
        - Die ausführbare Klasse "**Spiel**" (mit main-Methode)

    1. Klasse "Spieler":
        1. Private Attribute:
           - **geld:** Das aktuelle Kapital des Spielers
           - **zahlGewinnzuege:** Die Anzahl der Gewinnzüge des Spielers
        1. Parametrisierter Konstruktor:
           - **Spieler(int g):** Setzt das Attribut "**geld**" auf den Anfangswert g und "**zahlGewinnzuege**" auf 0
        1. Öffentliche Methoden:
           - **geldBewegen(int b):** Verändert den Wert von "**geld**" um den Betrag b
           - **kannSpielen():** Gibt true zurück, wenn "**geld**" größer als 0 ist, andernfalls false
           - **gewinnZug():** Zählt das Attribut "**zahlGewinnzuege**" um 1 hoch
           - **getGewinnzuege():** Gibt den Wert des Attributs "**zahlGewinnzuege**" zurück
    1. Klasse "Spiel":
        1. Hauptmethode (main):
            - Der Benutzer gibt die Höhe des Anfangskapitals beider Spieler ein
            - Der Benutzer gibt die Wahrscheinlichkeit p ein (0 < p < 1), dass A gewinnt
            - Es werden die Spieler-Objekte A und B erzeugt
            - Spiellogik:
                - Solange beide Spieler weiterspielen können:
                    - Ziehen einer Zufallszahl zwischen 0 und 1 mit Math.random()
                    - Überprüfen, wer gewonnen hat, basierend auf den Regeln des Spiels
                    - Der Gewinner erhält +1, der Verlierer -1 als Geldbewegung
                    - Die Anzahl der Gewinnzüge des Gewinners wird erhöht
                - Wenn ein Spieler ruiniert ist, wird ausgegeben, wer gewonnen hat
        1. Ausgabe der Ergebnisse:
            - Das Verhältnis der Zahl der Gewinnzüge von A zur Zahl der Gewinnzüge von B wird berechnet und auf zwei Kommastellen gerundet ausgegeben

## English

Task Description:
*Implementation of a Zero-Sum Game*

1. Introduction:
    - Write a zero-sum game where players A and B compete against each other. Each player starts with the same initial capital. A probability p is set initially, representing the likelihood of player A winning. The game continues until one player is bankrupt. At the end, it outputs who has won and the ratio of the number of wins by A to the number of wins by B.
1. Class Structure:
    1. Two classes should be created:
        - The non-executable class "Player"
        - The executable class "Game" (with the main method)
    1. Class "Player":
        - Private attributes:
            - **money:** The current capital of the player
            - **numWins:** The number of wins by the player
        - Parameterized constructor:
            - **Player(int initialMoney):** Sets the **money** attribute to the initial value **initialMoney** and **numWins** to 0.
        - Public methods:
            - **moveMoney(int amount):** Modifies the value of **money** by the specified **amount**
            - **canPlay():** Returns true if **money** is greater than 0, otherwise false
            - **recordWin():** Increments the value of **numWins** by 1
            - **getWins():** Returns the value of the **numWins** attribute
    1. Class "Game":
        - Main method:
            - The user inputs the initial capital for both players.
            - The user inputs the probability p (0 < p < 1) of player A winning.
            - Player objects A and B are created.
        - Game logic:
            - While both players can continue playing:
                - Generate a random number between 0 and 1 using **Math.random()**
                - Determine the winner based on the game rules
                - The winner receives +1, and the loser receives -1 as a money movement
                - The number of wins for the winner is incremented
            - Once a player is bankrupt, output the winner.
        - Output of the results:
            - The ratio of the number of wins by A to the number of wins by B is calculated and displayed rounded to two decimal places.

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
