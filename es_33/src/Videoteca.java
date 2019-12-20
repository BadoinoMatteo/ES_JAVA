import java.util.Arrays;

public class Videoteca {
    private String nome;
    private String indirizzo;
    private Cassetta cassette[];
    private int nCassette;

    Videoteca(String nome, String indirizzo){
        this.nome=nome;
        this.indirizzo=indirizzo;
        this.nCassette=0;
        Cassetta cassette[];
    }

    public void add(Cassetta c){
        cassette[nCassette]=c;
        nCassette++;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void vendo(int codice){
        for(int cont=0;cont<nCassette;cont++){
            if(cassette[nCassette].getCodice()==codice){
                cassette[nCassette].copiaVenduta();
                double prezzo=cassette[nCassette].getPrezzo()-cassette[nCassette].getSconto();
            }
        }
    }

    public void compro(int codice){
        for(int cont=0;cont<nCassette;cont++){
            if(cassette[nCassette].getCodice()==codice){
                cassette[nCassette].copiaComprata();
            }
        }
    }

    public double getValoreNegozio(){
        double prezzo=0;
        for(int cont=0;cont<nCassette;cont++){
            prezzo=prezzo+(DVD.PREZZO-cassette[nCassette].getSconto());
        }
        return prezzo;
    }

    @Override
    public String toString() {
        return "Videoteca{" +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cassette=" + Arrays.toString(cassette) +
                ", nCassette=" + nCassette +
                '}';
    }
}
