# Übung 15 - Exercise 15

## German

Aufgabenstellung:
*Implementierung eines Studenten Manegment Programms*

1. Erstellen Sie eine Klasse `Student` mit den folgenden Attributen:
   - Vorname (`vorname`) - vom Typ `String`
   - Nachname (`nachname`) - vom Typ `String`
   - Geburtsjahr (`geburtsjahr`) - vom Typ `int`
   - Matrikelnummer (`matrikelnummer`) - vom Typ `int`
   - Hochschule (`hochschule`) - vom Typ `String`
   - Semesterzahl (`semesterZahl`) - vom Typ `int`
   - Erstellen Sie den passenden Konstruktor, um die Attribute zu initialisieren.
   - Erstellen Sie auch entsprechende Getter- und Setter-Methoden für alle Attribute.

1. Erstellen Sie eine Klasse `Studentenwerk` mit einer `main()`-Methode.

1. In der `main()`-Methode:
   - Erstellen Sie mehrere `Student`-Objekte mit unterschiedlichen Daten.

1. Erzeugen Sie einen neuen Studenten mit den gewünschten Daten und verwenden Sie die Setter-Methoden, um die Attribute zu setzen.

1. Rufen Sie die Getter-Methoden auf, um die Werte der Attribute des Studenten abzurufen, und geben Sie sie aus.

1. Erstellen Sie eine Klassevariable `anzahlStudenten` in der Klasse `Student` und initialisieren Sie sie mit 0.

1. Erstellen Sie eine Klassenmethode `getAnzahlStudenten()` in der Klasse `Student`, die den Wert der Klassenvariable `anzahlStudenten` zurückgibt.

1. Rufen Sie `getAnzahlStudenten()` in der `main()`-Methode auf, um die Anzahl der erstellten Studenten abzurufen und auszugeben.

1. Erstellen Sie eine Instanzvariable `anzahlStudenten` in der Klasse `Studentenwerk` und initialisieren Sie sie mit 0.

1. Rufen Sie `getAnzahlStudenten()` in der `main()`-Methode der Klasse `Studentenwerk` auf, um die Anzahl der erstellten Studenten abzurufen und auszugeben.

1. Erhöhen Sie den Wert von `anzahlStudenten` um 1, wenn ein neues Studentenobjekt instantiiert wird - welche Methode bietet sich dafür an?

1. Fragen Sie innerhalb der Klasse `Studentenwerk` in der `main()`-Methode auf mehrere verschiedene Weisen die Anzahl der angelegten Studenten-Objekte ab:
    - Indem Sie auf der Klasse `Student` das Attribut `anzahlStudenten` abfragen.
    - Indem Sie auf einzelnen Studenten-Objekten das Attribut `anzahlStudenten` abfragen.
    - Geben Sie diese Anzahlen aus - die Werte müssen natürlich identisch sein.

1. Ergänzen Sie die Klasse `Student` um eine Methode, mit der ein neuer Student erzeugt wird (In der Sprache der OO handelt es sich um eine Factory):
    - `public static Student createStudent()`
    - In der Methode soll der Verwender nach allen relevanten Angaben gefragt werden, die einen Studenten kennzeichnen.
    - Mit diesen Daten soll ein neues Studenten-Objekt erzeugt und seine Attribute belegt werden - Verwendung des Konstruktors und der `set()`-Methoden.
    - Das neue Studenten-Objekt soll zurückgegeben werden.
    - Der Konstruktor soll den Matrikelnummer-Parameter nicht mehr enthalten!

1. Erstellen Sie in der Klasse `Studentenwerk` eine Methode `createStudent()`, die die Methode `createStudent()` der Klasse `Student` aufruft.

1. Verwenden Sie die Methode `createStudent()` in der `main()`-Methode der Klasse `Studentenwerk`, um einen neuen Studenten zu erstellen.

1. Rufen Sie die Methode `datenausgabe()` des erstellten Studentenobjekts auf, um die Daten des Studenten auszugeben.

1. Ändern Sie den Konstruktor der Klasse `Student`:
    - Die Matrikelnummer wird nun automatisch berechnet und vergeben!
    - Verwenden Sie diesen Konstruktor auch in der Methode `createStudent()`:
      - Der Verwender soll nicht mehr nach der Matrikelnummer gefragt werden - diese wird nun automatisch vergeben!
      - Verwenden Sie den neuen Konstruktor in der Methode.

