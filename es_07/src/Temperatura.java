public class Temperatura {
    private float gradiC;

    public Temperatura(float gradiC){
        this.gradiC = gradiC;
    }

    public float getGradiF()
    {
        return 32 + ( 9 * this.gradiC / 5);
    }

    public float getGradiC() {
        return gradiC;
    }

    public void setGradiC(float gradiC){
        this.gradiC = gradiC;
    }

    public String toString() {
        String s;
        s = "Gradi centrigradi: " + this.gradiC;
        return s;
    }
}
