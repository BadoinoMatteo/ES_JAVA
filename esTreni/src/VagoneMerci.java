public class VagoneMerci extends Vagone {
    private int volumeCarico;
    private int pesoMax;
    private int pesoEffettivo;

    public VagoneMerci(String codice, int pesoVuoto, String aziendaCostruttrice, int annoCostruzione, int volumeCarico, int pesoMax, int pesoEffettivo) throws ValoreNonValido {
        super(codice, pesoVuoto, aziendaCostruttrice, annoCostruzione);
        if(pesoEffettivo>=0){
            this.pesoEffettivo=pesoEffettivo;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }
        if(pesoMax>0){
            this.pesoMax=pesoMax;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }
        if(volumeCarico>0){
            this.volumeCarico=volumeCarico;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }
    }

    @Override
    public int getPesoTotale() {
        return pesoEffettivo;
    }

    public int getPesoEffettivo() {
        return pesoEffettivo;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public int getVolumeCarico() {
        return volumeCarico;
    }

    public void carica(int peso) throws ValoreNonValido {
        if (pesoEffettivo+peso<pesoMax){
            pesoEffettivo+=peso;
        }else {
            throw new ValoreNonValido("superato peso MAX");
        }
    }

    public void scarica(int peso) throws ValoreNonValido {
        pesoEffettivo-=peso;
    }

    @Override
    public String toString() {
        return "VagoneMerci{" +
                "volumeCarico=" + volumeCarico +
                ", pesoMax=" + pesoMax +
                ", pesoEffettivo=" + pesoEffettivo +
                '}';
    }
}
