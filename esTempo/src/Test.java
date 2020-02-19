public class Test {
    public static void main(String arg[]){
        TempoNonControllato t1;
        TempoControllato t2;



        try {
            t2=new TempoControllato(45,78,90);
        }catch (ErroreTempoControllato e){
            e.printStackTrace();
        }
        System.out.println("ciao");

        try {
            t1=new TempoNonControllato(25, 55);
        }catch (ErroreTempo e){
            e.printStackTrace();
        }
    }
}
