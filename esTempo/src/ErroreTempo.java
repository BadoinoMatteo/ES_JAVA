public class ErroreTempo extends RuntimeException {
    public ErroreTempo(String s){
        super(s); //s= messaggio di errore
    }
    public ErroreTempo(){
        super("Errore ora");
    }
}
