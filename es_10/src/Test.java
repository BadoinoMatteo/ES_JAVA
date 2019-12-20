import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        double raggio = 0;
        double base = 0;
        double altezza=0;
        boolean err=true;

        do{
            System.out.printf("inserisci raggio cerchio");
            try {
                raggio= Float.parseFloat(tastiera.readLine());
                err=false;
            } catch (IOException e) {
                System.out.printf("ERRORE I/O");
            } catch (NumberFormatException e){
                System.out.println("non hai inserito un valore reale");
            }
        }while(err || raggio<0);


        Cerchio cerchio=new Cerchio((float) raggio);
        err=true;
        do{
            System.out.printf("inserisci la base del rettangolo");
            try {
                base= Float.parseFloat(tastiera.readLine());
                err=false;
            } catch (IOException e) {
                System.out.printf("ERRORE I/O");
            } catch (NumberFormatException e){
                System.out.println("non hai inserito un valore reale");
            }
        }while (err || base<0);

        err=true;
        do{
            System.out.printf("inserisci altezza rettangolo");
            try {
                altezza= Float.parseFloat(tastiera.readLine());
                err=false;
            } catch (IOException e) {
                System.out.printf("ERRORE I/O");
            } catch (NumberFormatException e){
                System.out.printf("non hai inserito un valore reale");
            }
        }while (err || altezza<0);


        Rettangolo rettangolo= new Rettangolo(base, altezza);
        boolean vero=rettangolo.quadrato();
        System.out.printf("\n" + String.valueOf(vero));

        if((cerchio.getArea())==(rettangolo.getArea())){
            System.out.printf("\nil cerchio e il rettangolo sono equivalenti");
        }else{
            System.out.printf("\nil cerchio e il rettangolo non sono equivalenti");
        }

    }
}
