import processing.core.PApplet;

import java.awt.*;

public class Rect extends Figura {
    private float b;
    private float h;
    private PApplet processing;

    Rect(float cordX, float cordY, Color colore, Color bordi, float base, float altezza, PApplet processing){
        super(cordX, cordY, colore, bordi);
        this.processing=processing;
        b=base;
        h=altezza;
    }

    public void show(){
        processing.stroke(bordi.getRGB());  //colore bordo
        processing.fill(colore.getRGB());  //colore di riempimento
        processing.rect(cordX, cordY, b, h);  //centro X,Y e diametro dim
    }

}
