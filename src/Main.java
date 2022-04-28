import Heroes.Warrior;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    String StartingText = " Current available characters are Warrior and Mage. Please choose your character now by typing the character clas in your console.";

    Scanner userInput = new Scanner(System.in);

    System.out.println(StartingText);

    boolean isSelected = true;
        do {
            String selectedHero = userInput.nextLine();
            if (Objects.equals(selectedHero, "Warrior")) {
            System.out.println("You have selected Warrior as your Hero class.");
            Warrior playerHero = new Warrior();
            isSelected = false;
            } else if(Objects.equals(selectedHero, "Mage")) {
            System.out.println("You have selected Mage as your Hero class.");
            isSelected = false;
            } else {
            System.out.println("Hero class " + selectedHero + " does not exist. Please choose from the available Hero Classes.");
            }
        }while (isSelected);


    }
}
