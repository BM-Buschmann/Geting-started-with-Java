# Übung 11 - Exercise 11

## German

Aufgabenstellung:
*Waehrungsrechner: Gebrauch von Objekten und Klassen*

1. Importieren der Klasse Waehrungsrechner.java
    - Fügen Sie die Klasse Waehrungsrechner.java in Ihr Projekt ein, indem Sie sie importieren (analog zu IO).
1. Erstellen einer ausführbaren Umrechner-Klasse
    - Legen Sie eine ausführbare Klasse "Umrechner" an.
1. Instanziierung von Waehrungsrechner-Objekten
    - Innerhalb der main()-Methode erstellen Sie mehrere verschiedene Objekte der Klasse Waehrungsrechner.
    - Jedes Objekt soll sich durch den verwendeten Kurswert unterscheiden, der dem Konstruktor übergeben wird.
    - Erstellen Sie ein Objekt mit dem Namen "dollar" und verwenden Sie den Euro/Dollar-Kurs.
    - Erstellen Sie ein Objekt mit dem Namen "sfranken" und verwenden Sie den Euro/Franken-Kurs.
1. Durchführung von Umrechnungen
    - Nutzen Sie die Methoden der Waehrungsrechner-Objekte, um Umrechnungen durchzuführen.
    - Ermöglichen Sie die Eingabe des umzurechnenden Betrags.
    - Geben Sie das Ergebnis der Umrechnung aus.
    - Führen Sie Umrechnungen in beide Richtungen durch (Euro ↔ Fremdwährung).
1. Ausgabe eines Waehrungsrechner-Objekts "w1" auf der Konsole
    - Verwenden Sie die folgenden Anweisungen, um das Objekt "w1" auf der Konsole auszugeben:

        ```java
        System.out.println(w1);
        IO.writeln("Wert = " + w1);
        ```

1. Bedeutung von "immutable objects" für Objekte der Klasse Waehrungsrechner
    - Die Objekte der Klasse Waehrungsrechner sind "immutable objects".
    - Dies bedeutet, dass ihre Zustände nicht veränderbar sind, nachdem sie erstellt wurden.
    - Einmal festgelegte Werte, wie der Kurs, können nicht geändert werden.
    - --> `Immutable objects gewährleisten Unveränderlichkeit und Sicherheit bei der Verwendung der Klasse.`

## English

Task Description:
*Currency Converter: Usage of Objects and Classes*

1. Importing the class Waehrungsrechner.java
    - Add the Waehrungsrechner.java class to your project by importing it (similar to IO).
1. Creating an executable Umrechner class
    - Create an executable class called "Umrechner".
1. Instantiating Waehrungsrechner objects
    - Within the main() method, create multiple different objects of the Waehrungsrechner class.
    - Each object should differ based on the exchange rate value passed to its constructor.
    - Create an object named "dollar" and use the Euro/Dollar exchange rate.
    - Create an object named "sfranken" and use the Euro/Franken exchange rate.
1. Performing conversions
    - Use the methods of the Waehrungsrechner objects to perform conversions.
    - Allow input of the amount to be converted.
    - Display the result of the conversion.
    - Perform conversions in both directions (Euro ↔ Foreign currency).
1. Outputting a Waehrungsrechner object "w1" to the console
    - Use the following statements to output the "w1" object to the console:

        ```java
        System.out.println(w1);
        IO.writeln("Wert = " + w1);
        ```

1. Significance of "immutable objects" for objects of the Waehrungsrechner class
    - The objects of the Waehrungsrechner class are "immutable objects".
    - This means that their states cannot be changed after they are created.
    - Once values are set, such as the exchange rate, they cannot be modified.
    - --> `Immutable objects ensure immutability and safety when using the class.`

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
