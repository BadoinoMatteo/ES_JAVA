public abstract class Vagone {
    private String codice;
    private int pesoVuoto;
    private String AziendaCostruttrice;
    private int annoCostruzione;

    public Vagone(String codice, int pesoVuoto, String aziendaCostruttrice, int annoCostruzione) throws ValoreNonValido {
        this.codice = codice;
        if (pesoVuoto>0){
            this.pesoVuoto = pesoVuoto;
        }else{
            throw new ValoreNonValido("valore minore di zero");
        }
        AziendaCostruttrice = aziendaCostruttrice;
        if (annoCostruzione>0 && annoCostruzione<2021){
            this.annoCostruzione = annoCostruzione;
        }else {
            throw new ValoreNonValido("valore non valido");
        }
    }

    public int getAnnoCostruzione() {
        return annoCostruzione;
    }

    public String getAziendaCostruttrice() {
        return AziendaCostruttrice;
    }

    public String getCodice() {
        return codice;
    }

    public int getPesoVuoto() {
        return pesoVuoto;
    }

    @Override
    public String toString() {
        return "Treno{" +
                "codice='" + codice + '\'' +
                ", pesoVuoto=" + pesoVuoto +
                ", AziendaCostruttrice='" + AziendaCostruttrice + '\'' +
                ", annoCostruzione=" + annoCostruzione +
                '}';
    }

    public abstract int getPesoTotale();
}

