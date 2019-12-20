public class Cerchio {
  private float dim;   //diametro cerchio
  private final static int DIM_DEFAULT = 100;
  private float cordX;  //coordinate del centro
  private float cordY;
  private color colore;  //colore riempimento
  private color bordo;   //colore bordo
   
  public Cerchio(){ 
    //colore di default bianco con bordo nero
    cordX=640/2;
    cordY=360/2;
    colore = color(random(256), random(256), random(256));
    bordo = color(random(256), random(256), random(256));
    dim = DIM_DEFAULT;
  }
  
  public void show(){
    stroke(bordo);  //colore bordo
    fill(colore);  //colore di riempimento
    circle(cordX, cordY, dim);  //centro X,Y e diametro dim
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
  
  public void setColore(color colore){
    this.colore = color(colore);
  }
  
  public color getColore(){
    return colore;
  }
  
  public color getBordo(){
    return bordo;
  }
  
  public void setBordo(color colore){
    bordo = colore;
  }
}
