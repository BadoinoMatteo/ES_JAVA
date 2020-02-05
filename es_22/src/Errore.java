public class Errore extends Exception {
    public Errore() {
        super("messaggio che voglio");
    }

    public Errore(String message) {
        super(message);
    }
}
