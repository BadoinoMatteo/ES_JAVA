public class ErroreElementoInesistente extends Exception {
    public ErroreElementoInesistente() {
        super("messaggio personalizzato");
    }

    public ErroreElementoInesistente(String message) {
        super(message);
    }
}
