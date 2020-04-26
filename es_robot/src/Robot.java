import java.util.Vector;

public class Robot {
    private String nome;
    private float costoSec;
    private Processore processore;
    private Memoria[] memoria;
    private int nRam;

    public Robot(String nome, float costoSec, Processore processore) throws ValoreNonValido {
        this.nome = nome;
        if (costoSec>0){
            this.costoSec=costoSec;
        }else {
            throw new ValoreNonValido("valore minore di zero");
        }
        this.processore = processore;
        memoria= new Memoria[4];
    }


    public String getNome() {
        return nome;
    }

    public float getCostoSec() {
        return costoSec;
    }

    public Processore getProcessore() {
        return processore;
    }

    public void setCostoSec(float costoSec) throws ValoreNonValido {
        if (costoSec > 0) {
            this.costoSec = costoSec;
        } else {
            throw new ValoreNonValido("valore minore di zero");
        }
    }

    public void setProcessore(Processore processore) {
        this.processore = processore;
    }

    public void addRam(Memoria ram) throws ValoreNonValido {
        if(nRam<4){
            memoria[nRam]=ram;
        }else {
            throw new ValoreNonValido("non è possibile aggiungere ram");
        }
        nRam++;
    }

    public void deleteRam(Memoria ram) throws ValoreNonValido {
        if(nRam>0){
            memoria[nRam]=null;
        }else {
            throw new ValoreNonValido("ram non più disponibili");
        }
        nRam++;
    }

    public int getnRam() {
        return nRam;
    }

    public Memoria[] getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nome='" + nome + '\'' +
                ", costoSec=" + costoSec +
                ", processore=" + processore +
                ", memoria=" + memoria +
                ", nRam=" + nRam +
                '}';
    }
}
