import processing.core.PApplet;
import processing.core.PImage;

public class ting {


    //Tings position
    float x, y;
    float colorR = 100;
    PApplet p;


    ting(PApplet p, float inputX, float inputY){
        x = p.random(0,p.width);
        y = p.random(0,p.height);
        this.p = p;
    }

    void tegn(){
        p.ellipse(x,y,30,30);
    }

    void flyv(){
        //Opgave 4: Her skal du skrive kode der flytter "Ting"
        //ps: Husk de må ikke flytte sig uden for skærmen...


    }




}