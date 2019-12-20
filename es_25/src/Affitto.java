import java.util.GregorianCalendar;

public class Affitto {
    private String nome;
    private int codicefiscale;
    private GregorianCalendar inizioAffitto;
    private GregorianCalendar fineAffitto;
    private Barca barca;


    Affitto(String nome, int codicefiscale, GregorianCalendar inizioAffitto, GregorianCalendar fineAffitto, Barca barca ){
        this.nome=nome;
        this.codicefiscale=codicefiscale;
            this.inizioAffitto=inizioAffitto;
            this.fineAffitto=fineAffitto;
            this.barca=barca;

    }

    public String getNome() {
        return nome;
    }

    public int getCodicefiscale() {
        return codicefiscale;
    }

    public GregorianCalendar getFineAffitto() {
        return fineAffitto;
    }

    public GregorianCalendar getInizioAffitto() {
        return inizioAffitto;
    }

    public Barca getBarca() {
        return barca;
    }

    @Override
    public String toString() {
        String s="";
         s="Affitto{" +
                "nome=" + nome +
                ", codicefiscale=" + codicefiscale +
                ", inizioAffitto=" + inizioAffitto +
                ", fineAffitto=" + fineAffitto +
                '}';
         return s;
    }
}
