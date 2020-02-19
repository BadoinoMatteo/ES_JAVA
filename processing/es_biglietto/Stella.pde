public class Stella{
  float cordX;
  float cordY;
  color colore;
  color bordi;
  float dimUno;
  float dimX1;
  float dimY1;
  
  public Stella(){
    cordX = 310;
    cordY = 50;
    colore = color(random(256), random(256), random(256));
    bordi = color(random(256), random(256), random(256));
    dimX1 = 20;
    dimY1 = 40;
  }
  
   public void show(){
    stroke(bordi);
    fill(colore);
    pushMatrix();
    translate(cordX, cordY);
    rotate(frameCount / 20.0);
    star(0, 0, dimY1, dimX1, 10); 
    popMatrix();
  }
  
  void star(float x, float y, float radius1, float radius2, int npoints) {
  float angle = TWO_PI / npoints;
  float halfAngle = angle/2.0;
  beginShape();
  for (float a = 0; a < TWO_PI; a += angle) {
    float sx = x + cos(a) * radius2;
    float sy = y + sin(a) * radius2;
    vertex(sx, sy);
    sx = x + cos(a+halfAngle) * radius1;
    sy = y + sin(a+halfAngle) * radius1;
    vertex(sx, sy);
  }
  endShape(CLOSE);
}

  public void setColore(color colore){
    this.colore=colore;
  }
}
