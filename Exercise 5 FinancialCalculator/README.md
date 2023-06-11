# Übung 5 - Exercise 5

## German

Aufgabenstellung:
*Finanzberechnung: (Zinseszins und Rentenberechnung)*

1. **Programm zur Zinseszinsberechnung:**
    1. Projekt einrichten
        - Erstellen Sie ein neues Projekt und nehmen Sie die Klasse IO.java auf.
    1. Benutzereingabe
        - Der Benutzer soll das anzulegende Kapital, den Zinssatz und die Laufzeit der Geldanlage eingeben können.
    1. Zinseszinsberechnung
        - Das aktuelle Kapital (inklusive Verzinsung) soll für jedes Jahr ausgegeben werden.
        - Verwenden Sie eine geeignete Schleife, um die Verzinsung für jedes Jahr zu berechnen.
        - Das Kapital wird nicht abgezogen, sondern das Kapital inklusive Zinsen der Vorjahre wird weiterverzinst.
        - Die Formel zur Berechnung des Kapitals nach einem Jahr Verzinsung lautet: K = K + K *z (z ist der Zinssatz).
    1. Rundung der Geldbeträge
        - Verwenden Sie die Methode IO.round, um die berechneten Geldbeträge auf zwei Kommastellen zu runden.
1. **Programm zur Rentenberechnung:**
    1. Projekt einrichten oder vorhandenes Programm modifizieren
        - Erstellen Sie ein neues Projekt oder modifizieren Sie das bestehende Programm.
    1. Benutzereingabe
        - Der Benutzer soll das anzulegende Kapital, den Zinssatz und die Rente eingeben können.
        - Die Rente wird am Ende jedes Jahres aus dem Kapitalstock abgezogen.
    1. Rentenberechnung
        - Das aktuelle Kapital (inklusive Verzinsung) soll für jedes Jahr ausgegeben werden.
        - Verwenden Sie eine geeignete Schleife, um die Verzinsung und Rentenentnahmen für jedes Jahr zu berechnen.
    1. Das Kapital wird jeweils weiterverzinst.
        - Das Programm soll feststellen, nach wie vielen Jahren das Kapital durch die regelmäßigen Rentenentnahmen aufgebraucht ist.
    1. Überprüfung der Rentengröße
        - Stellen Sie sicher, dass die Rente größer ist als das Anfangskapital multipliziert mit dem Zinssatz. (Rente > Anfangskapital* Zinssatz)

  Hinweis: Die Überprüfung der Rentengröße ist wichtig, damit das Kapital nicht vorzeitig aufgebraucht wird und die Rentenzahlungen aufrechterhalten werden können.

## English

Task Description:
*Financial Calculation: (Compound Interest and Annuity Calculation)*

1. **Program for Compound Interest Calculation:**
    1. Setting up the project
        - Create a new project and include the class IO.java.
    1. User input
        - The user should be able to enter the initial capital, interest rate, and duration of the investment.
    1. Compound Interest Calculation
        - The current capital (including interest) should be displayed for each year.
        - Use a suitable loop to calculate the interest for each year.
        - The capital is not deducted; instead, the capital including interest from previous years is reinvested.
        - The formula for calculating the capital after one year of interest is: K = K + K * z (z is the interest rate).
    1. Rounding the monetary amounts
        - Use the method IO.round to round the calculated monetary amounts to two decimal places.

1. **Program for Annuity Calculation:**
    1. Setting up the project or modifying an existing program
        - Create a new project or modify the existing program.
    1. User input
        - The user should be able to enter the initial capital, interest rate, and annuity.
        - The annuity is deducted from the capital stock at the end of each year.
    1. Annuity Calculation
        - The current capital (including interest) should be displayed for each year.
        - Use a suitable loop to calculate the interest and annuity withdrawals for each year.
        - The capital is reinvested in each iteration.
        - The program should determine after how many years the capital is depleted by regular annuity withdrawals.
    1. Verification of the annuity size
        - Ensure that the annuity is greater than the initial capital multiplied by the interest rate. (Annuity > Initial Capital * Interest Rate)
    Note: Verifying the annuity size is important to prevent premature depletion of the capital and maintain the annuity payments.

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
