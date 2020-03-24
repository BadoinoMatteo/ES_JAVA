public class main {
    public static void main(String arg[]) throws ValoreNonValido {
        Malattia covid19;
        covid19=new Malattia("Covid-19", 7.4f);
        Malattia.Focolaio piemonte=covid19.new Focolaio("Piemonte", 1250);
        System.out.println(covid19.toString());
        System.out.println(covid19.calcoloContagioAbitanti(4356406));
        System.out.println(covid19.calcoloPartenzaContagio(1890));
        Malattia.Focolaio lombardia=covid19.new Focolaio("Lombardia", 12098);
        System.out.println(covid19.toString());
        System.out.println("numero contagiati:" + covid19.calcoloNumContagiati());
    }
}
