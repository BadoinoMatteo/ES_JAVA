public class text {
    public static void main(String[] arp) {
        Data d;
        int g = 0;
        int m = 0;
        int a = 0;
        Materia m;

        //Voto v1;
        d = new Data(21, 10, 2019);
        d.setG(24);
        d.setM(10);
        d.setA(2019);
        System.out.println(d.getG());
        System.out.println(d.getM());
        System.out.println(d.getA());
        System.out.println(d.toString());
        Voto v1 = new Voto(d, 7f, 1f, 's');
        Voto v2 = new Voto(new Data(25, 10, 2019), 9f, 0.5f, 'p');
        System.out.println(v1);
        System.out.println(v2);
        Materia m= new Materia("italiano");
        m.aggiungiVoto(v2);
        System.out.println(m);
        Pagella g=new Pagella (3);
        g.aggiungiMateria(m);
        System.out.println(g);
    }
}
