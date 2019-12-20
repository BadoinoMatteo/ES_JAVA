public class test {
    public static void main(String[] arg){
        Telecomando controllo=new Telecomando();

        controllo.setAcceso();
        System.out.println( controllo.toString());

        controllo.setCanaleUp();
        System.out.println( controllo.toString());
        controllo.setVolumeDown();
        controllo.muto();
        controllo.muto();
        controllo.setVolumeUp();
        System.out.println(  controllo.toString());

        controllo.setAcceso();
        System.out.println( controllo.toString());
    }
}
