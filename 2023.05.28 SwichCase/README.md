# Übung 4 - Exercise 4

## German

Aufgabenstellung:
*Switch-Anweisung + Schleife*

1. Verwendung der Switch-Anweisung:
    - In einer ausführbaren Klasse soll innerhalb der main()-Methode vom Verwender eine Zahl zwischen 0 und 9 eingelesen werden.
        - Wenn 0 oder 1 oder 2 oder 3 eingegeben wird, geben Sie "Bereich Null bis Drei" aus.
        - Wenn 4 oder 5 oder 6 oder 7 eingegeben wird, geben Sie "Bereich Vier bis Sieben" aus.
        - Wenn 8 oder 9 eingegeben wird, geben Sie "Bereich Acht bis Neun" aus.
        - Durch den default-Zweig sollen alle anderen Zahleneingaben ≠ [0 .... 9] behandelt werden.

1. Vergessen der break-Anweisung:
    - Beobachten Sie, was passiert, wenn Sie die break-Anweisung in den Cases der Switch-Anweisung vergessen. (Ausprobieren!)

1. Ergänzung des Programms um eine geeignete Schleife:
    - Der Verwender soll gefragt werden, ob noch eine Eingabe gewünscht ist.
        - Solange der Benutzer zustimmt, soll der obige Teil erneut durchlaufen werden.
        - Falls nicht, soll sich das Programm beenden.
        - Verwenden Sie die Methode IO.promptAndReadChar(...) zur Abfrage des Benutzers.

## English

Task Description:
*Switch Statement + Loop*

1. Usage of the switch statement:
    - In an executable class, within the main() method, the user should input a number between 0 and 9.
        - If 0, 1, 2, or 3 is entered, output "Range Zero to Three".
        - If 4, 5, 6, or 7 is entered, output "Range Four to Seven".
        - If 8 or 9 is entered, output "Range Eight to Nine".
        - Use the default case to handle all other number inputs ≠ [0 .... 9].
1. Forgetting the break statement:
    - Observe what happens when you forget the break statement in the cases of the switch statement. (Try it out!)
1. Addition of a suitable loop to the program:
    - The user should be asked if another input is desired.
    - As long as the user agrees, the above section should be executed again.
    - If not, the program should terminate.
    - Use the method IO.promptAndReadChar(...) to query the user.

## General Information

1. Folder Structure
    1. The workspace contains two folders by default, where:
        - `src`: the folder to maintain sources
        - `lib`: the folder to maintain dependencies
    1. Meanwhile, the compiled output files will be generated in the `bin` folder by default.
1. Dependency Management
    1. The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
