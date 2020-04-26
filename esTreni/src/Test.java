public class Test {
    public static void main(String[] args) throws ValoreNonValido {
        Treno treno1;
        VagonePasseggeri v1;
        v1=new VagonePasseggeri("CG675", 100, "Cdihiwaaf", 2015, 2, 50, 0);
        treno1=new Treno("ASG69", 150);
        treno1.addVagone(v1);
        VagonePasseggeri v2= new VagonePasseggeri("CG664", 100, "Cdihiwaaf", 2010, 2, 70, 0);
        treno1.addVagone(v2);
        System.out.println(treno1.toString());
        v1.Salgono(30);
        v2.Salgono(10);
        v1.scendono(5);

        System.out.println(treno1.toString());
        Treno treno2=new Treno("gfdjghe", 150);
        VagoneMerci v3=new VagoneMerci("gh5638", 100, "gfduefk", 2000, 25, 1050, 0);
        treno2.addVagone(v3);
        v3.carica(1000);
        v3.scarica(500);
        System.out.println(treno2.toString());
    }
}
