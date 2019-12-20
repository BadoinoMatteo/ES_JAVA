import processing.sound.*;
SoundFile file;
private Rect r;
private Neve n;
private Cerchio[] c;
private Text text;
private Triangolo t;
private Line[] l;
private Stella s;
private Rect base;
private Rect sfondo;
public void settings(){
  size(640, 360);  //dimensione finestra
  file = new SoundFile(this, "canzoneNatale.mp3");
  file.play();
}

public void setup() { 
    c = new Cerchio[100];
    l = new Line[4];
   
    background(0,0,0);
    
    color coloreOcchi=color(random(256), random(256), random(256));
    color coloreBocca= color(random(256), random(256), random(256));
    color coloreMano= color(random(256), random(256), random(256));
    color bordi= color(random(256), random(256), random(256));
    color coloreScritta= color(random(256), random(256), random(256));
    
    float CordXFondo=0;
    float CordYFondo=360-100;
    float dimXFondo=width;
    float dimYFondo=100;
    color Fondo=color(255,255,255);
    base = new Rect(CordXFondo, CordYFondo, width, height, color(255,255,255), color(255,255,255));
    sfondo = new Rect(0, 0, width, height, color(0), color(0));
  //---------------------------------------------------------------------------------
    float dimXTronco=50;
    float dimYTronco=70;
    float cordXTronco=(width/2)-(dimYTronco/2);
    float cordYTronco=height-dimYFondo-(dimYTronco/2);
    color coloreTronco= color(75,0,0);
  //---------------------------------------------------------------------------------
    float CordX1Albero=cordXTronco-40;
    float CordY1Albero=cordYTronco;
    float CordX2Albero=cordXTronco+40+dimXTronco;
    float CordY2Albero=cordYTronco;
    float CordX3Albero=310;
    float CordY3Albero=50;
    color coloreAlbero=color(0,93,6);
  //---------------------------------------------------------------------------------
    float CordXPupazzoNatale1=125;
    float CordYPupazzoNatale1=CordYFondo;
    float dimPupazzoNatale1=100;
    color colorePupazzo= color(255,255,255);
    color bordiPupazzo= color(23,56,78);
  //---------------------------------------------------------------------------------
    float CordXPupazzoNatale1_2=125;
    float CordYPupazzoNatale1_2=CordYFondo-dimPupazzoNatale1/2-25;
    float dimPupazzoNatale1_2=70;
  //---------------------------------------------------------------------------------
    float cordXOcchi1_1=CordXPupazzoNatale1_2-15;
    float cordYOcchi1_1=CordYPupazzoNatale1_2-10;
    float dimOcchi=10;
    
  //---------------------------------------------------------------------------------
    float cordXOcchi1_2=CordXPupazzoNatale1_2+15;
    float cordYOcchi1_2=CordYPupazzoNatale1_2-10;
  //---------------------------------------------------------------------------------
    float boccaPupazzo1X=cordXOcchi1_1;;
    float boccaPupazzo1Y=cordYOcchi1_1+20;;
   
  //---------------------------------------------------------------------------------
    float x1_mano1_1=CordXPupazzoNatale1+(dimPupazzoNatale1/2)-5;
    float y1_mano1_1=CordYPupazzoNatale1-25;
    float x2_mano1_1=x1_mano1_1+25;
    float y2_mano1_1=y1_mano1_1-25;
    float x1_mano1_2=CordXPupazzoNatale1-(dimPupazzoNatale1/2)+5;
    float y1_mano1_2=CordYPupazzoNatale1-25;
    float x2_mano1_2=x1_mano1_2-25;
    float y2_mano1_2=y1_mano1_2-25;
    
  //---------------------------------------------------------------------------------
    float CordXPupazzoNatale2=470;
    float CordYPupazzoNatale2=CordYFondo;
    float dimPupazzoNatale2=100;
  //---------------------------------------------------------------------------------
    float CordXPupazzoNatale2_2=470;
    float CordYPupazzoNatale2_2=CordYFondo-dimPupazzoNatale2/2-25;
    float dimPupazzoNatale2_2=70;
  //---------------------------------------------------------------------------------
    float cordXOcchi2_1=CordXPupazzoNatale2_2-15;
    float cordYOcchi2_1=CordYPupazzoNatale2_2-10;
  //---------------------------------------------------------------------------------
    float cordXOcchi2_2=CordXPupazzoNatale2_2+15;
    float cordYOcchi2_2=CordYPupazzoNatale2_2-10;
  //---------------------------------------------------------------------------------
    float boccaPupazzo2X=cordXOcchi2_2-25;
    float boccaPupazzo2Y=cordYOcchi2_2+20;
  //---------------------------------------------------------------------------------
    float x1_mano2_1=CordXPupazzoNatale2+(dimPupazzoNatale2/2)-5;
    float y1_mano2_1=CordYPupazzoNatale2-25;
    float x2_mano2_1=x1_mano2_1+25;
    float y2_mano2_1=y1_mano2_1-25;
    float x1_mano2_2=CordXPupazzoNatale2-(dimPupazzoNatale2/2)+5;
    float y1_mano2_2=CordYPupazzoNatale2-25;
    float x2_mano2_2=x1_mano2_2-25;
    float y2_mano2_2=y1_mano2_2-25;
  //---------------------------------------------------------------------------------
    float cordXScritta=0;
    float cordYScritta=325;
    int size=30;
    String scritta="Buon natale e felice anno nuovo";
   
    r= new Rect(cordXTronco, cordYTronco, dimXTronco, dimYTronco, coloreTronco, coloreTronco);
    n=new Neve();
    t=new Triangolo(CordX1Albero, CordY1Albero, CordX2Albero, CordY2Albero, CordX3Albero, CordY3Albero, coloreAlbero, coloreAlbero);
    
    c[0]=new Cerchio(CordXPupazzoNatale1, CordYPupazzoNatale1, dimPupazzoNatale1, colorePupazzo, color(255,255,255));
    c[1]=new Cerchio(CordXPupazzoNatale1_2, CordYPupazzoNatale1_2, dimPupazzoNatale1_2, colorePupazzo, color(255,255,255));
    c[2]=new Cerchio(cordXOcchi1_1, cordYOcchi1_1, dimOcchi, coloreOcchi, coloreOcchi);
    c[3]=new Cerchio(cordXOcchi1_2, cordYOcchi1_2, dimOcchi, coloreOcchi, coloreOcchi);
    c[4]=new Cerchio(boccaPupazzo1X, boccaPupazzo1Y, 10, coloreBocca, coloreBocca);
    c[5]=new Cerchio(boccaPupazzo1X+13, boccaPupazzo1Y+5, 10, coloreBocca, coloreBocca);
    c[6]=new Cerchio(boccaPupazzo1X+25, boccaPupazzo1Y, 10, coloreBocca, coloreBocca);
    c[7]=new Cerchio(CordXPupazzoNatale2, CordYPupazzoNatale2, dimPupazzoNatale2, colorePupazzo, color(255,255,255));
    c[8]=new Cerchio(CordXPupazzoNatale2_2, CordYPupazzoNatale2_2, dimPupazzoNatale2_2, colorePupazzo, color(255,255,255));
    c[9]=new Cerchio(cordXOcchi2_1, cordYOcchi2_1, dimOcchi, coloreOcchi, coloreOcchi);
    c[10]=new Cerchio(cordXOcchi2_2, cordYOcchi2_2, dimOcchi, coloreOcchi, coloreOcchi);
    c[11]=new Cerchio(boccaPupazzo2X, boccaPupazzo2Y, 10, coloreBocca, coloreBocca);
    c[12]=new Cerchio(boccaPupazzo2X+13, boccaPupazzo2Y+5, 10, coloreBocca, coloreBocca);
    c[13]=new Cerchio(boccaPupazzo2X+25, boccaPupazzo2Y, 10, coloreBocca, coloreBocca);
    
    l[0]=new Line(x1_mano1_1, y1_mano1_1, x2_mano1_1, y2_mano1_1, coloreMano, bordi); 
    l[1]=new Line(x1_mano1_2, y1_mano1_2, x2_mano1_2, y2_mano1_2, coloreMano, bordi); 
    l[2]=new Line(x1_mano2_1, y1_mano2_1, x2_mano2_1, y2_mano2_1, coloreMano, bordi); 
    l[3]=new Line(x1_mano2_2, y1_mano2_2, x2_mano2_2, y2_mano2_2, coloreMano, bordi); 
    text=new Text(size, scritta, cordXScritta, cordYScritta, coloreScritta, coloreScritta);
    s=new Stella();
    delay(1000);
    
}

public void draw(){
  color coloreOcchi=color(random(256), random(256), random(256));
  color coloreBocca= color(random(256), random(256), random(256));
  color coloreMano= color(random(256), random(256), random(256));
  color bordi= color(random(256), random(256), random(256));
  color coloreScritta= color(random(256), random(256), random(256));
  sfondo.show();
  base.show();
  n.show();
//_--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  r.show();
  
  t.show();
  for (int i=0; i<14;i++){
    switch(i) {
        case 0:
        case 1:
        case 7:
        case 8:
          c[i].setColore(color(255,255,255));
          c[i].show();
          break;
        case 2:
        case 3:
        case 9:
        case 10:
          c[i].setColore(coloreOcchi);
          c[i].show();
          break;
        
        case 4:
        case 5:
        case 6:
        case 11:
        case 12:
        case 13:
          c[i].setColore(coloreBocca);
          c[i].show();
          break;
        }
  }
  
  for (int i=0; i<4;i++){
    l[i].setColore(coloreMano);
    l[i].show();
  }
  text.setColore(color(random(256), random(256), random(256)));
  text.setCordX(15);
  text.show();
  s.show();
  s.setColore(color(random(256), random(256), random(256)));
  delay(600);
}
