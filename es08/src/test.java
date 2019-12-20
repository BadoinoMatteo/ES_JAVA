public class test {
    public static void main(String[] args){
        Velocita vel=new Velocita();
        vel.setVelMs(2.5f);
        vel.setVel();
        System.out.println(vel.toString());
        System.out.println("velocità in m/s: " + vel.getVelMs());
    }
}
