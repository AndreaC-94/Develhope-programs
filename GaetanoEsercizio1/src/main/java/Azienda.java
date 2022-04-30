public class Azienda extends Persona{

    private String nomeAzienda;

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public Azienda(){

    }

    public Azienda(String nome, String cognome, String nomeAzienda){
        setNome(nome);
        setCognome(cognome);
        setNomeAzienda(nomeAzienda);
    }


}
