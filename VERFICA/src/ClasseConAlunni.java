public class  ClasseConAlunni extends Classe {
    private int numAlunni;
    private static final int MAXALUNNI=30;

    public ClasseConAlunni(int anno, String sezione, int numAlunni){
        super (anno, sezione);
        if(numAlunni<=MAXALUNNI){
            this.numAlunni=numAlunni;
        }else {
            this.numAlunni = MAXALUNNI;
        }
    }

    public int getNumAlunni() {
        return numAlunni;
    }

    public void setNumAlunni(int numAlunni) {
        if(numAlunni<=MAXALUNNI){
            this.numAlunni=numAlunni;
        }else {
            this.numAlunni = MAXALUNNI;
        }
    }

    @Override
    public String toString() {
        return "anno:" + getSezione() + "sezione:" + getSezione() + "numero alunni: " + this.numAlunni;
    }
}
