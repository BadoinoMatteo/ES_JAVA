public class Cerchio {
  private float dim;   //diametro cerchio
  private final static int DIM_DEFAULT = 10;
  private float cordX;  //coordinate del centro
  private float cordY;
  private color colore;  //colore riempimento
  private color bordo;   //colore bordo
   
  public Cerchio(float cordX, float cordY, float dim, color colore, color bordi){
    this.cordX = cordX ;  
    this.cordY = cordY;
    this.colore = colore;
    this.bordo = bordi;
    this.dim=dim;
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
    bordo = colore;
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
