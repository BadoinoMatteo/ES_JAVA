import java.awt.*;  //per la classe color
import processing.core.PApplet;
import java.math.*;

import static javafx.scene.paint.Color.color;

public class Cerchio {
    private float dim;   //diametro cerchio
    private final static int DIM_DEFAULT = 100;
    private float cordX;
    private float cordY;
    private Color colore;
    private Color bordo;
    private PApplet processing;

    public Cerchio(PApplet processing){
        this.processing=processing;
        cordX = (float) Math.random()*processing.width;  //piazzato al centro della finestra
        cordY =(float) Math.random()*processing.height;
        colore = new Color((int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
        bordo =  new Color( (int) (Math.random()*255), (int) (Math.random()*255), (int) (Math.random()*255));
        dim = DIM_DEFAULT;
    }

    public void show(){
        processing.stroke(bordo.getRGB());  //colore bordo
        processing.fill(colore.getRGB());  //colore di riempimento
        processing.circle(cordX, cordY, dim);  //centro X,Y e diametro dim
    }

    public void setDim(float dim) {
        this.dim = dim;
    }

    public void setCordX(float x){
        cordX = x;
    }

    public void setCordY(float y){
        cordY = y;
    }

    public float getCordX(){
        return cordX;
    }

    public float getCordY(){
        return cordY;
    }

    public void setColore(Color colore){
        this.colore = colore;
    }

    public Color getColore(){
        return colore;
    }

    public Color getBordo(){
        return bordo;
    }

    public void setBordo(Color colore){
        bordo = colore;
    }
}