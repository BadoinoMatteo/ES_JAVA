import java.util.Vector;

public class Appartamento {
    private int interno;
    private Vector<Persona>  proprietari;

    public Appartamento(int interno, Vector <Persona> proprietari){}

    public class Stanza {
        private double larghezza, lunghezza;
    }

    public class Palazzo {
        private Vector<Piani> numeroPiani;
        private int MAXPIANI=200;

        public class Piani{

        }
    }
}
