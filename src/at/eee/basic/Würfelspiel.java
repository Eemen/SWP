package at.eee.basic;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        int isumme = 0;
        int iRandomvariable;
        System.out.println("*************PRESS ENTERT TO START THE GAME*************");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();


       for (int i = 6; i > 0; i--) {
            System.out.println("Press enter to roll the dice. You have " + i + " tries left");
            scanner.nextLine();
            iRandomvariable = randomZahlenGen();
            System.out.println("Your number Zahl is: " + iRandomvariable);
            isumme += iRandomvariable;
        }
        System.out.println("is your total number: " + isumme);
        System.out.println("Now it's your opponent's turn");
        System.out.println("These are the numbers of your opponents:");
        for (int a = 6; a > 0; a--) {
            iRandomvariable = randomZahlenGen();
            System.out.println("**" + iRandomvariable + "**");
            isumme += iRandomvariable;
            System.out.println("is your total number: " + isumme);
        }
    }
    public static int randomZahlenGen() {
        Random random = new Random();
        int randomZahl = random.nextInt(6) +1;
        return randomZahl;
    }
}
