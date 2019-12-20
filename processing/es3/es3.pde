private Cerchio c;
int numCerchiX=2;
int numCerchiY=2;
 //metodo per la definizione della dimensioen della finestra
public void settings(){
  size(1000, 1000);  //dimensione finestra
}

//metodo eseguito una sola volta per le inizializzazioni
public void setup() {  
    background(0,240,200);  //sfondo azzurro
    
}
  
//metodo eseguito finchè non si chiude la finestra  
public void draw(){
  float cordX=1000/(numCerchiX*2);
  float cordY=1000/(numCerchiX*2);
  for(int cont=0;cont<numCerchiX;cont++){
    c = new Cerchio();
    c.setCordX(cordX);
    c.setCordY(cordY);
    c.setColore(color(random(256), random(256), random(256))); 
    c.show();
    cordX=cordX+150;
  }
  cordY=cordY+200;
  cordX=cordX-150;
  for(int cont=0;cont<numCerchiY;cont++){
    c = new Cerchio();
    c.setCordX(cordX);
    c.setCordY(cordY);
    c.setColore(color(random(256), random(256), random(256))); 
    c.show();
    cordX=cordX-150;
  }
  delay(1000);
    
}
