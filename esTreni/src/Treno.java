import java.util.Vector;

public class Treno {
    private String codice;
    private int portataMaxMotrice;
    private Vector<Vagone> vagoni;

    public Treno(String codice, int portataMaxMotrice) throws ValoreNonValido {
        this.codice = codice;
        if (portataMaxMotrice>0){
            this.portataMaxMotrice = portataMaxMotrice;
        }else {
            throw new ValoreNonValido("peso minore di zero");
        }
        vagoni=new Vector<Vagone>();
    }

    public void addVagone(Vagone v){
        vagoni.add(v);
    }

    public String getCodice() {
        return codice;
    }

    public int getPortataMaxMotrice() {
        return portataMaxMotrice;
    }

    public void RimuoviVagone(Vagone v){
        vagoni.remove(v);
    }

    @Override
    public String toString() {
        String s=" ";
        s+=codice + portataMaxMotrice;
        for (int c=0;c<vagoni.size();c++){
            s+=vagoni.get(c).toString();
        }
        return s;
    }
}
