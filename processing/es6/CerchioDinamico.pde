public class CerchioDinamico extends Cerchio{
  private float speedX;
  private float speedY;
  
  public CerchioDinamico(){
    super();
    speedX=10;
    speedY=1;
  }
  
  public void move(){
    setCordX(getCordX()+speedX);
    setCordY(getCordY()+speedY);
  }

}
