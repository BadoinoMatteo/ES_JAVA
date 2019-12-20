public class Rettangolo {
    private float altezza;
    private float lunghezza;
    private float area;
    private float perimetro;

    public Rettangolo(){
        this.altezza =0;
        this.lunghezza=0;
    }

    public Rettangolo(double altezza, double lunghezza){
        this.altezza= (float) altezza;
        this.lunghezza= (float) lunghezza;
    }

    public float getArea() {
        return area=((lunghezza*altezza)/2);
    }

    public float getPerimetro() {
        return perimetro=((altezza*2)+(lunghezza*2));
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setLunghezza(float lunghezza) {
        this.lunghezza = lunghezza;
    }

    public float getLunghezza() {
        return lunghezza;
    }

    public boolean quadrato(){
        boolean quadrato=false;
        if(lunghezza==altezza){
            quadrato=true;
        }
        return quadrato;
    }
}
