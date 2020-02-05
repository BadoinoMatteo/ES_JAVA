import java.util.Vector;

public class Carburante {
    private Vector <Float> prezzi;

    void Carburante(){
        prezzi= new Vector <Float>();
    }
    public void add(float element   ){     // o Float value
        prezzi.add(element);
    }

    public float min() throws ErroreGenerale {
        float min;
        if(prezzi.size()==0){
            throw new ErroreGenerale();
        }else {
            min= prezzi.get(0);
            for (int i=1;i<prezzi.size();i++){
                if(prezzi.get(i) > min){
                    min=prezzi.elementAt(i);
                }
            }
        }


        return min;
    }

    public float max(){
        float max = 0;
        if(prezzi.size()==0) {
            throw new ErroreGenerale();
        }else{
            max= prezzi.get(0);
            for (int i=1;i<prezzi.size();i++){
                if(prezzi.get(i) > max){
                    max=prezzi.elementAt(i);
                }
            }
        }

        return max;
    }

    public float media(){
        float media = 0;
        float somma = 0;
        if(prezzi.size()==0){
            throw new ErroreGenerale();
        }else {
            for(int i=0; i<prezzi.size();i++){
                somma=somma+prezzi.get(i);
            }
            media=somma/prezzi.size();
        }
        return media;
    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<prezzi.size();i++){
            s += String.format("%.3f", prezzi);
        }
        return s;
    }


}
