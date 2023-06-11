# Übung 1 - Exercise 1

## German

Aufgabenstellung:
*Lösen der folgenden Gleichung - Bestimmung des Wertes von x, der die Gleichung löst:*

x = 2 - e^(-x)

1. Um diese Gleichung zu lösen, befolgen Sie bitte diese Schritte:
    - Starten Sie mit dem Anfangswert x = 1.0 (andere Anfangswerte können ebenfalls korrekte Ergebnisse liefern).
    - Setzen Sie den Wert von x in die rechte Seite der Gleichung ein und weisen Sie das Ergebnis x zu.
    - Wiederholen Sie diesen Prozess, indem Sie den neuen Wert von x erneut in die Gleichung einsetzen und so weiter.
    - Nach einigen Iterationen konvergiert der Wert von x gegen die korrekte Lösung.
    - Sie können die gewünschte Genauigkeit festlegen, indem Sie die Iteration abbrechen, wenn der Unterschied zwischen dem alten und neuen Wert von x unter einen Schwellenwert fällt, z. B. 1E-6.
1. Java-Sprachmittel:
    1. Math.exp(), Math.abs()

## English

Task Description:
*Solving the Following Equation - Determining the Value of x that Solves the Equation:*

x = 2 - e^(-x)

1. To solve this equation, follow these steps:
    - Start with the initial value of x = 1.0 (other initial values can also yield correct results).
    - Substitute the value of x into the right side of the equation and assign the result to x.
    - Repeat this process by substituting the new value of x back into the equation, and so on.
    - After a few iterations, the value of x will converge to the correct solution.
    - You can set the desired accuracy by terminating the iteration when the difference between the old and new values of x falls below a threshold, such as 1E-6.
1. Java language utilities:
    1. Math.exp(), Math.abs()

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
