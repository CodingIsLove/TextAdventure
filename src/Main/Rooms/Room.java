package Main.Rooms;

import Main.Enums.Directions;
import Main.TextParser.Colorlog;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;

import java.awt.*;

public class Room {

    private String roomName;
    private String roomDescription;
    private Wall nordWand;
    private Wall suedWand;
    private Wall ostWand;
    private Wall westWand;
    private Wall focusedWall;



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
            this.focusedWall = this.nordWand;

        }else if(direction == Directions.EAST){
            this.focusedWall = this.ostWand;

        }else if(direction == Directions.SOUTH){
            this.focusedWall = this.suedWand;
        }else{
            this.focusedWall = this.ostWand;
        }
    }


    //******************************** Allgemeine Raumfunktionen ********************************
    /**
     * Erhalten der Raumbeschreibung
     */
    public String getRoomDescription(){
        return roomDescription;
    }

    /**
     * Erhalten des Raumnamens
     */
    public String getRoomName(){
        return roomName;
    }

    /**
     * Diese Funktion gibt Informationen zu den Unterschiedlichen Wänden
     * @param direction ist ein Enum, welches eines von 4 Werten annehmen kann {NORTH, EAST, SOUTH, WEST}
     * @return Die Funktion gibt die Beschreibung der entsprechenden Wand zurück
     */
    public String wallInfos(Enum<Directions> direction){

        if(direction == Directions.NORTH){
            return nordWand.inspectWall();

        }else if(direction == Directions.EAST){
            return ostWand.inspectWall();

        }else if(direction == Directions.SOUTH){
            return suedWand.inspectWall();

        }else if(direction == Directions.WEST){
            return westWand.inspectWall();

        }else{
            Colorlog.white("Shit something went wrong");
            return "";
        }
    }


    //************************** Arbeiten mit der Fokusierten Wand *************************************


    /***
     * interactWithWall ist eine weitläufige Funktion. Sie unterscheidet, bei den unterschiedlichen Wänden
     * und führt die auf die Wand passende Funktion aus.
     */
    public void interactWithWall(){

    }


}
