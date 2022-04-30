package files;

import java.util.Scanner;

public abstract class prenotazionePosti extends cancellazionePosti{

    public static void prenotazione(boolean posti[]){
        int i=0; //Numero del posto da prenotare
        String b = "y"; // Variabile di continuità del ciclo
        Scanner sc1 = new Scanner(System.in); // Scanner per gli input

        while(b.equals("y")) {
            System.out.println("Qual è il numero del posto che vorresti prenotare?");
            i = sc1.nextInt();

            if (posti[i - 1] == true) {
                System.out.println("Questo posto è già prenotato.");
            } else {
                posti[i - 1] = true;
                System.out.println("Il posto " + i + " è stato prenotato correttamente!");
            }

            System.out.println("Vuoi prenotare un altro posto? (y for yes, any key to exit)");
            b = sc1.next();
        }
    }
}
