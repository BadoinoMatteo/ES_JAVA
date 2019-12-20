public class Test {
    public static void main(String arg[]){
        Barca barca=new Barca(12345, 15, 2000);
        Affitto a1= new Affitto("matteo", 1234567, 25, 30, barca );
        Porto porto=new Porto(25);
        porto.addPosto(a1);
        System.out.printf(a1.toString());
        System.out.printf(porto.toString());
    }
}
