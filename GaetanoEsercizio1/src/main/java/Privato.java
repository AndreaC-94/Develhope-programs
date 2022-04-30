public class Privato extends Persona{

    private String codiceFiscale;

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    public Privato (){

    }

    public Privato(String nome, String cognome, String codice){
        setNome(nome);
        setCognome(cognome);
        setCodiceFiscale(codice);
    }

    @Override
    public String toString() {
        return "Privato{" +
                "Nome: " + getNome() + " / Cognome: " + getCognome() + " / CF: " + getCodiceFiscale();
    }
}
