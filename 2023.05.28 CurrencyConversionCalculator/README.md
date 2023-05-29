# (German)
## **Aufgabenstellung**
Finanzberechnung: (Zinseszins und Rentenberechnung) Übung 5:

**Programm zur Zinseszinsberechnung**:
	
  1. **Projekt einrichten**
      - Erstellen Sie ein neues Projekt und nehmen Sie die Klasse `IO.java` auf.
  2. **Benutzereingabe**
      - Der Benutzer soll das anzulegende Kapital, den Zinssatz und die Laufzeit der Geldanlage eingeben können.
  3. **Zinseszinsberechnung**
      - Das aktuelle Kapital (inklusive Verzinsung) soll für jedes Jahr ausgegeben werden.
      - Verwenden Sie eine geeignete Schleife, um die Verzinsung für jedes Jahr zu berechnen.
      - Das Kapital wird nicht abgezogen, sondern das Kapital inklusive Zinsen der Vorjahre wird weiterverzinst.
      - Die Formel zur Berechnung des Kapitals nach einem Jahr Verzinsung lautet: K = K + K * z (z ist der Zinssatz).
  4. **Rundung der Geldbeträge**
      - Verwenden Sie die Methode `IO.round`, um die berechneten Geldbeträge auf zwei Kommastellen zu runden.

**Programm zur Rentenberechnung**:
	
1. **Projekt einrichten oder vorhandenes Programm modifizieren**
    - Erstellen Sie ein neues Projekt oder modifizieren Sie das bestehende Programm.
2. **Benutzereingabe**
    - Der Benutzer soll das anzulegende Kapital, den Zinssatz und die Rente eingeben können.
    - Die Rente wird am Ende jedes Jahres aus dem Kapitalstock abgezogen.
3. **Rentenberechnung**
    - Das aktuelle Kapital (inklusive Verzinsung) soll für jedes Jahr ausgegeben werden.
    - Verwenden Sie eine geeignete Schleife, um die Verzinsung und Rentenentnahmen für jedes Jahr zu berechnen.
4. **Weiterverzinsung des Kapitals**
    - Das Kapital wird jeweils weiterverzinst.
5. **Bestimmung der Jahre bis zur Erschöpfung**
    - Das Programm soll feststellen, nach wie vielen Jahren das Kapital durch die regelmäßigen Rentenentnahmen aufgebraucht ist.
6. **Überprüfung der Rentengröße**
    - Stellen Sie sicher, dass die Rente größer ist als das Anfangskapital multipliziert mit dem Zinssatz. (Rente > Anfangskapital * Zinssatz)

Hinweis: Die Überprüfung der Rentengröße ist wichtig, damit das Kapital nicht vorzeitig aufgebraucht wird und die Rentenzahlungen aufrechterhalten werden können.


# (English)
## **Task Description**
Financial Calculation: (Compound Interest and Annuity Calculation) Exercise 5:

**Program for Compound Interest Calculation**:
	
  1. **Set up the project**
      - Create a new project and include the `IO.java` class.
  2. **User input**
      - The user should be able to enter the initial capital, interest rate, and investment duration.
  3. **Compound interest calculation**
      - Display the current capital (including interest) for each year.
      - Use a suitable loop to calculate the interest for each year.
      - The capital is not deducted, but rather the capital including interest from previous years is compounded.
      - The formula for calculating the capital after one year of compounding is: K = K + K * r (r is the interest rate).
  4. **Rounding of monetary amounts**
      - Use the `IO.round` method to round the calculated monetary amounts to two decimal places.

**Program for Annuity Calculation**:
	
1. **Set up the project or modify an existing program**
    - Create a new project or modify the existing program.
2. **User input**
    - The user should be able to enter the initial capital, interest rate, and annuity.
    - The annuity is deducted from the capital stock at the end of each year.
3. **Annuity calculation**
    - Display the current capital (including interest) for each year.
    - Use a suitable loop to calculate the interest and annuity withdrawals for each year.
4. **Continued compounding of capital**
    - The capital is compounded further each time.
5. **Determining the years until depletion**
    - The program should determine after how many years the capital is depleted due to regular annuity withdrawals.
6. **Verification of annuity size**
    - Ensure that the annuity is greater than the initial capital multiplied by the interest rate. (Annuity > Initial Capital * Interest Rate)

Note: The verification of the annuity size is important to prevent premature depletion of capital and to maintain the annuity payments.

# General Information
## **Folder Structure**
The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## **Dependency Management**
The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
