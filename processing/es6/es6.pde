private Cerchio c;
private CerchioDinamico cd;
//metodo per la definizione della dimensioen della finestra
public void settings(){
  size(640, 360);  //dimensione finestra
}

//metodo eseguito una sola volta per le inizializzazioni
public void setup() {  
    background(0,255,255);  //sfondo azzurro
    cd=new CerchioDinamico();
}

public void draw(){
    
    c.setColore(color(random(256), random(256), random(256))); 
    cd.move();
    c.show();
    delay(100);
}
