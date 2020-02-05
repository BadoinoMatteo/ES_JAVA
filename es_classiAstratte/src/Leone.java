public class Leone extends Animale {
    public Leone(String nome) {
        super(nome);
    }

    @Override
    public String attivita() {
        return " cacciare ";
    }

    @Override
    public String vive() {
        return " nella savana ";
    }

    @Override
    public String mangia() {
        return " carne ";
    }

    public String ruggire(){
        return "roar";
    }
}
