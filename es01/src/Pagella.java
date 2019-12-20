public class Pagella{
    private int periodo;
    private int nMaterie;
    private final int MAXMATERIE=10
    private Materia[] materie;
}

public  Pagella(int periodo){
    this.periodo=periodo;
    nMaterie=0;
    materie=new Materia[MAXMATERIE];
}

    public String toString() {
        String print="";
        for (int i = 0; i < nMaterie; i++) {
            print += "" + votiMaterie[i].toString()+ "";
        }
        return "Pagella\n" + "\tPeriodo: " + periodo + "\n" + print;
    }

public void aggiungiMateria(Materia m){
    if(nMaterie<MAXMATERIE){
        materie[nMaterie]=m;
        nMaterie++;
    }
}

    public void aggiungiVotoMateria(String nomeMateria, Voto v){
        int tro = -1;
        int k = 0;

        while (k < nMaterie && tro == -1 ){
            if (nomeMateria == votiMaterie[k].getNome()){
                tro = k;
            }
            k++;
        }
        if (tro == -1){
            System.out.println(">>>Materia inesistente");
        }
        else{
            votiMaterie[tro].aggiungiVoto(v);
        }
    }

    public int getPeriodo(){
        return periodo;
    }

    public int getNmaterie(){
        return nMaterie;
    }
}