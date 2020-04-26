import java.util.GregorianCalendar;

public class Cliente {
    private String nome;
    private String cognome;
    private GregorianCalendar natoIl;
    private String indirizzo;

    public Cliente(String nome, String cognome, GregorianCalendar natoIl, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.natoIl = natoIl;
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getCognome() {
        return cognome;
    }

    public GregorianCalendar getNatoIl() {
        return natoIl;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", natoIl=" + natoIl.getTime() +
                ", indirizzo='" + indirizzo + '\'' +
                '}';
    }
}
