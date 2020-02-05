public class Test {
    public static final void main(String arg[]) throws ErroreVettoreVuoto, ErroreElementoInesistente {
        String s="3|5|10";
        VettoriInteri vett;
        vett = new VettoriInteri(s);
        System.out.println(vett.toString());
        System.out.println("pos elemento:" + vett.cercaElemento(3));
        System.out.println("min vettore=" + vett.minVettore());
        System.out.println("eliminazione elemento: " + vett.eliminaElemento(5));
        System.out.println(vett.toString());
    }
}
