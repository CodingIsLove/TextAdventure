package Main.Rooms;

import Main.Enums.Directions;
import Main.Enums.KeyWords;
import Main.TextParser.Colorlog;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;

import java.awt.*;
import java.net.CookieHandler;

public class Room {

    private String roomName;
    private String roomDescription;
    private Wall nordWand;
    private Wall suedWand;
    private Wall ostWand;
    private Wall westWand;
    private Directions focusedDirection;  // Sollte einziger parameter mit Setter Funktion sein
    // TODO: überlegen, wie ich genau die Map implementieren will... ein multiline String villeicht ?


/**
 * ################################
 * #        Raumkonstruktor       #
 * ################################
 */
    /**
     * Konstruktor für einen Raum. Zu einem Raum gehören die 4 Wände. Damit der Spieler Jeweils mit den Wänden interagieren kann, muss er dazu eine fokusieren.
     * Die Fokusierte Wand wird
     * @param nordWand Definition der Nordwand
     * @param suedWand Definition der Südwand
     * @param ostWand Definition der Ostwand
     * @param westWand Definition der Westwand
     * @param direction Enum das angibt welche Wand zu fokusieren ist
     * @param roomName Name des Raumes
     * @param roomDescription Beschreibung des Raumes
     */
    public Room(Wall nordWand, Wall suedWand, Wall ostWand, Wall westWand,Enum<Directions> direction, String roomName, String roomDescription){
        //Definieren der Wände
        this.nordWand = nordWand;
        this.suedWand = suedWand;
        this.ostWand = ostWand;
        this.westWand = westWand;

        //Eigenschaften Deklarieren
        this.roomName = roomName;
        this.roomDescription = roomDescription;

        //Festlegen der Fokusierten
        if(direction == Directions.NORTH){
            this.focusedDirection = Directions.NORTH;

        }else if(direction == Directions.EAST){
            this.focusedDirection = Directions.EAST;

        }else if(direction == Directions.SOUTH){
            this.focusedDirection = Directions.SOUTH;
        }else{
            this.focusedDirection = Directions.WEST;
        }
    }

    /**######################################
     * #     Allgemeine Raumfunktionen      #
     * ######################################*/


    // Getter functions
    public String getRoomDescription(){
        return roomDescription;
    }
    public String getRoomName(){
        return roomName;
    }
    public Directions getFocusedDirection(){
        return focusedDirection;
    }


    // Setter functions
    public void setFocusedDirection(Directions focusedDirection){
        this.focusedDirection = focusedDirection;
    }


    /**
     * Gibt eine Beschreibung des Ganzen Raumes
     */
    public void getRoomHelp(){
        Colorlog.white("Du befindest dich im Raum: ");
        Colorlog.blue(roomName);
        Colorlog.white("\n");
        Colorlog.white("Nach einer kurzen Inspektion notierst du: \n");

        //Beschreibungen Norden
        Colorlog.green("Im Norden: \n");
        Colorlog.cyan("---> ");
        Colorlog.white(nordWand.getWallDescription());
        Colorlog.white("\n");

        //Beschreibungen Osten
        Colorlog.green("Im Osten: \n");
        Colorlog.cyan("---> ");
        Colorlog.white(ostWand.getWallDescription());
        Colorlog.white("\n");

        //Beschreibungen Süden
        Colorlog.green("Im Süden: \n");
        Colorlog.cyan("---> ");
        Colorlog.white(suedWand.getWallDescription());
        Colorlog.white("\n");

        //Beschreibungen West
        Colorlog.green("Im Westen: \n");
        Colorlog.cyan("---> ");
        Colorlog.white(westWand.getWallDescription());
        Colorlog.white("\n");


    }

    /**
     * Diese Funktion gibt Informationen zu den Unterschiedlichen Wänden
     * @param direction ist ein Enum, welches eines von 4 Werten annehmen kann {NORTH, EAST, SOUTH, WEST}
     * @return Die Funktion gibt die Beschreibung der entsprechenden Wand zurück
     */
    public String wallInfos(Enum<Directions> direction){

        if(direction == Directions.NORTH){
            return nordWand.getWallDescription();

        }else if(direction == Directions.EAST){
            return ostWand.getWallDescription();

        }else if(direction == Directions.SOUTH){
            return suedWand.getWallDescription();

        }else if(direction == Directions.WEST){
            return westWand.getWallDescription();

        }else{
            Colorlog.white("Shit something went wrong");
            return "";
        }
    }

    public String wallInfos(){
        return wallInfos(this.focusedDirection);
    }


    //************************** Arbeiten mit der Fokusierten Wand *************************************


    /***
     * interactWithWall ist eine weitläufige Funktion. Sie unterscheidet, bei den unterschiedlichen Wänden
     * und führt die auf die Wand passende Funktion aus.
     */
    public void interactWithWall(){

    }

    public void interactWithRoom(KeyWords keyword){


    }


    /***
     * TODO:
     * Sauber überlegen, wie genau mit einem Raum interagiert werden kann
     */

}

