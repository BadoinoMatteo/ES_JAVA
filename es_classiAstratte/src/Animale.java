import org.w3c.dom.ls.LSOutput;

public abstract class  Animale {
    public String nome;
    public final int NUM=5;

    public Animale(String nome){
        this.nome=nome;
    }

    public abstract String attivita();
    public abstract String vive();
    public abstract String mangia();
    public void presentati(){
        System.out.println("Mi chiamo" + nome + "mi piace:" + attivita() + "," + "vivo:" + vive()+ "e mangio" + mangia() );
    }
}
