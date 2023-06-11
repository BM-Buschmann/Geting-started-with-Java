# Übung 16 - Exercise 16

## German

Aufgabenstellung:
*Schreiben Sie eine immutable Klasse zum Bruchrechnen*

1. Legen Sie ein neues Projekt an, das auch die Klasse `Scanner` enthält.
1. In dem File mit Ihrem eigenen Coding sollen zwei Klassen angelegt werden:
   a) Die nichtausführbare Klasse **Bruch**
   b) Die ausführbare Klasse **Bruchrechner** mit `main()`-Methode.
1. Die Klasse **Bruch** soll über folgende Attribute verfügen: `private int zaehler; private int nenner;`
1. Die Klasse **Bruch** soll über zwei Konstruktoren verfügen:
   a) parameterloser Konstruktor: `public Bruch()` - soll den parametertragenden Konstruktor mit den Werten 1 und 1 aufrufen.
   b) parametertragender Konstruktor: `public Bruch(int z, int n)` - soll Attribute der Klasse **Bruch** mit den entsprechenden Werten belegen.
1. Die Klasse **Bruch** soll eine public Methode namens `show()` erhalten, die den Wert eines Bruchs mittels `System.out.println()` ausgibt in der Form `zaehler/nenner` (Bsp: 2/3).
1. Die Klasse **Bruchrechner** soll in `main()` zwei Bruch-Objekte anlegen und deren Wert ausgeben mittels der Methode `show()`.

1. Fügen Sie folgende Methoden zur Klasse **Bruch** hinzu:
   - `public Bruch kehrWert()` - soll den Kehrwertbruch zurückgeben.
   - `public Bruch negiere()` - soll den negativen Bruch zurückliefern.

1. Schreiben Sie eine Methode: `private int ggT(int a, int b)`.
   Diese liefert den größten gemeinsamen Teiler zweier ganzer Zahlen.
   Schreiben Sie damit eine Methode `public Bruch kuerze()` die den gekürzten Bruch liefert.
   Mittels der Methode `ggT()` können Sie den ggT von Zähler und Nenner ermitteln und dann die Attribute `zaehler` und `nenner` des neuen Objekts durch diesen Wert teilen (Bsp: 4/6 -> ggT = 2 -> 4:2 / 6:2 = 2/3).

1. Verwenden Sie die Methoden in **Bruchrechner** und verifizieren Sie, dass diese korrekt arbeiten!

1. Schreiben Sie für die Klasse **Bruch** eine statische Methode: `public static Bruch addiere(Bruch bx, Bruch by)`.
    Es werden zwei Brüche (= existierende Bruch-Objekte) addiert und das Resultat als neuer Bruch (= neues Bruch-Objekt) zurückgegeben.
    Vor der Rückgabe des neuen Bruchs soll dieser gekürzt werden!

1. Verwenden Sie die neue Methode innerhalb der Klasse **Bruchrechner**.
    Der Aufruf (auf der Klasse **Bruch** selbst, da statische Methode) sieht z.B. so aus:

    ```java
    Bruch b1 = new Bruch(2, 3);
    Bruch b2 = new Bruch(4, 3);
    Bruch b3 = Bruch.addiere(b1, b2);
    ```

1. Schreiben Sie für die Klasse **Bruch** weitere public-Methoden, die folgendes tun:
    - `Bruch add(Bruch b)` - zum Bruch wird ein weiterer Bruch addiert und das Resultat als neuer Bruch (= neues Bruch-Objekt) zurückgegeben.
    - `Bruch subt(Bruch b)` - vom Bruch wird ein weiterer Bruch subtrahiert und das Resultat als neuer Bruch zurückgegeben.
    - `Bruch mult(Bruch b)` - der Bruch wird mit einem weiteren Bruch multipliziert und das Resultat als neuer Bruch zurückgegeben.
    - `Bruch div(Bruch b)` - der Bruch wird durch einen weiteren Bruch geteilt und das Resultat als neuer Bruch zurückgegeben.
    Vor der Rückgabe des neuen Bruchs soll dieser gekürzt werden!

1. Schreiben Sie für die Klasse **Bruch** eine Methode, die den Bruch potenziert: `public Bruch potenz(int p)`.
    Diese Methode soll die p-te Potenz des Bruchs berechnen.
    Der Parameter p ist ganzzahlig, kann aber auch 0 oder negativ sein.
    Verwenden Sie in der Methode unter anderem die bereits geschriebene Methode `mult()`.

    Verwenden Sie die neuen Methoden in **Bruchrechner**.
    Die Aufrufe sehen z.B. etwa so aus:

    ```java
    Bruch b1 = new Bruch(2, 3);
    Bruch b2 = new Bruch(4, 3);
    Bruch b3 = b1.add(b2);
    ```

