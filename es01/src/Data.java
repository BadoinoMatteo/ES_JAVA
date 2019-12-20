public class Data {
    private int g;
    private int m;
    private int a;

    Data d;
    public Data(int g, int m, int a){
       int []v={31,28,31,30,31,30,31,31,30,31,30,31};

       if(m > 0 && m<13){
           this.m=m;
       }
       else{
           this.m=1;
       }
        if (v[m-1] >= g && g > 0){
            this.g=g;
        }
        else{
            this.g=1;
        }
        if (a > 0){
            this.a=a;
        }
        else{
            this.a=2000;
        }
    }
    public String toString(){
        String s;

        s=g + "/" + m + "/" +a;
        return s;
    }

    public void setG(int g) {
        int []v={31,28,31,30,31,30,31,31,30,31,30,31};

        if (v[m-1] >= g && g > 0){
            this.g=g;
        }else{
            this.g=1;
        }
    }

    public void setA(int a) {

        if (a > 0){
            this.a=a;
        }else{
            this.a=2000;
        }
    }

    public void setM(int m) {

        if (m > 0 && m < 13){
            this.m=m;
        }else{
            this.m=1;
        }
    }

    public int getG() {

        return g;
    }

    public int getM() {

        return m;
    }

    public int getA() {

        return a;
    }
}

