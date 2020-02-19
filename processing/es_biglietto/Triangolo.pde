public class Triangolo {
  private float cordX1;  //coordinate del centro
  private float cordY1;
  private float cordX2;  //coordinate del centro
  private float cordY2;
  private float cordX3;  //coordinate del centro
  private float cordY3;
  private color colore;  //colore riempimento
  private color bordo;   //colore bordo
   
  public Triangolo(float cordX1, float cordY1, float cordX2, float cordY2, float cordX3, float cordY3, color colore, color bordi){ 
    //colore di default bianco con bordo nero
    this.cordX1 = cordX1 ;  
    this.cordY1 = cordY1;
    this.cordX2 = cordX2 ;  
    this.cordY2 = cordY2;
    this.cordX3 = cordX3 ;  
    this.cordY3 = cordY3;
    this.colore = colore;
    this.bordo = bordi;
  }
  
  public void show(){
    stroke(bordo);  //colore bordo
    fill(colore);  //colore di riempimento
    triangle(cordX1, cordY1, cordX2, cordY2, cordX3, cordY3);  //centro X,Y e diametro dim
  }
  
  public void setCordX1(float x){
    cordX1 = x;
  }
  
   public void setCordY1(float y){
    cordY1 = y;
  }
  
  public float getCordX1(){
    return cordX1;
  }
  
   public float getCordY1(){
    return cordY1;
  }
  
  public void setCordX2(float x){
    cordX2 = x;
  }
  
   public void setCordY2(float y){
    cordY2 = y;
  }
  
  public float getCordX2(){
    return cordX2;
  }
  
   public float getCordY2(){
    return cordY2;
  }
  
  public void setCordX3(float x){
    cordX3 = x;
  }
  
   public void setCordY3(float y){
    cordY3 = y;
  }
  
  public float getCordX3(){
    return cordX3;
  }
  
   public float getCordY3(){
    return cordY3;
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
