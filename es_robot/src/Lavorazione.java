public class Lavorazione {
    private String nome;
    private int secondi;
    private Robot robotUsato;

    public Lavorazione(String nome, int secondi, Robot robotUsato) throws ValoreNonValido {
        this.nome = nome;
        if(secondi>0){
            this.secondi = secondi;
        }else{
            throw new ValoreNonValido("valore minore di zero");
        }
        this.robotUsato = robotUsato;
    }

    public String getNome() {
        return nome;
    }

    public int getSecondi() {
        return secondi;
    }

    public Robot getRobotUsato() {
        return robotUsato;
    }

    public float getCostoTotale(){
        float costoTotale;
        costoTotale=robotUsato.getCostoSec()*secondi;
        return costoTotale;
    }

    @Override
    public String toString() {
        return "Lavorazione{" +
                "nome='" + nome + '\'' +
                ", secondi=" + secondi +
                ", robotUsato=" + robotUsato +
                '}';
    }
}
