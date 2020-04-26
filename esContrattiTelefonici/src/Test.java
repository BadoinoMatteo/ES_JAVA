import java.util.GregorianCalendar;

public class Test {
     public static void main(String[] args) {
        Cliente c1= new Cliente("Matteo", "Badoino", new GregorianCalendar(2002,07, 25), "bdskhiog");
        Contratto contratto1=new Contratto("3474925892", new GregorianCalendar(2020,04,02), TipoContratto.EVO, c1);
        contratto1.AddNumeroGratis("7489275433");
        Opzione opzione1= new Opzione("matteo", 50.50, "prova");
        contratto1.addOpzione(opzione1);
         System.out.println(contratto1.toString());
     }
}
