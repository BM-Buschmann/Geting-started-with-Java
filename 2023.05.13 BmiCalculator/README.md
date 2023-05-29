## (German)
# Aufgabenstellung
Programm zur Berechnung des Body Mass Index (BMI) Übung 1:

1. Projekt einrichten
  - Erstellen Sie ein neues Eclipse-Projekt mit dem Namen "BMI".
  - Fügen Sie die Datei "IO.java" als physische Kopie in Ihr Projekt ein.
  - Überprüfen Sie, ob ein entsprechender Projektordner auf Ihrem Laufwerk erstellt wurde.
2. Klasse "BodyMassIndex" mit Hauptmethode hinzufügen
  - Erstellen Sie eine Klasse namens "BodyMassIndex" mit einer main-Methode.
  - Deklarieren Sie double-Variablen für die Größe [m] und das Gewicht [kg] und weisen Sie ihnen Werte zu.
  - Berechnen Sie den BMI mit der Formel: double bmi = Gewicht / (Größe * Größe).
  - Geben Sie den berechneten Wert aus: IO.writeln("Wert = " + bmi).
3. Zielwerte festlegen
  - Der berechnete BMI-Wert sollte im Bereich von 20 bis 26 liegen.
4. Eingabe der Werte durch den Benutzer
  - Statt die Zahlenwerte im Programm fest einzuschreiben, verwenden Sie die Methode IO.promptAndReadDouble("Bitte ... eingeben: ") der Klasse IO, um den Benutzer während der Programmausführung nach den Zahlen zu fragen.
5. Benutzername abfragen
  - Verwenden Sie die Methode IO.promptAndReadString("Bitte Namen eingeben: ") der Klasse IO, um den Namen des Benutzers abzufragen.
  - Geben Sie eine Begrüßung aus, die den Namen des Benutzers enthält, bevor die Werte abgefragt werden.
6. Verbesserung der Programmausgabe
  - Gestalten Sie die Ausgaben des Programms ansprechender, indem Sie Rundungen verwenden oder Unterstreichungen, Leerzeilen usw. einfügen.


## (English)
# Task Tescription
Body Mass Index (BMI) Calculation Program Exercise 1:

1. Setting up the Project
  - Create a new Eclipse project named "BMI".
  - Copy the "IO.java" file into your project as a physical copy.
  - Verify that a corresponding project folder has been created on your drive.
2. Adding the "BodyMassIndex" Class with Main Method
  - Create a class called "BodyMassIndex" with a main method.
  - Declare double variables for height [m] and weight [kg], and assign them values.
  - Calculate the BMI using the formula: double bmi = weight / (height * height).
  - Output the calculated value: IO.writeln("Value = " + bmi).
3. Setting Target Values
  - The calculated BMI value should be within the range of 20 to 26.
4. User Input of Values
  - Instead of hard-coding the numeric values in the program, use the IO.promptAndReadDouble("Please enter ...: ") method from the IO class to ask the user for the numbers during program execution.
5. Asking for User's Name
  - Use the IO.promptAndReadString("Please enter your name: ") method from the IO class to prompt the user for their name.
  - Output a greeting that includes the user's name before querying for the values.
6. Improving Program Output
  - Enhance the program's output by using rounding, underlines, empty lines, etc.



## General Information
# Folder Structure
The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

# Dependency Management
The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
