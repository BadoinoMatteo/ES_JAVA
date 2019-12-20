public class Azienda {
    private String nome;
    private int numDipendenti;
    private static final int MAXDIPENDENTI=100;
    private Lavoratore[] dipendenti;

    public Azienda(String nome){
        this.nome=nome;
        dipendenti=new Lavoratore[MAXDIPENDENTI];
        numDipendenti=0;
    }

    public void  add(Lavoratore a){
        if(numDipendenti<MAXDIPENDENTI){
            dipendenti[numDipendenti]=a;
        }
        numDipendenti++;
    }

    public String getNome() {

        return nome;
    }

    public int getNumDipendenti() {

        return numDipendenti;
    }

    @Override
    public String toString() {
        String s="";
        for(int cont=0;cont<numDipendenti;cont++){
            s += "\ndipendente:" + dipendenti[cont].toString() +"";
        }
        return "Nome azienda: " + nome + "\nLavoratori: " + s;
    }
}


