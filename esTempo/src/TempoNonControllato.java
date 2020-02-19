public class TempoNonControllato {
    private int ora;
    private int min;
    private int sec;

    public TempoNonControllato(){
        this.ora=0;
        this.min=0;
        this.sec=0;
    }

    public TempoNonControllato(int ora, int min)  {
        if(ora>23 || ora<0){
            throw new ErroreTempo("errore ore");
        }else {
            this.ora=ora;
        }
        if(min>59 || min <0){
            throw new ErroreTempo("errore min");
        }else{
            this.min=min;
        }
    }

    public TempoNonControllato(int ora, int min, int sec)  {
        if(ora>23 || ora<0){
            throw new ErroreTempo("errore ore");
        }else {
            this.ora=ora;
        }
        if(min>60 || min<0){
            throw new ErroreTempo("errore min");
        }else{
            this.min=min;
        }

        if(sec>60 || sec<0){
            throw new ErroreTempo("errore secondi");
        }else{
            this.sec=sec;
        }
    }

    public void setMin(int min) {
        if(min>60 || min<0){
            throw new ErroreTempo("errore min");
        }else{
            this.min=min;
        }
    }

    public void setOra(int ora)  {
        if(ora>23 || ora<0){
            throw new ErroreTempo("errore ore");
        }else {
            this.ora=ora;
        }
    }

    public void setSec(int sec)  {
        if(sec>60 || sec<0){
            throw new ErroreTempo("errore secondi");
        }else{
            this.sec=sec;
        }
    }
}
