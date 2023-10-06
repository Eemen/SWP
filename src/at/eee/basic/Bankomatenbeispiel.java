package at.eee.basic;

import java.util.Scanner;

public class Bankomatenbeispiel {


    public static void main(String[] args) {
        boolean doWhileController = true;
        int iKontostant = 0;
        int iKontostantzwischenVariable = 0;
        do {
            System.out.println("Selektieren Sie die gewünschte Funktion\n 1. Einzahlen \n 2. Abheben \n 3. Kontostand \n 4. Ende");
            Scanner scanner = new Scanner(System.in);

            int selection = scanner.nextInt();


            switch (selection) {
                case 1:
                    System.out.println("Geben Sie den Betrag ein den Sie einzahlen möchten:");
                    int einzahlungsBetrag = scanner.nextInt();
                    iKontostantzwischenVariable = einzahlung(einzahlungsBetrag, iKontostant);
                    iKontostant = iKontostantzwischenVariable;
                    //System.out.println(einzahlung(einzahlungsBetrag, iKontostant));
                    System.out.println("Sie haben " + einzahlungsBetrag + " Euro eingezahlt");
                    break;
                case 2:
                    System.out.println("Wieviel würden Sie gerne abheben?");
                    int abhebungsBetrag = scanner.nextInt();
                    iKontostantzwischenVariable = auszahlung(abhebungsBetrag, iKontostant);
                    iKontostant = iKontostantzwischenVariable;
                    //System.out.println(einzahlung(einzahlungsBetrag, iKontostant));
                    break;
                case 3:
                    System.out.println("Der Konstostand beträgt: " + iKontostant + " Euro");
                    break;
                case 4:
                    doWhileController = false;
                    System.out.println("Machine is stopping!");
                    break;
                default:
            }
        } while (doWhileController == true);
    }

    public static int einzahlung(int a, int b) {
        int i1 = a + b;
        return i1;
    }

    public static int auszahlung(int a, int b) {

        if (b < a) {
            System.out.println("Sie haben nicht genug Geld");
        } else {
            int i1 = b - a;
            System.out.println("Sie haben " + a + " Euro abgehoben");
            return i1;
        }

        return 0;
    }
}