1. Erweitern Sie die Klasse `Studentenwerk`:
    - Fügen Sie eine weitere Methode hinzu: `public static void manipulation(Student s)`
      - In der Methode wird der Verwender gefragt, welche Art von Bearbeitung durchgeführt werden soll: Änderung der Semesterzahl, Änderung des Hochschulorts, Datenausgabe.
      - Die gewählte Option wird mit dem übergebenen Studentenobjekt durchgeführt.
      - Verwenden Sie eine `switch-case`-Struktur.
      - Wenn `s` kein gültiges Objekt ist, geben Sie aus, dass kein aktiver Student übergeben wurde! (Prüfen Sie `s == null`)
    - `main()`-Methode:
      - Erstellen Sie ein Array für Studentenobjekte. In diesem Array werden die erstellten Objekte gespeichert: `Student[] studenten = new Student[200];`
      - Durch eine äußere Schleife kann der Verwender zwischen Weiter/Beenden wählen.
      - Der Verwender wird nach der Art der Bearbeitung gefragt.
        - Verwenden Sie eine `switch-case`-Struktur.
      - Student immatrikulieren:
        - Mit `createStudent()` wird ein neuer Student erstellt und im Array `studenten` gespeichert. Die Array-Indexposition entspricht der Matrikelnummer.
      - Student bearbeiten:
        - Der Verwender wird nach einer Matrikelnummer gefragt, und für den entsprechenden Studenten wird die Methode `manipulation()` aufgerufen. Das Studentenobjekt wird dem Array `studenten` übergeben.
      - Daten aller Studenten ausgeben:
        - Das Array `studenten` wird durchlaufen, und für jeden enthaltenen Studenten wird seine Methode `datenausgabe()` aufgerufen.
      - Student exmatrikulieren:
        - Der Verwender wird nach einer Matrikelnummer gefragt, und das entsprechende Studentenobjekt wird durch Nullsetzen gelöscht.
        - Nicht jede Indexposition enthält ein Studentenobjekt, um NullPointer-Exceptions zu vermeiden. Keine ArrayIndexOutOfBoundsExceptions!

## English

Task Description:
*Implementation of a Student Management Program*

1. Create a class `Student` with the following attributes:
   - First name (`firstName`) - of type `String`
   - Last name (`lastName`) - of type `String`
   - Birth year (`birthYear`) - of type `int`
   - Student ID (`studentID`) - of type `int`
   - University (`university`) - of type `String`
   - Semester number (`semesterNumber`) - of type `int`
   - Create the appropriate constructor to initialize the attributes.
   - Also, create corresponding getter and setter methods for all attributes.

1. Create a class `StudentManagement` with a `main()` method.

1. In the `main()` method:
   - Create multiple `Student` objects with different data.

1. Generate a new student with the desired data and use the setter methods to set the attributes.

1. Call the getter methods to retrieve the values of the student's attributes and display them.

1. Create a class variable `numberOfStudents` in the `Student` class and initialize it to 0.

1. Create a class method `getNumberOfStudents()` in the `Student` class that returns the value of the class variable `numberOfStudents`.

1. Call `getNumberOfStudents()` in the `main()` method to retrieve and display the number of created students.

1. Create an instance variable `numberOfStudents` in the `StudentManagement` class and initialize it to 0.

1. Call `getNumberOfStudents()` in the `main()` method of the `StudentManagement` class to retrieve and display the number of created students.

1. Increase the value of `numberOfStudents` by 1 when a new student object is instantiated - which method is suitable for this?

1. Within the `StudentManagement` class, retrieve the number of created student objects in several different ways in the `main()` method:
    - By querying the attribute `numberOfStudents` on the `Student` class.
    - By querying the attribute `numberOfStudents` on individual student objects.
    - Display these counts - the values should be identical.

1. Add a method to the `Student` class to create a new student (In the language of OOP, it is a Factory):
    - `public static Student createStudent()`
    - In the method, prompt the user for all relevant information that identifies a student.
    - Use this data to create a new student object and set its attributes - use the constructor and the `set()` methods.
    - Return the new student object.
    - The constructor should no longer include the `studentID` parameter!

1. Create a method `createStudent()` in the `StudentManagement` class that calls the `createStudent()` method of the `Student` class.

1. Use the `createStudent()` method in the `main()` method of the `StudentManagement` class to create a new student.

1. Call the `dataOutput()` method of the created student object to display the student's data.

1. Modify the constructor of the `Student` class:
    - The student ID is now automatically calculated and assigned!
    - Use this constructor in the `createStudent()` method as well:
      - The user should no longer be prompted for the student ID - it is now automatically assigned!
      - Use the new constructor in the method.

1. Expand the `StudentManagement` class:
    - Add another method: `public static void manipulation(Student s)`
      - In the method, prompt the user for the type of operation to be performed: change of semester number, change of university location, data output.
      - Perform the chosen option with the passed student object.
      - Use a `switch-case` structure.
      - If `s` is not a valid object, output that no active student was passed! (Check `s == null`)
    - `main()` method:
      - Create an array for student objects. The created objects will be stored in this array: `Student[] students = new Student[200];`
      - Through an outer loop, the user can choose to continue or exit.
      - Prompt the user for the type of operation.
        - Use a `switch-case` structure.
      - Enroll student:
        - Use `createStudent()` to create a new student and store it in the `students` array. The array index position corresponds to the student ID.
      - Edit student:
        - Prompt the user for a student ID, and call the `manipulation()` method for the corresponding student. Pass the student object to the `students` array.
      - Output data of all students:
        - Traverse the `students` array, and for each contained student, call its `dataOutput()` method.
      - Expel student:
        - Prompt the user for a student ID, and delete the corresponding student object by setting it to null.
        - Not every index position contains a student object to avoid null pointer exceptions. No `ArrayIndexOutOfBoundsExceptions`!

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