1. Fügen Sie der Klasse Bruch eine weitere Methode hinzu, mittels der festgestellt werden kann, ob der Bruch mit dem übergebenen Bruchobjekt identisch ist, d.h. gleichen Zähler und Nenner hat: public boolean isEqual(Bruch b).
Wenn dies der Fall ist, soll true zurückgegeben werden, andernfalls false.

1. Was erhalten Sie für ein Resultat, wenn Sie innerhalb der main-Methode zwei Bruchobjekte mit identischen Werten der Attribute zaehler und nenner direkt vergleichen - d.h. die Objektvariablen selbst vergleichen:

    ```java
    if (b1 == b2) {
        // ...
    }
    ```

## English

Task Description:
*Write an immutable class for fraction arithmetic*

1. Create a new project that includes the `Scanner` class.
1. In the file containing your own code, create two classes:
   a) The non-executable class **Fraction**
   b) The executable class **FractionCalculator** with a `main()` method.
1. The class **Fraction** should have the following attributes: `private int numerator; private int denominator;`
1. The class **Fraction** should have two constructors:
   a) Parameterless constructor: `public Fraction()` - should call the parameterized constructor with values 1 and 1.
   b) Parameterized constructor: `public Fraction(int num, int denom)` - should assign the attributes of the **Fraction** class with the corresponding values.
1. The class **Fraction** should have a public method named `show()` that outputs the value of a fraction using `System.out.println()` in the format `numerator/denominator` (e.g., 2/3).
1. The class **FractionCalculator** should create two Fraction objects in the `main()` method and display their values using the `show()` method.

1. Add the following methods to the **Fraction** class:
   - `public Fraction reciprocal()` - should return the reciprocal fraction.
   - `public Fraction negate()` - should return the negative fraction.

1. Write a method: `private int gcd(int a, int b)`.
   This method returns the greatest common divisor of two integers.
   Use this method to implement a method `public Fraction simplify()` that returns the simplified fraction.
   By using the `gcd()` method, you can determine the greatest common divisor of the numerator and denominator and then divide the attributes `numerator` and `denominator` of the new object by this value (e.g., 4/6 -> gcd = 2 -> 4/2 / 6/2 = 2/3).

1. Use the methods in **FractionCalculator** and verify that they work correctly!

1. Write a static method for the **Fraction** class: `public static Fraction add(Fraction fx, Fraction fy)`.
    This method adds two fractions (= existing Fraction objects) and returns the result as a new fraction (= new Fraction object).
    Before returning the new fraction, simplify it!

1. Use the new method within the **FractionCalculator** class.
    The call (on the **Fraction** class itself, as it is a static method) would look like this:

    ```java
    Fraction f1 = new Fraction(2, 3);
    Fraction f2 = new Fraction(4, 3);
    Fraction f3 = Fraction.add(f1, f2);
    ```

1. Write additional public methods for the **Fraction** class that perform the following operations:
    - `Fraction add(Fraction f)` - adds another fraction to the fraction and returns the result as a new fraction (= new Fraction object).
    - `Fraction subtract(Fraction f)` - subtracts another fraction from the fraction and returns the result as a new fraction.
    - `Fraction multiply(Fraction f)` - multiplies the fraction by another fraction and returns the result as a new fraction.
    - `Fraction divide(Fraction f)` - divides the fraction by another fraction and returns the result as a new fraction.
    Before returning the new fraction, simplify it!

1. Write a method for the **Fraction** class that raises the fraction to a power: `public Fraction powe =(int p)`.
    This method should calculate the p-th power of the fraction.
    The parameter p is an integer but can also be 0 or negative.
    Use the already written `multiply()` method in this method.
    Use the new methods in **FractionCalculator**.
    The calls would look like this:

    ```java
    Fraction f1 = new Fraction(2, 3);
    Fraction f2 = new Fraction(4, 3);
    Fraction f3 = f1.add(f2);
    ```

1. Add another method to the **Fraction** class that determines whether the fraction is identical to the given fraction object, i.e., whether they have the same numerator and denominator: `public boolean isEqual(Fraction f)`.
    If this is the case, it should return `true`; otherwise, it should return `false`.

1. What result do you get when you directly compare two fraction objects with identical values for the numerator and denominator using the `==` operator within the `main()` method?

    ```java
    if (f1 == f2) {
        // ...
    }
    ```

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
