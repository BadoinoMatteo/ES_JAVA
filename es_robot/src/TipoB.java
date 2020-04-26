public class TipoB extends Robot {
    private int numPuntiSaldatura;


    public TipoB(String nome, float costoSec, Processore processore,  int numPuntiSaldatura) throws ValoreNonValido {
        super(nome, costoSec, processore);
        if(numPuntiSaldatura>0){
            this.numPuntiSaldatura=numPuntiSaldatura;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }

    }

    public int getNumPuntiSaldatura() {
        return numPuntiSaldatura;
    }

    @Override
    public String toString() {
        return "TipoB{" +
                "numPuntiSaldatura=" + numPuntiSaldatura +
                '}';
    }
}
