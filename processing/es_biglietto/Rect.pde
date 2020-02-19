public class Rect {
  private float dimx;   //diametro cerchio
  private float dimy;
  private final static int DIM_DEFAULT_LUNGHEZZA = 250;
  private final static int DIM_DEFAULT_ALTEZZA = 100;
  private float cordX;  //coordinate del centro
  private float cordY;
  private color colore;  //colore riempimento
  private color bordo;   //colore bordo
   
  public Rect(float cordX, float cordY, float dimX, float dimY, color colore, color bordi){ 
    //colore di default bianco con bordo nero
    this.cordX = cordX ;  
    this.cordY = cordY;
    this.colore = colore;
    this.bordo = bordi;
    this.dimx = dimX;
    this.dimy = dimY;
  }
  
  public void show(){
    stroke(bordo);  //colore bordo
    fill(colore);  //colore di riempimento
    rect(cordX, cordY, dimx, dimy);  //centro X,Y e diametro dim
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
  
  public float getdimx(){
    return dimx;
  }
  
  public float getdimy(){
    return dimy;
  }
  
  public void setdimx(float dimx){
    this.dimx=dimx;
  }
  
  public void setdimy(float dimy){
    this.dimy=dimy;
  }
  
}
