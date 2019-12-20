public class CD extends Cassetta {
   public static double PREZZO=9.50;
    private int nBrani;

    CD(String titolo, int durata, int nBrani ){
        super(titolo, durata);
        this.nBrani=nBrani;
    }

    public int getnBrani() {
        return nBrani;
    }

    public static double getPrezzo() {
        return PREZZO;
    }

    public static void setPrezzo(double prezzo) {
        PREZZO = prezzo;
    }

    @Override
    public String toString() {
        return "CD{ titolo" + getTitolo() + " durata:" + getDurataSec() + "numero brani: " + nBrani + "prezzo: " + getPrezzo() + "}";
    }
}
