import Utility.Tastiera;
import Utility.ValoreNonRange;

public class Test {
    public static void main(String arg[]) throws ValoreNonRange {
        int num;
        num= Tastiera.leggiIntero("inserisci un numero" , 6, 10);
        float numero;
        numero=Tastiera.leggiFloat("inserisci un numero", 1.10f, 2.5f);
        double numDouble;
        numDouble=Tastiera.leggiDouble("inserisci un numero", 6.70, 10.80);
    }
}
