public class TempoControllato {
    private int ora;
    private int min;
    private int sec;

    public TempoControllato(){
        this.ora=0;
        this.min=0;
        this.sec=0;
    }

    public TempoControllato(int ora, int min) throws ErroreTempoControllato {
        if(ora>23 || ora<0){
            throw new ErroreTempoControllato("errore ore");
        }else {
            this.ora=ora;
        }
        if(min>59 || min <0){
            throw new ErroreTempoControllato("errore min");
        }else{
            this.min=min;
        }
    }

    public TempoControllato(int ora, int min, int sec) throws ErroreTempoControllato {
        if(ora>23 || ora<0){
            throw new ErroreTempoControllato("errore ore");
        }else {
            this.ora=ora;
        }
        if(min>60 || min<0){
            throw new ErroreTempoControllato("errore min");
        }else{
            this.min=min;
        }

        if(sec>60 || sec<0){
            throw new ErroreTempoControllato("errore secondi");
        }else{
            this.sec=sec;
        }
    }

    public void setMin(int min) throws ErroreTempoControllato {
        if(min>60 || min<0){
            throw new ErroreTempoControllato("errore min");
        }else{
            this.min=min;
        }
    }

    public void setOra(int ora) throws ErroreTempoControllato {
        if(ora>23 || ora<0){
            throw new ErroreTempoControllato("errore ore");
        }else {
            this.ora=ora;
        }
    }

    public void setSec(int sec) throws ErroreTempoControllato {
        if(sec>60 || sec<0){
            throw new ErroreTempoControllato("errore secondi");
        }else{
            this.sec=sec;
        }
    }
}
