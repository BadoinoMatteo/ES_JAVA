import java.util.Vector;

public class Main {
    public static void main(String arg[]){
        Vector <Solido> solidi=new Vector<Solido>();
        solidi.add(new Cubo(1.0,3.0));
        solidi.add(new Sfera(1.0,3.0));

        for(int i=0;i<solidi.size();i++){
            System.out.println("peso: " + solidi.get(i).peso());
        }
    }
}
