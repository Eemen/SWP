package at.eee.basic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TikTakToe {
    static int[] verfuegbar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {
       //begruesung();
       //durchlauf();
       spielfeld(verfuegbar);
    }

    /*public static void begruesung(){
        System.out.println("Willkommen zum TikTakToe spiel.");
        System.out.println("Das ist das Spielfeld mit den Nummern der Feldern");
        System.out.println("|1|2|3|\n|4|5|6|\n|7|8|9|\n");




    }

    public static void durchlauf(){
        boolean platzvergeben = false;

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        System.out.println("An welche Feld möchte Spieler 1 sein Feld plazieren.");
        System.out.println("|1|2|3|\n|4|5|6|\n|7|8|9|");
        int einzahlungsBetrag = scanner.nextInt();
        spielfeld(einzahlungsBetrag);

    }*/
    public static void spielfeld(int[] array){

        System.out.println(array[0]);

        for (int i = 0; i < array.length; i++) {

            if(i<9)
            System.out.println(array[i+1]);

        }

    }
}
/*
for (int i = 0; i < verfuegbar.length; i++) {
        if (verfuegbar[i] == gesuchterWert) {
        gefunden = true;
        break; // Wenn der Wert gefunden wurde, breche die Schleife ab.
        }*/