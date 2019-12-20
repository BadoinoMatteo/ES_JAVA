public class main {
    public static void main(String[] args){
        final int NUMCLASSI=30;
        final int MAXALUNNI=30;
        final int MINALUNNI=15;
        int sommaAlunni=0;
        float mAlunni=0;
        int maxAlunni=0;
        int minAlunni=500;
        int numAlunniClasse[]= new int[NUMCLASSI];
        for ( int i=0; i<NUMCLASSI ; i=i+1){
            numAlunniClasse[i]=(int)((Math.random()*(MAXALUNNI-MINALUNNI+1)+MINALUNNI));
        }

        for(int i=1; i<NUMCLASSI; i++){
            if(numAlunniClasse[i]>=maxAlunni){
                maxAlunni=numAlunniClasse[i];
            }else{
                if(numAlunniClasse[i]<=minAlunni){
                    minAlunni=numAlunniClasse[i];
                }
            }
            sommaAlunni=sommaAlunni+numAlunniClasse[i];

        }
        mAlunni=(float)sommaAlunni/NUMCLASSI;
        for(int i=0;i<NUMCLASSI;i++){
            System.out.println("numero alunni classe " + i + ":" + numAlunniClasse[i]);
        }
        System.out.println("numero alunni totali: " + sommaAlunni + "\nmedia alunni per classe:"+ mAlunni+  "\n numero massimo di alunni presenti:" + maxAlunni + "\n numero minimo di alunni presenti:" + minAlunni);


    }


}
