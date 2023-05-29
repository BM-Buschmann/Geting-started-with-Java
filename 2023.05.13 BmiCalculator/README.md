# Übung 1 - Exercise 1

## German

Aufgabenstellung:
*Programm zur Berechnung des Body Mass Index (BMI):*

1. **Projekt einrichten**
    - Erstellen Sie ein neues Eclipse-Projekt mit dem Namen "BMI".
    - Fügen Sie die Datei "IO.java" als physische Kopie in Ihr Projekt ein.
    - Überprüfen Sie, ob ein entsprechender Projektordner auf Ihrem Laufwerk erstellt wurde.
1. **Klasse "BodyMassIndex" mit Hauptmethode hinzufügen**
    - Erstellen Sie eine Klasse namens "BodyMassIndex" mit einer main-Methode.
    - Deklarieren Sie double-Variablen für die Größe [m] und das Gewicht [kg] und weisen Sie ihnen Werte zu.
    - Berechnen Sie den BMI mit der Formel: double bmi = Gewicht / (Größe * Größe).
    - Geben Sie den berechneten Wert aus: IO.writeln("Wert = " + bmi).
1. **Zielwerte festlegen**
    - Der berechnete BMI-Wert sollte im Bereich von 20 bis 26 liegen.
1. **Eingabe der Werte durch den Benutzer**
    - Statt die Zahlenwerte im Programm fest einzuschreiben, verwenden Sie die Methode IO.promptAndReadDouble("Bitte ... eingeben: ") der Klasse IO, um den Benutzer während der Programmausführung nach den Zahlen zu fragen.
1. **Benutzername abfragen**
    - Verwenden Sie die Methode IO.promptAndReadString("Bitte Namen eingeben: ") der Klasse IO, um den Namen des Benutzers abzufragen.
    - Geben Sie eine Begrüßung aus, die den Namen des Benutzers enthält, bevor die Werte abgefragt werden.
1. **Verbesserung der Programmausgabe**
    - Gestalten Sie die Ausgaben des Programms ansprechender, indem Sie Rundungen verwenden oder Unterstreichungen, Leerzeilen usw. einfügen.

## English

Task Description:
*Program for Body Mass Index (BMI) Calculation:*

1. Set up the project
    - Create a new Eclipse project named "BMI".
    - Add the file "IO.java" as a physical copy to your project.
    - Verify if a corresponding project folder has been created on your drive.
1. Add the class "BodyMassIndex" with the main method
    - Create a class named "BodyMassIndex" with a main method.
    - Declare double variables for height [m] and weight [kg] and assign them values.
    - Calculate the BMI using the formula: double bmi = Weight / (Height * Height).
    - Display the calculated value: IO.writeln("Value = " + bmi).
1. Set target values
    - The calculated BMI value should be within the range of 20 to 26.
1. User input of values
    - Instead of hardcoding the numerical values in the program, use the method IO.promptAndReadDouble("Please enter ...: ") from the IO class to ask the user for the numbers during program execution.
1. Prompt for user name
    - Use the method IO.promptAndReadString("Please enter name: ") from the IO class to prompt for the user's name.
    - Display a greeting that includes the user's name before asking for the values.
1. Improvement of program output
    - Enhance the program's output by using rounding or adding underlines, empty lines, etc.

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
