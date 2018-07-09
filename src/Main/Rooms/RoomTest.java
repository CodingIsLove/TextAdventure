package Main.Rooms;

import Main.Enums.Directions;
import org.junit.Test;

import static org.junit.Assert.*;

/***
 * Einfacher Test, ob die Funktionen des Raumes funktionieren
 */

public class RoomTest {

    @Test
    public void getRoomDescription() {
        //Erstellen des nächsten Raumes
        Wall nordWand = new Wall();
        Wall suedWand = new Wall();
        Wall ostWand = new Wall();
        Wall westWand = new Wall();
        Room welle7 = new Room(nordWand,suedWand,ostWand,westWand,Directions.NORTH,"Welle 7","Hier befindest du dich in der Welle 7");

        assertEquals("Hier befindest du dich in der Welle 7", welle7.getRoomDescription());
    }

    @Test
    public void setRoomDirection(){

        Wall nordWand = new Wall();
        Wall suedWand = new Wall();
        Wall ostWand = new Wall();
        Wall westWand = new Wall();
        Room welle7 = new Room(nordWand,suedWand,ostWand,westWand,Directions.NORTH,"Welle 7","Hier befindest du dich in der Welle 7");

        //Setzten erster Raumrichtung und auslesen
        welle7.setFocusedDirection(Directions.NORTH);
        assertEquals(Directions.NORTH, welle7.getFocusedDirection());

        //Setzen zweiter Raumrichtung und auslesen
        welle7.setFocusedDirection(Directions.WEST);
        assertEquals(Directions.WEST, welle7.getFocusedDirection());
    }

    @Test
    public void getRoomName() {
        //Erstellen des nächsten Raumes
        Wall nordWand = new Wall();
        Wall suedWand = new Wall();
        Wall ostWand = new Wall();
        Wall westWand = new Wall();

        //Auslesen des Raumnames
        Room welle7 = new Room(nordWand,suedWand,ostWand,westWand,Directions.NORTH,"Welle 7","Hier befindest du dich in der Welle 7");
        assertEquals("Welle 7", welle7.getRoomName());
    }

    @Test
    public void wallInfos(){
        //Erstellen des nächsten Raumes
        Wall nordWand = new Wall("Diese Wand befindet sich im Norden");
        Wall suedWand = new Wall("Diese Wand befindet sich im Süden");
        Wall ostWand = new Wall("Diese Wand befindet sich im Osten");
        Wall westWand = new Wall("Diese Wand befindet sich im Westen");
        Room welle7 = new Room(nordWand,suedWand,ostWand,westWand,Directions.NORTH,"Welle 7","Hier befindest du dich in der Welle 7");

        // Schauen, ob die Infos zu allen Wänden
        assertEquals("Diese Wand befindet sich im Norden", welle7.wallInfos(Directions.NORTH));
        assertEquals("Diese Wand befindet sich im Süden", welle7.wallInfos(Directions.SOUTH));
        assertEquals("Diese Wand befindet sich im Osten", welle7.wallInfos(Directions.EAST));
        assertEquals("Diese Wand befindet sich im Westen", welle7.wallInfos(Directions.WEST));

    }

    @Test
    public void interactWithWall() {
    }

    @Test
    public void getNiceRoomDescription(){
        //Erstellen des nächsten Raumes
        Wall nordWand = new Wall("Diese Wand befindet sich im Norden");
        Wall suedWand = new Wall("Diese Wand befindet sich im Süden");
        Wall ostWand = new Wall("Diese Wand befindet sich im Osten");
        Wall westWand = new Wall("Diese Wand befindet sich im Westen");
        Room welle7 = new Room(nordWand,suedWand,ostWand,westWand,Directions.NORTH,"Welle 7","Hier befindest du dich in der Welle 7");

        // Console log einer schönen beschreibung
        welle7.getRoomHelp();

    }
}