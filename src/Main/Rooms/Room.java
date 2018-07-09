package Main.Rooms;

import Main.Enums.Directions;
import Main.Enums.KeyWords;
import Main.TextParser.Colorlog;
import Main.Texte.TextStorage;
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
        Colorlog.white(TextStorage.ROOM_LOCATION);
        Colorlog.blue(roomName);
        Colorlog.white(TextStorage.LINEBREAK);
        Colorlog.white(TextStorage.ROOM_INSPECTION_NOTATION);

        //Beschreibungen Norden
        Colorlog.green(TextStorage.DIRECTION_NORTH);
        Colorlog.cyan(TextStorage.RIGHTARROW);
        Colorlog.white(nordWand.getWallDescription());
        Colorlog.white(TextStorage.LINEBREAK);

        //Beschreibungen Osten
        Colorlog.green(TextStorage.DIRECTION_EAST);
        Colorlog.cyan(TextStorage.RIGHTARROW);
        Colorlog.white(ostWand.getWallDescription());
        Colorlog.white(TextStorage.LINEBREAK);

        //Beschreibungen Süden
        Colorlog.green(TextStorage.DIRECTION_SOUTH);
        Colorlog.cyan(TextStorage.RIGHTARROW);
        Colorlog.white(suedWand.getWallDescription());
        Colorlog.white(TextStorage.LINEBREAK);

        //Beschreibungen West
        Colorlog.green(TextStorage.DIRECTION_WEST);
        Colorlog.cyan(TextStorage.RIGHTARROW);
        Colorlog.white(westWand.getWallDescription());
        Colorlog.white(TextStorage.LINEBREAK);


    }

    /**
     * Diese Funktion gibt Informationen zu den Unterschiedlichen Wänden
     * @param direction ist ein Enum, welches eines von 4 Werten annehmen kann {NORTH, EAST, SOUTH, WEST}
     * @return Die Funktion gibt die Beschreibung der entsprechenden Wand zurück
     */
    public String wallInfos(Directions direction){
        String output;
        switch (direction) {
            case NORTH:
                output = nordWand.getWallDescription();
                break;
            case EAST:
                output = ostWand.getWallDescription();
                break;
            case SOUTH:
                output = suedWand.getWallDescription();
                break;
            case WEST:
                output = westWand.getWallDescription();
                break;
            default:
                output = TextStorage.OOPS;
        }
        return output;
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

