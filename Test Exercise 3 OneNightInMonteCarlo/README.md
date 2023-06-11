# Übung 1 - Exercise 1

## German

Aufgabenstellung:
*Eine Nacht in MonteCarlo:*

1. Legen Sie ein neues Projekt mit einer ausführbaren Klasse `Casino` an.
1. Mit der Anweisung `k = (int) (Math.random() * 37)` kann man sich eine ganzzahlige Zufallszahl `k` im Bereich [0 … 36] verschaffen. Man interpretiere `k` als das Ergebnis eines Roulette-Wurfs und simuliere folgendes Spiel:
    1. Sie begeben sich mit 10000,-GE Kapital in das Spielkasino und setzen 10,-GE auf Pair.
    1. Sie erhalten nach dem nächsten Spiel 20,-GE ausgezahlt, falls `k` gerade und `k` ungleich Null ist (Gewinn = doppelter Einsatz im Erfolgsfall).
    1. Falls `k` = 0 oder ungerade ist, verlieren Sie Ihren Einsatz.
    1. Sie machen `n` Spiele mit folgender Strategie:
        1. Wenn Sie noch im Besitz von mindestens 10000,-GE sind und das letzte Spiel gewonnen haben, setzen Sie 10,-GE.
        1. Wenn Sie noch im Besitz von mindestens 10000,-GE sind, aber das letzte Spiel verloren haben, verdoppeln Sie Ihren Einsatz.
        1. Wenn Sie nur noch weniger als 10000,-GE haben, setzen Sie das Doppelte Ihres Gesamtverlustes.
        1. Falls Ihr Kapital für den vorgesehenen Einsatz nicht ausreicht, setzen Sie Ihr Restkapital.
        1. Falls Sie den erlaubten Höchsteinsatz von 1000,-GE überschreiten würden, setzen Sie 1000,-GE.
1. Geben Sie für jedes Spiel folgende Werte aus:
    1. Nr. des Spiels
    1. Geworfene Zahl
    1. Kapital vorher
    1. Einsatz
    1. Kapital nachher

## English

Task Description:
*One Night in MonteCarlo:*

1. Create a new project with an executable class called `Casino`.
1. Using the statement `k = (int) (Math.random() * 37)`, generate a random integer `k` in the range [0 ... 36]. Interpret `k` as the result of a roulette spin and simulate the following game:
    1. Start with a capital of 10000 units and place a bet of 10 units on "Pair" (even numbers).
    1. If the next spin results in an even number `k` (excluding zero), you receive a payout of 20 units (double your bet).
    1. If `k` is zero or an odd number, you lose your bet.
    1. Play `n` games with the following strategy:
        1. If you still have at least 10000 units of capital and you won the last game, place a bet of 10 units.
        1. If you still have at least 10000 units of capital but you lost the last game, double your bet.
        1. If you have less than 10000 units of capital, place a bet equal to double your total loss.
        1. If your capital is not sufficient for the intended bet, place a bet equal to your remaining capital.
        1. If you would exceed the maximum allowed bet of 1000 units, place a bet of 1000 units.
1. Display the following values for each game:
    1. Game number
    1. Number spun
    1. Capital before the game
    1. Bet amount
    1. Capital after the game

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
