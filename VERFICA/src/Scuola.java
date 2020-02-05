import java.util.Arrays;

public class Scuola {
    private String nome;
    private int numClassi;
    private static final int MAXCLASSI=50;
    private Classe[] classi;

    public Scuola(String nome){
        this.nome=nome;
        classi =new Classe[MAXCLASSI];
        numClassi=0;
    }

    public void addClasse(Classe c){
        if(numClassi<MAXCLASSI){
            classi[numClassi]=c;
        }
        numClassi++;
    }


    public String getNome() {
        return nome;
    }

    public int getNumClassi() {
        return numClassi;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumClassi(int numClassi) {
        this.numClassi = numClassi;
    }

    @Override
    public String toString() {
        return "Scuola{" +
                "nome='" + nome + '\'' +
                ", numClassi=" + numClassi +
                ", classi=" + Arrays.toString(classi) +
                '}';
    }
}
