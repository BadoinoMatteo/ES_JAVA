import java.util.Vector;

public class Malattia {
    private String nome;
    private float tempoRaddoppio;
    private Vector<Focolaio> focolai;


    public Malattia(String nome, float tempoRaddoppio) {
        this.nome = nome;
        this.tempoRaddoppio = tempoRaddoppio;
        focolai = new Vector<Focolaio>();
    }

    public void addFocolaio(Focolaio f) {
        focolai.add(f);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTempoRaddoppio() {
        return tempoRaddoppio;
    }

    public void setTempoRaddoppio(float tempoRaddoppio) {
        this.tempoRaddoppio = tempoRaddoppio;
    }

    public int calcoloNumContagiati() {
        int numContagiati = 0;
        for (int i = 0; i < focolai.size(); i++) {
            numContagiati += focolai.get(i).getNumInfetti();
        }
        return numContagiati;
    }

    @Override
    public String toString() {
        String s = "";
        s += "nome malattia:" + nome + "\n " + "tempo raddoppio:" + tempoRaddoppio + "\n";
        for (int i = 0; i < focolai.size(); i++) {
            s += focolai.get(i).toString() + "\n";
        }
        return s;
    }

    public float calcoloContagioAbitanti(int numAbitanti) {
        float giorni;
        giorni = (float) numAbitanti / tempoRaddoppio;
        return giorni;
    }

    public float calcoloPartenzaContagio(int numCasi) {
        float giorni;
        giorni = (float) numCasi / tempoRaddoppio;
        return giorni;
    }


    public class Focolaio {
        private String nome;
        private int numInfetti;
        private int numGioniDaInizio;

        public Focolaio(String nome){
            this.nome=nome;
            this.numInfetti=0;
            this.numGioniDaInizio=0;
            Malattia.this.addFocolaio(this);
        }

        public Focolaio(String nome, int numInfetti) throws ValoreNonValido {
            this.nome = nome;
            if(numInfetti<0){
                throw new ValoreNonValido();
            }else{
                this.numInfetti=numInfetti;
            }
            calcoloTempoInizio();
            Malattia.this.addFocolaio(this);
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public int getNumGioniDaInizio() {
            return numGioniDaInizio;
        }

        public void setNumGioniDaInizio(int numGioniDaInizio) throws ValoreNonValido {
            if(numGioniDaInizio<0){
                throw new ValoreNonValido("valore minore di zero");
            }else{
                this.numGioniDaInizio=numGioniDaInizio;
                numInfetti= (int) Math.pow(2,numGioniDaInizio/Malattia.this.tempoRaddoppio);
            }
        }

        public int getNumInfetti() {
            return numInfetti;
        }

        public void setNumInfetti(int numInfetti) throws ValoreNonValido {
            if(numInfetti<0){
                throw new ValoreNonValido();
            }else{
                this.numInfetti=numInfetti;
            }
        }

        public void calcoloTempoInizio(){
            numGioniDaInizio= (int) (Math.log10(numInfetti)/Math.log10(2)*Malattia.this.tempoRaddoppio);
        }

        @Override
        public String toString() {
            return "Focolaio{" +
                    "nome='" + nome + '\'' +
                    ", numInfetti=" + numInfetti +
                    ", numGioniDaInizio=" + numGioniDaInizio +
                    '}';
        }
    }
}