public class Processore {
    private String marca;
    private String modello;
    private int velocitaClock;

    public Processore(String marca, String modello, int velocitaClock) throws ValoreNonValido {
        this.marca = marca;
        this.modello = modello;
        if(velocitaClock>0){
            this.velocitaClock = velocitaClock;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }
    }

    public int getVelocitaClock() {
        return velocitaClock;
    }

    @Override
    public String toString() {
        return "Processore{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", velocitaClock=" + velocitaClock +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }
}
