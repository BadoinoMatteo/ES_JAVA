import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Controllo c;
        Addetto a = new Addetto();
        Merci m= new Merci();
        Passeggero s= new Passeggero();
        PuntoControllo p= new PuntoControllo();
        GregorianCalendar dataOra= new GregorianCalendar(2020, 04, 23, 15, 30 );
        c=new Controllo(a,p, dataOra, s);
        c.addMerce(m);
        System.out.println(c.totaleDazi());
        System.out.println(c.toString());
    }
}
