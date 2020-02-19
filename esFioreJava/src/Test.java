import processing.core.PApplet;
import java.awt.*;
public class Test extends PApplet{
    private  Cerchio c;
    private Figura f;
    private Rect r;
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
    }

    public void draw () {
        f=new Figura(20,60, new Color(0,0,80), new Color(0,100,80) );
        
        delay(100);
    }

}
