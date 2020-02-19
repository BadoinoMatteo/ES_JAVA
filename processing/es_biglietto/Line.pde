public class Line {
  private float x1;
  private float y1;
  private float x2;
  private float y2;
  private color colore;
  private color bordi;
  
  public Line(float x1, float y1, float x2, float y2, color colore, color bordi){
    this.x1=x1 ;  
    this.y1 = y1;
    this.x2=x2 ;  
    this.y2 = y2;
    this.colore = colore;
    this.bordi = bordi;
  }
  
  public void show(){
    stroke(bordi);  //colore bordo
    fill(colore);  //colore di riempimento
    line(x1, y1, x2, y2);  //centro X,Y e diametro dim
  }
  
  public void setCordX1(float x){
    x1 = x;
  }
  
   public void setCordY1(float y){
    y1 = y;
  }
  
  public float getCordX1(){
    return x1;
  }
  
   public float getCordY1(){
    return y1;
  }
  
  public void setCordX2(float x){
    x2 = x;
  }
  
   public void setCordY2(float y){
    y2 = y;
  }
  
  public float getCordX2(){
    return x2;
  }
  
   public float getCordY2(){
    return y2;
  }
  public void setColore(color colore){
    this.colore = color(colore);
    bordi = colore;
  }
  
  public color getColore(){
    return colore;
  }
  
  public color getBordo(){
    return bordi;
  }
  
  public void setBordo(color colore){
    bordi = colore;
  }
}
