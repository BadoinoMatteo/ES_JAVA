private Cerchio c;
private Rect r;
 //metodo per la definizione della dimensioen della finestra
public void settings(){
  size(640, 360);  //dimensione finestra
}

//metodo eseguito una sola volta per le inizializzazioni
public void setup() {  
    background(0,255,255);  //sfondo azzurro
    
}
  
//metodo eseguito finchè non si chiude la finestra  
public void draw(){
    c = new Cerchio();
    c.setColore(color(random(256), random(256), random(256))); 
    c.show();
    r=new Rect();
    r.show();
  delay(1000);
}
