public class Barca {
    private int matricola;
    private float dimensioni;
    private int annoCostruzione;

    Barca(int matricola, float dimensioni, int annoCostruzione){
        this.matricola=matricola;
        if(dimensioni>0){
            this.dimensioni=dimensioni;
        }else{
            this.dimensioni=10;
        }
        this.annoCostruzione=annoCostruzione;
    }

    public int getMatricola() {
        return matricola;
    }

    public int getAnnoCostruzione() {
        return annoCostruzione;
    }

    public float getDimensioni() {
        return dimensioni;
    }

    @Override
    public String toString() {
        return "Barca{" +
                "matricola=" + matricola +
                ", dimensioni=" + dimensioni +
                ", annoCostruzione=" + annoCostruzione +
                '}';
    }
}
