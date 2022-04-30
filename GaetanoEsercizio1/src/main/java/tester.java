import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class tester {
//NB: Il programma non è pensato per evitare input errati, fare attenzione a cosa si inserisce
    public static void main(String[] args) {

        //Istanzio la lista d'attesa
        List<Persona> attesa = new ArrayList<>();
        //Istanzio lo scanner
        Scanner sc = new Scanner(System.in);
        //Variabile per mantenere attivo il programma
        String a = "y";
        //Variabile di assegnazione per lo scanner
        String b = "";
        //Indice della lista da rimuovere
        int x = 999;

        //Riempio la lista(a scopo di test)
        attesa.add(new Privato("Ciro", "Esposito", "ciresp"));
        attesa.add(new Privato("Mario", "Rossi", "maross"));
        attesa.add(new Privato("Anna", "Verdi", "annver"));
        attesa.add(new Azienda("Paolo", "Bianchi", "fiat"));
        attesa.add(new Azienda("Marisa", "Cordini", "tesla"));
        attesa.add(new Azienda("Elena", "Botti", "meta"));

        while(Objects.equals(a, "y")) {
            System.out.println("Attualmente ci sono " + attesa.size() + " persone in coda.");
            System.out.println("Scegliere un opzione:\nNuovo utente privato: p\nNuovo utente business: b" +
                    "\nChiamare un utente allo sportello: c\nNulla: any input");

            b = sc.next();

            switch (b) {
                case "p":
                    Privato privato = new Privato();
                    System.out.println("Nome del privato: ");
                    privato.setNome(sc.next());
                    System.out.println("Cognome del privato: ");
                    privato.setCognome(sc.next());
                    System.out.println("Codice fiscale del privato: ");
                    privato.setCodiceFiscale(sc.next());
                    attesa.add(privato);
                    break;

                case "b":
                    Azienda azienda = new Azienda();
                    System.out.println("Nome del titolare dell'azienda: ");
                    azienda.setNome(sc.next());
                    System.out.println("Cognome del titolare dell'azienda: ");
                    azienda.setCognome(sc.next());
                    System.out.println("Nome dell'azienda: ");
                    azienda.setNomeAzienda(sc.next());
                    attesa.add(azienda);
                    break;

                case "c":
                    if (attesa.size() >= 1) {
                        System.out.println("Vuoi chiamare un privato(p) o un'azienda(a)");
                        System.out.println(attesa);
                        b = sc.next();
                        switch (b) {
                            case "p":
                                System.out.println("Inserisci il codice fiscale: ");
                                b = sc.next();
                                for (Persona codice : attesa
                                ) {
                                    if (codice instanceof Privato) {
                                        if (((Privato) codice).getCodiceFiscale().equals(b)) {
                                            System.out.println("Ho servito un utente privato");
                                            x = attesa.indexOf(codice);
                                            break;
                                        }
                                    }
                                }
                                if(x != 999){
                                    attesa.remove(x);
                                    x = 999;
                                }
                                break;
                            case "a":
                                System.out.println("Inserisci il nome dell'azienda: ");
                                b = sc.next();
                                for (Persona nome : attesa
                                ) {
                                    if (nome instanceof Azienda) {
                                        if (((Azienda) nome).getNomeAzienda().equals(b)) {
                                            System.out.println("Ho servito un utente business");
                                            x = attesa.indexOf(nome);
                                            break;
                                        }
                                    }
                                }
                                if(x != 999){
                                    attesa.remove(x);
                                    x = 999;
                                }
                                break;
                            default:
                        }
                    } else {
                        System.out.println("Non ci sono persone in coda, operazione non valida.");
                    }
                    break;

                default:
                    break;
            }

            System.out.println("Si vogliono effettuare altre operazioni? ('y' for yes, any key to exit)");
            a = sc.next();
        }
        sc.close();
    }
}
