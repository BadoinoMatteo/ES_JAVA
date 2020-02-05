import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class VettoriInteri {
    private  int[] vettore;
    private static int MAX=100;
    private int cont;

    public VettoriInteri(int num){
        vettore=new int[num];
        this.cont=num;
        for(int i=0; i<cont;i++){
            vettore[i]=0;
        }
    }

    public VettoriInteri(String elements) throws NumberFormatException {
        String [] vetS= elements.split("\\|");
        vettore=new int[vetS.length];
        for(int i=0; i<vetS.length; i++){
            vettore[i]= parseInt(vetS[i]);
            cont++;
        }

    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public int minVettore() throws ErroreVettoreVuoto {
        int min=vettore[0];
        if(cont==0) {
            throw new ErroreVettoreVuoto("vettore vuoto");
        }else {
            for(int i=0;i<cont;i++) {
                if (min > vettore[i]) {
                    min = vettore[i];
                }
            }

        }
        return min;
    }

    public int cercaElemento(int elemento) throws ErroreElementoInesistente {
        int trovato=0;
        int i=0;
        int torna;
        do{
            if(vettore[i]==elemento){
                trovato=1;
            }
            i++;
        }while(i<cont && trovato==-1);

        if(trovato==-1){
            throw new ErroreElementoInesistente("elemento inesistente");
        }else{
            torna=i-1;
        }
        return torna;
    }

    public boolean eliminaElemento(int elemento){
        boolean trovato=false;
        int i=0;
        do{
            if(vettore[i]==elemento){
                for(int k=i;k<cont-1;cont++){
                    vettore[k]=vettore[i+1];
                }
                trovato=true;
            }
            i++;
        }while (i<cont && trovato==false);
        cont--;
        return trovato;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < cont; i++) {
            s += String.format("v[%d]\t\t->\t\t%d\n" , i, vettore[i]);
        }
        return s;
    }
}
