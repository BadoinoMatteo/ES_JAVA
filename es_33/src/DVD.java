import java.util.Arrays;

public class DVD extends Cassetta {
    public static double PREZZO=9.50;
    private int nLingue;
    private  final static int MAXLINGUE=5;
    private TipoLingua lingue[];

    DVD(String titolo, int durata){
        super(titolo, durata);
        nLingue=0;
        lingue=new TipoLingua[MAXLINGUE];
    }

    public int getnLingue() {
        return nLingue;
    }

    public static double getPrezzo() {
        return PREZZO;
    }

    public static void setPrezzo(double prezzo) {
        DVD.PREZZO = prezzo;
    }

    public void addLingua(TipoLingua lingua){
        if(nLingue<MAXLINGUE){
            lingue[nLingue]=lingua;
        }
        nLingue++;
    }

    public String getLingue(){
        String s="";
        for(int cont=0; cont<nLingue;cont++){
            s=s+ lingue[cont];
        }
        return s;
    }

    @Override

    public String toString(){
        return "titolo" +  getTitolo() + "durata:" +  getDurataSec() + "prezzo:" + PREZZO + "numero lingue disponibili: " + nLingue + "lingue disponibili:" +  getLingue();
    }
}
