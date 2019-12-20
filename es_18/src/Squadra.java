public class Squadra {
    private String nome;
    private Giocatore[] giocatori;
    private final int N_MAX_GIOCATORI = 10;
    private int numGiocatori;

    public Squadra(String nome){
        this.nome=nome;
        giocatori=new Giocatore[N_MAX_GIOCATORI];
    }

    public void addGiocatore(Giocatore g){
        if (numGiocatori<N_MAX_GIOCATORI){
            giocatori[numGiocatori]=g;
        }
        numGiocatori++;
    }
    public void setPunteggio(String nome, double valore){
        int cont = 0;
        int tro = -1;

        while (cont<numGiocatori && tro==-1){
            if (nome.equals(giocatori[cont].getNome())){
                giocatori[cont].setPunteggio(valore);
            }
            cont++;
        }
    }

    public double getPunteggioMedio(){
        double somma=0;
        for (int cont = 0; cont < numGiocatori; cont++){
            somma = somma + giocatori[cont].getPunteggio();
        }
        return somma/numGiocatori;
    }

    public void passatoAnno(){
        int t=0;
        for (int cont = 0; cont < numGiocatori; cont++){
            t = giocatori[cont].getEta() + 1;
            giocatori[cont].setEta(t);
            t=0;
        }
    }

    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < numGiocatori; i++) {
            s += "" + giocatori[i].toString()+ "\n";
        }
        return "Nome Team: " + nome + "\nGiocatori:\n" + s;
    }
}