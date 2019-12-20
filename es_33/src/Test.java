import java.io.bufferReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String args[]){
        DVD dvd1=new DVD("FILM", 120 );
        DVD dvd2= new DVD("tre", 240);
        CD cd1= new CD("HIT", 40, 10);
        CD cd2= new CD("CANZONIITALIANE", 60, 20);
        Videoteca videoteca= new Videoteca("VIDEOTECA", "Cuneo");
        videoteca.add(dvd1);
        videoteca.add(dvd2);
        videoteca.add(cd1);
        videoteca.add(cd2);
        videoteca.compro(1234);
        videoteca.vendo(2345);
        System.out.println(videoteca.getValoreNegozio());
        integer.parseFloat
    }
}
