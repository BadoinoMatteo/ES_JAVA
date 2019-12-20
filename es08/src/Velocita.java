public class Velocita {
    private float vel;

    public Velocita(float vel){

        this.vel=0;
    }

    public String toString(){
        String s;
        s="velocità [km/h]=" + vel;
        return s;
    }

    public float getVel() {

        return vel;
    }

    public void setVel(float vel) {

        this.vel = vel;
    }

    public void setVelMs(float vel)
    {
        this.vel =(float) (vel*3.6);
    }

    public float getVelMs() {

        return  (float) (vel/3.6);
    }
}
