public class Cerchio {
    private static final double PI = 3.14;
    private float raggio;

    public Cerchio(){

        raggio=0;
    }

    public Cerchio(float raggio)
    {
        this.raggio=raggio;
    }

    public void setRaggio(float raggio)
    {
        this.raggio = raggio;
    }

    public float getRaggio()
    {
        return raggio;
    }

    public float getArea()
    {
        float area;
        return area= (float) PI*(raggio*raggio);
    }

    public float getCirconferenza() {
        float circonferenza;
        return circonferenza= (float) (PI*raggio);
    }
}
