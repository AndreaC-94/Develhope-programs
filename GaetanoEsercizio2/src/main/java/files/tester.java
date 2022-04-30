package files;

import java.util.Scanner;

public class tester extends elencoPosti{

    public static void main(String[] args) {

        //Array dei posti disponibili, la prima riga è per il posto, la seconda per la prenotazione
        boolean[] posti = new boolean[10];

        //Variabile di continuità del programma
        String a = "y";

        //Scanner per gli input
        Scanner sc = new Scanner(System.in);

        System.out.println("Benvenuto/a nel programma del cinema Develhope!");

        while(a.equals("y")){
            System.out.println("Cosa vuoi fare?\nl = elenco posti disponibili\np = prenotare un posto" +
                    "\nc = cancellare una prenotazione\n altro = nulla");
            a = sc.next();

            switch (a){
                case "l"-> stampa(posti);
                case "p"-> prenotazione(posti);
                case "c"-> cancellazione(posti);
                default -> {}
            }

            System.out.println("Vuoi effettuare un'altra operazione? (y for yes, any key to exit)");
            a = sc.next();
        }
        System.out.println("\nTorna presto a trovarci!");
        sc.close();
    }
}
