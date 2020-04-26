import java.util.GregorianCalendar;
import java.util.Vector;

public class Controllo {
    private Addetto adetto;
    private PuntoControllo gate;
    private GregorianCalendar dataOra;
    private Esito esito;
    private Passeggero passeggero;
    private Vector <Merci> merci;

    public Controllo(Addetto addetto, PuntoControllo gate, GregorianCalendar dataOra, Passeggero passeggero){
        this.adetto=addetto;
        this.gate=gate;
        this.dataOra=dataOra;
        this.passeggero=passeggero;
        merci=new Vector<>();
    }

    public void addMerce(Merci a){
        merci.add(a);
    }

    public float totaleDazi(){
        float dazioDaPagare=0;
        for (int c=0; c<merci.size(); c++){
            dazioDaPagare+=merci.get(c).getDazio();
        }
        return dazioDaPagare;
    }

    public Addetto getAdetto() {
        return adetto;
    }

    public Passeggero getPasseggero() {
        return passeggero;
    }

    public GregorianCalendar getDataOra() {
        return dataOra;
    }

    public PuntoControllo getGate() {
        return gate;
    }

    public void esitoControllo(){
        esito=Esito.NESSUNASEGNALAZIONE;
    }

    public Esito getEsito() {
        return esito;
    }

    public Vector<Merci> getMerci() {
        return merci;
    }

    public String toString(){
        String s="";
        s+= "controllo effettuato da" + adetto + "\ncontrollo effettuato nel gate:" + gate +  "\n passeggero controllato:" + passeggero
                + "\nesito controllo :" + esito + "\ncontrollo effettuato in data e ora:" + dataOra.getTime() + "\ntotale da pagare:" + totaleDazi();
        for (int c=0; c<merci.size(); c++){
            s+=merci.get(c).toString();
        }
        return s;
    }
}
