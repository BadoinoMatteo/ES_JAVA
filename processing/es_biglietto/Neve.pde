public class Neve {
  private int quantity = 1000;
  private float [] xPosition = new float[quantity];
  private float [] yPosition = new float[quantity];
  private int [] flakeSize = new int[quantity];
  private int [] direction = new int[quantity];
  private int minFlakeSize = 1;
  private int maxFlakeSize = 5;
   
  public Neve(){
    frameRate(30);
    noStroke();
    smooth();
    
    for(int i = 0; i < quantity; i++) {
      flakeSize[i] = round(random(minFlakeSize, maxFlakeSize));
      xPosition[i] = random(0, width);
      yPosition[i] = random(0, height);
      direction[i] = round(random(0, 1));
    }
  }
  
  public void show(){
    fill(255,255,255);
    stroke(255,255,255);
    for(int i = 0; i < xPosition.length; i++) {
      ellipse(xPosition[i], yPosition[i], flakeSize[i], flakeSize[i]);
      if(direction[i] == 0) {
        xPosition[i] += map(flakeSize[i], minFlakeSize, maxFlakeSize, .1, .5);
      }else{
        xPosition[i] -= map(flakeSize[i], minFlakeSize, maxFlakeSize, .1, .5);
      }
      
      yPosition[i] += flakeSize[i] + direction[i]; 
      
      if(xPosition[i] > width + flakeSize[i] || xPosition[i] < -flakeSize[i] || yPosition[i] > height + flakeSize[i]) {
        xPosition[i] = random(0, width);
        yPosition[i] = -flakeSize[i];
      }
    }
  }
}
