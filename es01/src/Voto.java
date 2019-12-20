public class Voto {
    private Data giorno;
    private float voto;
    private float peso;
    private char tipo;

    public Voto(Data giorno, float voto, float peso, char tipo ){
        this.giorno=giorno;
        if(voto>0 && voto<10){
            this.voto=voto;
        }else{
            this.voto=5;
        }
        if (peso>=0){
            this.peso=peso;
        }else{
            this.peso=1;
        }
        if(tipo=='s' || tipo=='o' || tipo=='p'){
            this.tipo=tipo;
        }else{
            this.tipo='o';
        }
    }


    public String toString(){
        return this.giorno.toString()+ String.format(":%.2f (%.2f) %c" , this.voto, this.peso, this.tipo);
    }
}
