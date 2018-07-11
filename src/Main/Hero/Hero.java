package Main.Hero;

import Main.Items.Inventar;
import Main.Items.genericItem;
import Main.Rooms.BuildingBlocks.Room;
import Main.Rooms.BuildingBlocks.Wall;
import Main.TextParser.Colorlog;
import Main.Texte.TextStorage;

import java.util.concurrent.TimeUnit;

public class Hero{

    private String name;
    private Inventar inventar;
    private Room aktuellerRaum;

    /**
     * #####################
     * #    Konstruktor    #
     * #####################
     */
    public Hero(String name, Room start){
        this.name = name;
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
    public void getInventar(){
        inventar.getInventar();
    }
    public String getName(){
        return name;
    }

    /**
     * ################################
     * #    Help functions            #
     * ################################
     */
}
