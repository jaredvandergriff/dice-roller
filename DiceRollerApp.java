package diceroller;

import java.util.Scanner;

public class DiceRollerApp {

    public static void main(String[] args) {
        String yOrN = "y";
        Scanner sc = new Scanner(System.in);

        while(yOrN.equalsIgnoreCase("y")){
            int sides = Validator.getInt(sc,"Enter the number of sides your die has: ");
            Die die = new Die(sides);
            System.out.println("You rolled a " + die.roll());
            yOrN = Validator.contYN(sc, "Would you like to roll another die? Y/N:", yOrN);
        }


    }
}
