import processing.core.PApplet;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main extends PApplet{
    //....Denne variabel kan bruges til at
    static PApplet p;

    //Denne liste SKAL indholde alle de "Ting", der er på skærmen!
    ting[] listeTing = new ting[20];

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    @Override
    public void settings() {
        super.settings();
        size(500,500);

        //...Alle processing kommandoer er nu inde i p....
        p = this;

        for(int i = 0; i < 20; i++){
            listeTing[i] = new ting(this, 300, 300);
            println(i);
        }
        //Opgave 1 : Her skal du oprette listen "listeTing" med plads til 20 ting

        //Opgave 5 : Her skal du skrive kode der laver alle "Ting"


    }

    public void draw(){
        //... Eksempel på processing kommando (som den bør bruges i andre klasser!!)
        //Main.p.fill(200,200,200);
        //Main.p.rect(10,10,480,480);

        //OPGAVE 8 (SVÆR) : Her skal du skrive kode der ændrer farven til rød din "Ting"  rører ved musen...


        //Opgave 6 : Her skal du skrive kode, der tegner alle "Ting"
        //ps: Du SKAL kalde "tegn metoden" på ALLE "Ting"



        //Opgave 7 : Her skal du skrive kode, der får alle "Ting" til at flytte sig
        //ps: DU SKAL kalde "

        for (int i = 0; i < 20; i++) {
            ting f = listeTing[i];
            f.tegn();

        }





        //EKSPERT 2:
        //Hvis to ting rører hinanden skal de blive blå!

    }



}