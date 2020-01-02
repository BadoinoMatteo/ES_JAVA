import processing.core.PApplet;
import java.awt.*;
public class Inizio extends PApplet {
    private Cerchio c;
    private static final int cordX = 1280;
    private static final int cordY = 720;
    public static void main(String[] args) {
        PApplet.main("Inizio");
    }

        public void settings () {
            size(cordX, cordY);
        }

        public void setup () {
            background(0,0,0);
            c= new Cerchio(this);
        }
        public void draw () {
            c.setCordX(random(cordX));
            c.setCordY(random(cordY));
            c.setDim(random(500));
            c.show();
            c.setColore(new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255)));
            c.setBordo(new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255)));
            delay(100);
    }
}
