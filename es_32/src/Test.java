public class Test {
    public static void main(String[] args){
        Lavoratore a= new Lavoratore( "matteo" , 2);
        a.setStipendio(5000);
        Lavoratore b=new Lavoratore("francesco", 0);
        b.setStipendio(2500);
        System.out.println(a.toString());
        LavoratoreStraPagati c= new LavoratoreStraPagati("matteo ", 2, 20, 2000);
        //c.setStipendio(3000);
        System.out.println(c.toString());
        Azienda d=new Azienda("Trasporti");
        d.add(a);
        d.add(b);
        Lavoratore e=new Lavoratore("mario", 10);
        e.setStipendio(5000);
        d.add(e);
        System.out.println(d.toString());
    }
}
