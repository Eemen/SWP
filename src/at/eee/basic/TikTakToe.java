package at.eee.basic;

import java.util.Arrays;
import java.util.Scanner;

public class TikTakToe {
    int[] verfuegbar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {
        begruesung();
        durchlauf();
    }

    public static void begruesung(){
        System.out.println("Willkommen zum TikTakToe spiel.");
        System.out.println("Das ist das Spielfeld mit den Nummern der Feldern");
        System.out.println("|1|2|3|\n|4|5|6|\n|7|8|9|\n");
    }

    public static void durchlauf(){
        boolean platzvergeben = false;

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        System.out.println("Wo möchte Spieler 1 sein Feld plazieren.");
        int einzahlungsBetrag = scanner.nextInt();
        spielfeld(einzahlungsBetrag);
        System.out.println("|1|2|3|\n|4|5|6|\n|7|8|9|");
    }
    public static void spielfeld(int a){
        

    }
}
/*
for (int i = 0; i < verfuegbar.length; i++) {
        if (verfuegbar[i] == gesuchterWert) {
        gefunden = true;
        break; // Wenn der Wert gefunden wurde, breche die Schleife ab.
        }