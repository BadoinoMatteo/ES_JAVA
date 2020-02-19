import java.awt.*;

public class Figura {
    public float cordX;
    public float cordY;
    public Color colore;
    public Color bordi;

     Figura(float cordX, float cordY, Color colore, Color bordi){
        this.cordX= this.cordX;
        this.cordY= this.cordY;
        this.colore= this.colore;
        this.bordi= this.bordi;
    }

    public Color getBordi() {
        return bordi;
    }

    public Color getColore() {
        return colore;
    }

    public float getCordX() {
        return cordX;
    }

    public float getCordY() {
        return cordY;
    }

    public void setBordi(Color bordi) {
        this.bordi = bordi;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public void setCordX(float cordX) {
        this.cordX = cordX;
    }

    public void setCordY(float cordY) {
        this.cordY = cordY;
    }
}
