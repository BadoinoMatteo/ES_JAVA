public class Giocatore {
    private String nome;
    private int eta;
    private double punteggio;
    private Giocatore[] squadra;
    private final int MAXGIOCATORI=10;
    private int nGiocatori=0;

    public Giocatore(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
        squadra= new Giocatore[MAXGIOCATORI];
    }

    public Giocatore(String nome, int eta, double punteggio){
        this.nome=nome;
        this.eta=eta;
        this.punteggio=punteggio;
        squadra= new Giocatore[MAXGIOCATORI];
    }

    public String getNome(){

        return nome;
    }

    public double getPunteggio() {

        return punteggio;
    }

    public void setPunteggio(double punteggio) {

        this.punteggio = punteggio;
    }

    public int getEta() {

        return eta;
    }

    public void aggiungiGiocatore(){
        if(nGiocatori<MAXGIOCATORI){

        }

    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n\tEtà: " + eta + "\n\tPunteggio: " + punteggio;
    }

    public void setEta(int eta) {
        this.eta=eta;
    }
}

