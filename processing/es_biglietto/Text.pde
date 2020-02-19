public class Text{
  private int size;
  private String Text;
  private float cordX;
  private float cordY;
  private color coloreScritta;
  private color bordi;
  
  public Text(int size, String Text, float cordX, float cordY, color colore, color bordi){
    this.size=size;
    this.Text=Text;
    this.cordX=cordX;
    this.cordY=cordY;
    this.coloreScritta=colore;
    this.bordi=bordi;
  }
  
  public void show(){
    textSize(size);
    fill(coloreScritta);
    text(Text, cordX, cordY);
  }
    
  public  void  setCordX (float cordX ) {
    this.cordX = this.cordX + cordX;
    if ( this.cordX >= 600 ) {
      this.cordX = 5 ;
    }
  }
  
  public float getCordX(){
    return cordX;
  }
  
  public void setColore(color colore){
    this.coloreScritta=colore;
  }
  
  
}
