public class ErroreVettoreVuoto extends Exception {
    public ErroreVettoreVuoto() {
        super("messaggio personalizzato");
    }

    public ErroreVettoreVuoto(String message) {
        super(message);
    }
}
