public class Test {
    public static void main(String[] args){
        Giocatore uno = new Giocatore("uno", 25);
        Giocatore due = new Giocatore("due", 20, 50);
        Giocatore tre = new Giocatore("tre", 17, 100);
        uno.setPunteggio(1000);
        System.out.println(uno.toString());
        System.out.println(due.toString());
        System.out.println(tre.toString());
        Squadra team = new Squadra("team");
        team.addGiocatore(uno);
        team.addGiocatore(due);
        team.addGiocatore(tre);
        System.out.println(team.toString());
        team.passatoAnno();
        System.out.println(team.toString());
    }
}
