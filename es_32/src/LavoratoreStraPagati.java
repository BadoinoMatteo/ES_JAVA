public class LavoratoreStraPagati extends Lavoratore {
    private int oreStraordinario;
    private float stipendioStraordinario;
    private float stipendio;
    private static final float RETRIBUZIONESTRAORDINARIO= (float) 10.0;

    public  LavoratoreStraPagati ( String  nome , int  livello , int  oreStraordinario, float stipendio ) {
        super (nome, livello);
        if(oreStraordinario<0){
            this.oreStraordinario=0;
    }else{
            this.oreStraordinario=oreStraordinario;
        }
        this.stipendio=stipendio;

    }

    public int getOreStraordinario() {
        return oreStraordinario;
    }

    @Override
    public String toString(){

        return "nome:" + nome + "livello:" + livello + "\nstipendio con straordinari:" + (stipendio+(oreStraordinario*RETRIBUZIONESTRAORDINARIO));

    }
}
