public class Memoria {
    private float gb;
    private String marca;

    public Memoria(float gb, String marca) throws ValoreNonValido {
        if(gb>0){
            this.gb = gb;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }
        this.marca = marca;
    }

    public float getGb() {
        return gb;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "gb=" + gb +
                ", marca='" + marca + '\'' +
                '}';
    }
}
