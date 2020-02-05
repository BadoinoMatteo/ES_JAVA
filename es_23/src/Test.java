import java.util.Vector;
public class Test {
    public static void main(String[] args) {
        Carburante c= new Carburante();
        c.add(2.5f);
        c.add(3.7f);
        System.out.println(c.toString());
        System.out.println(c.max());
        System.out.println(c.min());
        System.out.println(c.media());
    }
}
