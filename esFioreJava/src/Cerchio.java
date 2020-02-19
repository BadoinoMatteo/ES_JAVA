import processing.core.PApplet;
import java.awt.*;

public class Cerchio extends Figura {
    private PApplet processing;
    private float dim;

     Cerchio(PApplet processing, float cordX, float cordY, Color colore, Color bordi, float dim){
        super(cordX, cordY, colore, bordi );
        this.processing=processing;
        this.dim = dim;
    }

    public void show(){
        processing.stroke(bordi.getRGB());  //colore bordo
        processing.fill(colore.getRGB());  //colore di riempimento
        processing.circle(cordX, cordY, dim);  //centro X,Y e diametro dim
    }
}
