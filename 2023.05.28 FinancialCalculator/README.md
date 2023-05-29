# Java-Methoden - Einstieg in die Modularisierung Übung 9
Überarbeitung der bestehenden Projekte und Auslagerung von Code in separate Methoden:  
1. **Modularisierung der Finanzberechnungen**  
    - Nehmen Sie die existierenden Projekte und modulieren Sie sie, indem Sie den Code aus der main()-Methode auslagern und als separate Methoden zusammenfassen.  
    - Diese Methoden werden dann aus der main() aufgerufen, mit Werten versorgt und nehmen Rückgabewerte entgegen.  
    1. **Übung Zinsen**  
            - Erstellen Sie die Methode **zins(double kap, double zs, int n)**, die den Zinsbetrag berechnet.  
            - Die Methode erhält das Kapital, den Zinssatz und die Laufzeit als Parameter und gibt den berechneten Zinsbetrag zurück.  
    1. **Übung Dauer**  
            - Erstellen Sie die Methode **dauer(double kap, double zs, double rente)**, die die Laufzeit berechnet.  
            - Die Methode erhält das Kapital, den Zinssatz und die Rentenhöhe als Parameter und gibt die berechnete Laufzeit zurück.  
1. **Testen der Methoden**  
    - Rufen Sie die Methoden aus der main() heraus auf und testen Sie sie.  
    - Setzen Sie Breakpoints und nutzen Sie den Debugger, um die Methoden zu debuggen.  
    - Springen Sie dabei in den Methoden-Code hinein und wieder heraus.  
    - Überprüfen Sie den aktuellen Wert von Variablen während des Debuggings.  
    - Machen Sie sich mit dem Debugger vertraut.  

Hinweis: Die genauen Implementierungsdetails der Methoden (zins und dauer) müssen entsprechend dem gegebenen Kontext und den Anforderungen des Programms angepasst werden.  






## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
