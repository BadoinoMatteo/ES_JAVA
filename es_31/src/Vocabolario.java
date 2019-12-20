public class Vocabolario extends Libro {
    private int numDefinizioni;
    private final int DEF_NUM_DEF = 50;

    public Vocabolario(String nome, int numPagine, int numDefinizioni){
        super(nome, numPagine);
        if (numDefinizioni>0){
            this.numDefinizioni = numDefinizioni;
        }else{
            this.numDefinizioni = DEF_NUM_DEF;
        }
    }

    public String definitionMessage(){
        return "Vocabolario di: " + getNome() +
                ";\nHa: " + getNumPagine() + " pagine;"+
                "\nHa: " + numDefinizioni + " definizioni;" +
                "\nHa: " + numDefinizioni/getNumPagine() + " definizioni per pagina;";
    }
}