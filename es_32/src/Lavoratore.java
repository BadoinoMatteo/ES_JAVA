public class Lavoratore {
    String nome;
    int livello;
    float stipendio;

    Lavoratore(String nome, int livello){
        this.nome=nome;
        this.livello=livello;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setLivello(int livello) {
        this.livello = livello;
    }

    public int getLivello() {
        return livello;
    }

    public void setStipendio(float stipendio) {
        this.stipendio = stipendio;
    }

    public float getStipendio() {
        return stipendio;
    }

    @Override
    public String toString() {
        return "\nnome:" + nome + "\nlivello:" + livello + "\nstipendio:" + stipendio;
    }
}
