package files;

public abstract class elencoPosti extends prenotazionePosti {

    public static void stampa(boolean posti[]){

        System.out.println("Ecco l'elenco dei posti disponibili (numero posto -> disponibile):");

            for (int i = 0; i < posti.length; i++){
                System.out.print("Posto " + (i+1) + ": ");

                //Controllo se il posto è disponibile
                if(posti[i] == false){
                    System.out.print("disponibile\n");
                }
                else{
                    System.out.print("prenotato/occupato\n");
                }
            }
    }
}
