public class Test {
    public static void main(String[] args){
        Classe a= new Classe(4, "a");
        Classe b=new Classe(2,"c");
        ClasseConAlunni c=new ClasseConAlunni(3, "a", 25);
        ClasseConAlunni d=new ClasseConAlunni(5, "a", 20);
        boolean uguali=c.equals(d);
        if(uguali==true){
            System.out.println("STESSA SEZIONE");
        }else{
            System.out.println("NON SONO LA STESSA SEZIONE");
        }
        Scuola s=new Scuola("pippo");
        s.addClasse(a);
        s.addClasse(b);
        System.out.println(s.toString());
    }
}
