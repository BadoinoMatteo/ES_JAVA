public class ErroreTempoControllato extends Exception {
    public ErroreTempoControllato(String s){
        super(s); //s= messaggio di errore
    }
    public ErroreTempoControllato(){
        super("Errore ora ");
    }



}


