public class Cassetta {
    private int codice;
    private String titolo;
    private int durataSec;
    private double sconto;
    private int nCopie;

    Cassetta(String titolo, int durata){
        this.titolo=titolo;
        this.durataSec=durata;
        this.codice=(int)(Math.random()*101)+100;
        this.nCopie=0;
        this.sconto=0;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getCodice() {
        return codice;
    }

    public int getDurataSec() {
        return durataSec;
    }

    public double getSconto() {
        return sconto;
    }

    public void setSconto(double sconto) {
        this.sconto = sconto;
    }

    public void copiaVenduta(){
        nCopie--;
    }
    public void copiaComprata(){
        nCopie++;
    }

    @Override
    public String toString() {
        return "Cassetta{" +
                "codice=" + codice +
                ", titolo='" + titolo + '\'' +
                ", durataSec=" + durataSec +
                ", sconto=" + sconto +
                ", nCopie=" + nCopie +
                '}';
    }
}
