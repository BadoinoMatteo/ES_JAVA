public class Test {
    public static void main(String[] args) throws ValoreNonValido {
        Robot r1;
        Memoria mem1= new Memoria(2048, "asus");
        Processore p1= new Processore("intel", "i5", 2);
        r1=new Robot("ciao", 2, p1);
        r1.addRam(mem1);
        TipoC r2= new TipoC("mat", 3, new Processore("intel", "pentium", 2), TipoMateriale.FERRO);
        r2.addRam(mem1);
        r1.addRam(mem1);
        r1.deleteRam(mem1);
        Lavorazione l1= new Lavorazione("taglio", 2500, r2);
        System.out.println(l1.getCostoTotale());
        System.out.println(r1.toString());
    }
}
