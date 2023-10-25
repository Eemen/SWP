package at.eee.basic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TikTakToe {
    static char[] verfuegbar = {'1', '2', '3', '4', '5', '6', '7','8', '9'};

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
        boolean spieler;
        Scanner scanner = new Scanner(System.in);


        System.out.println("An welche Feld möchte Spieler 1 sein Feld plazieren.");
        int selection = scanner.nextInt();
        spieler = true;
        spielfeld(selection,  verfuegbar, spieler);
        System.out.println("An welche Feld möchte Spieler 2 sein Feld plazieren.");
        int selection2 = scanner.nextInt();
        spieler = false;
        spielfeld(selection,  verfuegbar, spieler);

    }
    public static void spielfeld(int a, char[] array, boolean spielr){
        char welcherspieler;
        if (spielr) {
            welcherspieler = 'X';
        }
        else {
            welcherspieler = 'O';
        }
        switch(a) {
            case 1:
                array[0] = welcherspieler;
                break;
            case 2:
                array[1] = welcherspieler;
                break;
            case 3:
                array[2] = welcherspieler;
                break;
            case 4:
                array[3] = welcherspieler;
                break;
            case 5:
                array[4] = welcherspieler;
                break;
            case 6:
                array[5] = welcherspieler;
                break;
            case 7:
                array[6] = welcherspieler;
                break;
            case 8:
                array[7] = welcherspieler;
                break;
            case 9:
                array[8] = welcherspieler;
                break;
            default:
        }

        System.out.println("|"+ array[0] + "|" + array[1] + "|" + array[2] + "|" + "\n" + "|" + array[3] +"|" + array[4] + "|" + array[5] + "|" + "\n" + "|" + array[6] + "|" + array[7] + "|" + array[8] + "|" + "\n");
    }
}
