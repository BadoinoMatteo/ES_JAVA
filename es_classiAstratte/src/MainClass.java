public class MainClass {
    public static void main (String arg[]){
        Animale[] a =new Animale[3];
        Scoiattolo b;
        Animale c;
        a[0]=new Scoiattolo(" cip ");
        a[1]=new Leone(" Kimba ");
        a[2]=new Scoiattolo(" ciop ");
        for(int i=0; i<3; i++){
            if(a[i]instanceof Leone){
                System.out.println(((Leone)a[i]).ruggire());
            }
            a[i].presentati();
        }
    }
}
