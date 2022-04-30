package files;

import java.util.Scanner;

public abstract class cancellazionePosti {

    public static void cancellazione(boolean posti[]){
        int i=0; //Numero del posto da cui cancellare la prenotazione
        String b = "y"; // Variabile di continuità del ciclo
        Scanner sc2 = new Scanner(System.in); // Scanner per gli input

        while(b.equals("y")){
            System.out.println("Qual è il numero del posto di cui vorresti cancellare la prenotazione?");
            i = sc2.nextInt();

            if(posti[i-1] == false){
                System.out.println("Questo posto non ha una prenotazione attiva.");
            }
            else{
                posti[i-1] = false;
                System.out.println("La prenotazione del posto " + i + " è stata cancellata correttamente!");
            }

            System.out.println("Vuoi cancellare un'altra prenotazione? (y for yes, any key to exit)");
            b = sc2.next();
        }
    }
}
