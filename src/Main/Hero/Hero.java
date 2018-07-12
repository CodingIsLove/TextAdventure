package Main.Hero;

import Main.Enums.Directions;
import Main.Items.Inventar;
import Main.Items.genericItem;
import Main.Rooms.BuildingBlocks.Room;
import Main.Rooms.BuildingBlocks.Wall;
import Main.TextParser.Colorlog;
import Main.Texte.TextStorage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Hero{

    private Inventar inventar;
    private Room aktuellerRaum;

    /**
     * #####################
     * #    Konstruktor    #
     * #####################
     */
    public Hero(Room start){
        this. aktuellerRaum = start;
        this.inventar = new Inventar();
    }

    /**####################
     * #Setter Funktionen #
     * ####################
     */

    public void changeRoom(){
        this.aktuellerRaum = aktuellerRaum.getFocusedWall().useDoor();
    }

    public void changeRoom(Directions direction){
        aktuellerRaum.setFocusedDirection(direction);
        this.aktuellerRaum = aktuellerRaum.getFocusedWall().useDoor();
    }

    public void openKiste(){
        inventar.addItem(aktuellerRaum.openKiste());
    }
    public void openKiste(int code){
        inventar.addItem(aktuellerRaum.openKiste(code));
    }

    /**####################
     * #Getter funktionen #
     * ####################
     */

    public Room getAktuellerRaum(){
        return aktuellerRaum;
    }
    public void logInventar(){
        inventar.logInventar();
    }

    public ArrayList<genericItem> getInventar(){
        return inventar.getInventar();
    }


    /**
     * ################################
     * #    Help functions            #
     * ################################ // TODO: schreiben der Help functions
     */






}
