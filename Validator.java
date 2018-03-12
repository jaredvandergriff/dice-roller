package diceroller;

import java.util.Scanner;

public class Validator
{
    public static String getString(Scanner sc, String prompt)
    {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static int getInt(Scanner sc, String prompt)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt,
                             int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (!isValid)
        {
            i = getInt(sc, prompt);
            if (i <= min)
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            else if (i >= max)
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return i;
    }

    public static double getDouble(Scanner sc, String prompt)
    {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                d = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(Scanner sc, String prompt,
                                   double min, double max)
    {
        double d = 0;
        boolean isValid = false;
        while (!isValid)
        {
            d = getDouble(sc, prompt);
            if (d <= min)
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            else if (d >= max)
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            else
                isValid = true;
        }
        return d;
    }

    // Method to validate y or n entry
    public static String contYN(Scanner sc, String prompt, String yOrN)
    {
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            yOrN = sc.nextLine();
            if (yOrN.equals(""))
            {
                System.out.println("This entry is required. Please enter y or n.");
            }
            else if (yOrN.equalsIgnoreCase("y") || yOrN.equalsIgnoreCase("n"))
            {
                isValid = true;
            }
            else
            {
                System.out.println("Only y or n will be accepted as valid.");
            }
        }
        return yOrN;
    }
}