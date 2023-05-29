# Übung 9 - Exercise 9

## German

Aufgabenstellung:
*Einstieg in die Modularisierung*

Überarbeitung des bestehenden Projektes Übung 5 *Finanzberechnung: (Zinseszins und Rentenberechnung)* und Auslagerung von Code in separate Methoden:

1. Modularisierung der Finanzberechnungen
    Nehmen Sie die existierenden Projekte und modulieren Sie sie, indem Sie den Code aus der main()-Methode auslagern und als separate Methoden zusammenfassen.
    Diese Methoden werden dann aus der main() aufgerufen, mit Werten versorgt und nehmen Rückgabewerte entgegen.
    1. Übung Zinsen
        - Erstellen Sie die Methode zins(double kap, double zs, int n), die den Zinsbetrag berechnet.
        - Die Methode erhält das Kapital, den Zinssatz und die Laufzeit als Parameter und gibt den berechneten Zinsbetrag zurück.
    1. Übung Dauer
        - Erstellen Sie die Methode dauer(double kap, double zs, double rente), die die Laufzeit berechnet.
        - Die Methode erhält das Kapital, den Zinssatz und die Rentenhöhe als Parameter und gibt die berechnete Laufzeit zurück.
1. Testen der Methoden
    - Rufen Sie die Methoden aus der main() heraus auf und testen Sie sie.
    - Setzen Sie Breakpoints und nutzen Sie den Debugger, um die Methoden zu debuggen.
    - Springen Sie dabei in den Methoden-Code hinein und wieder heraus.
    - Überprüfen Sie den aktuellen Wert von Variablen während des Debuggings.
    - Machen Sie sich mit dem Debugger vertraut.

## English

Task Description:
*Introduction to Modularization*

Revision of the existing project Exercise 5 Financial Calculation: (Compound Interest and Pension Calculation) and extraction of code into separate methods:

1. Modularization of financial calculations
    Take the existing projects and modularize them by extracting the code from the main() method and combining them into separate methods.
    These methods will then be called from the main() method, supplied with values, and receive return values.
    1. Exercise: Interest Calculation
        - Create the method interest(double principal, double interestRate, int duration), which calculates the interest amount.
        - The method receives the principal amount, interest rate, and duration as parameters and returns the calculated interest amount.
    1. Exercise: Duration Calculation
        - Create the method duration(double principal, double interestRate, double pension), which calculates the duration.
        - The method receives the principal amount, interest rate, and pension amount as parameters and returns the calculated duration.
1. Testing the methods
    - Call the methods from the main() method and test them.
    - Set breakpoints and use the debugger to debug the methods.
    - Step into and out of the method code.
    - Check the current value of variables during debugging.
    - Familiarize yourself with the debugger.

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
