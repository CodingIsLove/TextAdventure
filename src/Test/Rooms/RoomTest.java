package Test.Rooms;

import Main.Enums.Directions;
import Main.Rooms.AllLevels;
import Main.Rooms.BuildingBlocks.Room;
import Main.Rooms.BuildingBlocks.Wall;
import Main.Texte.TextStorage;
import com.sun.org.apache.bcel.internal.generic.ALOAD;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/***
 * Einfacher Test, ob die Funktionen des Raumes funktionieren
 */

public class RoomTest {

    @Test
    public void getRoomDescription() {
        assertEquals(TextStorage.ROOM_NAME_WELLE7,AllLevels.welle7.getRoomName());
    }

    @Test
    public void setRoomDirection(){

        Room currentRoom = AllLevels.welle7;

        //Setzten erster Raumrichtung und auslesen
        currentRoom.setFocusedDirection(Directions.NORTH);
        assertEquals(Directions.NORTH, currentRoom.getFocusedDirection());

    }

    @Test
    public void getRoomName() {

        Room currentRoom = AllLevels.bahnhof;

        assertEquals(TextStorage.ROOM_NAME_PLATFORM, currentRoom.getRoomName());
    }

    @Test
    public void wallInfos(){
        Room currentRoom = AllLevels.bahnhof;

        // Schauen, ob die Infos zu allen Wänden
        assertEquals(TextStorage.WALL_NAME_PLATFORM, currentRoom.wallInfos(Directions.NORTH));
        assertEquals(TextStorage.WALL_NAME_PLATFORM, currentRoom.wallInfos(Directions.SOUTH));
        assertEquals(TextStorage.WALL_NAME_ESCALATOR, currentRoom.wallInfos(Directions.EAST));
        assertEquals(TextStorage.WALL_NAME_DEAD_END, currentRoom.wallInfos(Directions.WEST));

    }

    @Test
    public void changeRoom() {

        Room currentRoom = AllLevels.welle7;
        currentRoom.getRoomHelp();


    }

    @Test
    public void getNiceRoomDescription(){
        Room currentRoom = AllLevels.bahnhof;

        // Console log einer schönen beschreibung
        currentRoom.getRoomHelp();
        currentRoom.setFocusedDirection(Directions.WEST);
        currentRoom.getFocusedWall().useDoor();
        System.out.println("-------------- Room should be switched now ----------------");
        currentRoom.getRoomHelp();
    }


    @Test
    public void looking_door(){

        /**
         * Beispiel Wall == Türe*/
      // Beispiel am Raum: Etage2:
        Room etage2 = AllLevels.etage2;

        // Erst ein überblick verschaffen
        etage2.getRoomHelp();

        System.out.println("--------------------");

        // In richtung des Studienraums schauen
        etage2.look(Directions.NORTH);

        // beschreibung dieser Richtung
        etage2.inspect();
        etage2.look();
    }

    @Test
    public void looking_wall(){

        Room bhf = AllLevels.bahnhof;

        bhf.look(Directions.NORTH);
        System.out.println("-----------------------");

        //Checken der essentiellen Funktionen
        bhf.look();
        bhf.inspect();

        // Dies sollte eine Fehlermeldung triggern!
        bhf.openKiste();
    }

    @Test
    public void looking_box(){
        Room welle = AllLevels.welle7;
        welle.look(Directions.SOUTH);

        //nochmals schauen
        welle.look();
        welle.inspect();

        //interact
        assertEquals(null, welle.openKiste());
        assertEquals(AllLevels.linalg, welle.openKiste(10));
        assertEquals(null,welle.openKiste());
    }




}