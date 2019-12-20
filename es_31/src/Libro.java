public class Libro {
    private String nome;
    private int numPagine;
    private final int DEF_NUM_PAG = 50;

    public Libro(String nome, int numPagine){
        this.nome=nome;
        if (numPagine>0){
            this.numPagine = numPagine;
        }else{
            this.numPagine=DEF_NUM_PAG;
        }
    }

    public String pageMessage(){
        return "Il libro: " + nome +
                ";\nHa: " + numPagine + ";";
    }

    public int getNumPagine() {
        return numPagine;
    }

    public String getNome() {
        return nome;
    }
}
