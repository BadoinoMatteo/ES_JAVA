public class Classe {
    private int anno;
    private String sezione;
    private static final int ANNOMIN=1;
    private static final int ANNOMAX=5;

    public Classe(int anno, String sezione){
        if(anno>=ANNOMIN && anno<=ANNOMAX){
            this.anno=anno;
        }else{
            this.anno=ANNOMIN;
        }
        this.sezione=sezione;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        if(anno>=ANNOMIN && anno<=ANNOMAX){
            this.anno=anno;
        }else{
            this.anno=ANNOMIN;
        }
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "anno=" + anno +
                ", sezione='" + sezione + '\'' +
                '}';
    }

    public boolean stessaSezione(Classe a){
        boolean uguali;
        if(this.sezione.equals(a.getSezione())){
            uguali = true;
        }else{
            uguali = false;
        }
        return uguali;
    }
}
