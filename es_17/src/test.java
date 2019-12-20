public class test {
    public static void main(String[] args){
        Giocatore uno = new Giocatore("uno", 25);
        Giocatore due = new Giocatore("due", 20, 50);
        Giocatore tre = new Giocatore("tre", 17, 100);
        uno.setPunteggio(1000);
        System.out.println(uno.toString());
        System.out.println(due.toString());
        System.out.println(tre.toString());
    }
}
