package Utility;

public class ValoreNonRange extends Exception {
    public ValoreNonRange() {
        super("valore non compreso nel range");
    }

    public ValoreNonRange(String range) {
        super("valore non nel range" + range);
    }
}
