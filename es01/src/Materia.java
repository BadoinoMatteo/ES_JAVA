public class Materia {
    private String nome;
    private int nvoti;
    private final int MAXVOTI=10;
    private Voto[] voti;

    public Materia(String nome){
        this.nome=nome;
        nvoti=0;
        voti= new Voto[MAXVOTI];
    }

    public void aggiungiVoto(Voto v){
        if(nvoti<MAXVOTI){
            voti[nvoti]=v;
            nvoti++;
        }
    }

    public String getNome() {
        return nome;
    }

    public int getnVoti() {
        return nVoti;
    }
}
