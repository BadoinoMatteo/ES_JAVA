private Cerchio c;
   
 //metodo per la definizione della dimensioen della finestra
public void settings(){
  size(600, 300);  //dimensione finestra
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
    delay(100);
                       
   //stampa a console                   
    println("colore: ", red(c.getColore()), "-",
                      green(c.getColore()), "-",
                      blue(c.getColore()));
}
