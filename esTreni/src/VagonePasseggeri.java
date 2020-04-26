public class VagonePasseggeri extends Vagone {
    private int classe;
    private int postiTotali;
    private int postioccupati;
    private final int PESOPERSONA=65;


    public VagonePasseggeri(String codice, int pesoVuoto, String aziendaCostruttrice, int annoCostruzione, int classe, int postiTotali, int postioccupati ) throws ValoreNonValido {
        super(codice, pesoVuoto, aziendaCostruttrice, annoCostruzione);
        if(classe>0){
            this.classe=classe;
        }else{
            throw new ValoreNonValido("valore minore di zero");
        }

        if(postiTotali>0){
            this.postiTotali=postiTotali;
        }else{
            throw new ValoreNonValido("valore minore di zero");
        }

        if(postioccupati>=0){
            this.postioccupati=postioccupati;
        }else{
            throw new ValoreNonValido("valore minore di zero");
        }
    }

    public int getClasse() {
        return classe;
    }

    public int getPostioccupati() {
        return postioccupati;
    }

    public int getPostiTotali() {
        return postiTotali;
    }

    @Override
    public String toString() {
        return "VagonePasseggeri{" +
                "classe=" + classe +
                ", postiTotali=" + postiTotali +
                ", postioccupati=" + postioccupati +
                '}';
    }

    public void scendono(int nPersone) throws ValoreNonValido {
        if (nPersone>=0){
            postioccupati-=nPersone;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }
    }

    public void Salgono(int nPersone) throws ValoreNonValido {
        if (nPersone>=0){
            postioccupati+=nPersone;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }
    }

    public int getPesoTotale(){
        int pesoTotale=0;
        pesoTotale=postioccupati*PESOPERSONA;
        return pesoTotale;
    }
}
