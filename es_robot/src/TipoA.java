public class TipoA extends Robot {
    private int spessoreTaglio;
    private int precisione;


    public TipoA(String nome, float costoSec, Processore processore,  int spessoreTaglio, int precisione ) throws ValoreNonValido {
        super(nome, costoSec, processore);
        if (precisione>0){
            this.precisione=precisione;
        }else{
            throw new ValoreNonValido("valore minore di zero");
        }

        if (spessoreTaglio>0){
            this.spessoreTaglio=precisione;
        }else{
            throw new ValoreNonValido("valore minore di zero");
        }
    }

    public int getPrecisione() {
        return precisione;
    }

    public int getSpessoreTaglio() {
        return spessoreTaglio;
    }

    @Override
    public String toString() {
        return "TipoA{" +
                "spessoreTaglio=" + spessoreTaglio +
                ", precisione=" + precisione +
                '}';
    }
}
